package ru.vkopyl.test.weatherapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vkopyl.test.weatherapp.model.WeatherData;
import ru.vkopyl.test.weatherapp.model.WeatherDataList;

import java.util.List;

@Service
public class WeatherParser {

    private final ObjectMapper mapper;

    @Autowired
    public WeatherParser(ObjectMapper mapper){
        this.mapper = mapper;
    }

    List<WeatherData> parseWeather(String weatherJson) throws JsonProcessingException {
        WeatherDataList weatherDataList = mapper.readValue(weatherJson, WeatherDataList.class);
        return weatherDataList.getData();
    }



}
