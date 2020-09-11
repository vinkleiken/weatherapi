package ru.vkopyl.test.weatherapp.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder){

        this.restTemplate = restTemplateBuilder.build();
    }

    public String getWeatherJson(String url){

        return this.restTemplate.getForObject(url, String.class);
    }


}
