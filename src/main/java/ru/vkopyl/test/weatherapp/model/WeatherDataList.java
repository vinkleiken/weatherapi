package ru.vkopyl.test.weatherapp.model;

import java.util.List;

public class WeatherDataList {

    private List<WeatherData> data;

    public WeatherDataList(List<WeatherData> data) {
        this.data = data;
    }

    public WeatherDataList() {
    }

    public List<WeatherData> getData() {
        return data;
    }

    public void setData(List<WeatherData> data) {
        this.data = data;
    }

}
