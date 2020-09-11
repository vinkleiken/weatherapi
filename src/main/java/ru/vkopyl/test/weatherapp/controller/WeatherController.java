package ru.vkopyl.test.weatherapp.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vkopyl.test.weatherapp.dao.ResponseDataDaoImpl;
import ru.vkopyl.test.weatherapp.model.ResponseData;
import ru.vkopyl.test.weatherapp.service.RestService;
import ru.vkopyl.test.weatherapp.service.WeatherParser;

import java.util.List;

@RestController
public class WeatherController {

    private final String url = "http://api.weatherbit.io/v2.0/forecast/daily?key=368f56f6fdcb4ed68776b6c43b080540&city=novosibirsk";
    private final RestService restService;
    private final WeatherParser weatherParser;
    private final ResponseDataDaoImpl responseDataDaoImpl;

    @Autowired
    public WeatherController(RestService restService, WeatherParser weatherParser, ResponseDataDaoImpl responseDataDaoImpl){

        this.weatherParser = weatherParser;
        this.restService = restService;
        this.responseDataDaoImpl = responseDataDaoImpl;
    }

    @GetMapping("/getweather")
    public ResponseData getWeatherFromApi() throws JsonProcessingException {
        String responseJson = restService.getWeatherJson(url);
        ResponseData response = weatherParser.modifyData(weatherParser.parseWeather(responseJson));
        responseDataDaoImpl.insert(response);
        System.out.println(response);
        return  response;
    }

}
