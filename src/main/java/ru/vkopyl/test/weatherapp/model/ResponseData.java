package ru.vkopyl.test.weatherapp.model;

import java.util.Date;

public class ResponseData {

    double maxAvgTemp;
    double avgTemp;
    double minAvgTemp;
    double maxWindSpeed;

    public ResponseData(double maxAvgTemp, double avgTemp, double minAvgTemp, double maxWindSpeed) {
        this.maxAvgTemp = maxAvgTemp;
        this.avgTemp = avgTemp;
        this.minAvgTemp = minAvgTemp;
        this.maxWindSpeed = maxWindSpeed;
    }

    public ResponseData() {
    }

    public double getMaxAvgTemp() {
        return maxAvgTemp;
    }

    public void setMaxAvgTemp(double maxAvgTemp) {
        this.maxAvgTemp = maxAvgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getMinAvgTemp() {
        return minAvgTemp;
    }

    public void setMinAvgTemp(double minAvgTemp) {
        this.minAvgTemp = minAvgTemp;
    }

    public double getMaxWindSpeed() {
        return maxWindSpeed;
    }

    public void setMaxWindSpeed(double maxWindSpeed) {
        this.maxWindSpeed = maxWindSpeed;
    }

    @Override
    public String toString() {
        return  "{\"maxAvgTemp\":" + maxAvgTemp +
                ", \"avgTemp\":" + avgTemp +
                ", \"minAvgTemp\":" + minAvgTemp +
                ", \"maxWindSpeed\":" + maxWindSpeed +
                '}';
    }
}
