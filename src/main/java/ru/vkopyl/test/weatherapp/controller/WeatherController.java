package ru.vkopyl.test.weatherapp.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vkopyl.test.weatherapp.model.WeatherData;
import ru.vkopyl.test.weatherapp.model.WeatherDataList;
import ru.vkopyl.test.weatherapp.service.RestService;
import ru.vkopyl.test.weatherapp.service.WeatherParser;

import java.util.List;

@RestController
public class WeatherController {

    private final String url = "http://api.weatherbit.io/v2.0/forecast/daily?key=368f56f6fdcb4ed68776b6c43b080540&city=novosibirsk";
    private final RestService restService;
    private final WeatherParser weatherParser;

    @Autowired
    public WeatherController(RestService restService, WeatherParser weatherParser){

        this.weatherParser = weatherParser;
        this.restService = restService;
    }

    @GetMapping("/getweather")
    void getWeatherFromApi(){
        String responseJson = restService.getWeatherJson(url);

    }



}
