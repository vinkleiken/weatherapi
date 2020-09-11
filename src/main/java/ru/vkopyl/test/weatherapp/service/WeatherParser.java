package ru.vkopyl.test.weatherapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vkopyl.test.weatherapp.model.ResponseData;
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

    public List<WeatherData> parseWeather(String weatherJson) throws JsonProcessingException {
        WeatherDataList weatherDataList = mapper.readValue(weatherJson, WeatherDataList.class);
        return weatherDataList.getData();
    }

    public ResponseData modifyData(List<WeatherData> weatherDataList){
        ResponseData responseData = new ResponseData();
        double maxAvgTemp = 0;
        double avgTemp = 0;
        double minAvgTemp = 0;
        double maxWindSpeed = 0;
        for (WeatherData weatherData : weatherDataList){
            maxAvgTemp += weatherData.getHigh_temp();
            avgTemp += weatherData.getTemp();
            minAvgTemp += weatherData.getMin_temp();
            if(weatherData.getWind_spd() > maxWindSpeed) {
                maxWindSpeed += weatherData.getWind_spd();
            }
        }
        responseData.setMaxAvgTemp(maxAvgTemp/weatherDataList.size());
        responseData.setAvgTemp(avgTemp/weatherDataList.size());
        responseData.setMinAvgTemp(minAvgTemp/weatherDataList.size());
        responseData.setMaxWindSpeed(maxWindSpeed);

        return responseData;
    }

}
