package ru.vkopyl.test.weatherapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vkopyl.test.weatherapp.service.RestService;

@RestController
public class WeatherController {

    private String url = "http://api.weatherbit.io/v2.0/forecast/daily?key=368f56f6fdcb4ed68776b6c43b080540&city=novosibirsk";
    private RestService restService;

    @Autowired
    public WeatherController(RestService restService){
        this.restService = restService;
    }

    @GetMapping("/getweather")
    void getWeatherFromApi(){
        System.out.println(restService.getWeatherJson(url));

    }



}
