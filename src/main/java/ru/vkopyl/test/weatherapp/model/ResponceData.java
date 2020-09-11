package ru.vkopyl.test.weatherapp.model;

import java.util.Date;

public class ResponceData {

    int id;
    double maxAvgTemp;
    double avgTemp;
    double minAvgTemp;
    double maxWindSpeed;

    public ResponceData(int id, double maxAvgTemp, double avgTemp, double minAvgTemp, double maxWindSpeed) {
        this.id = id;
        this.maxAvgTemp = maxAvgTemp;
        this.avgTemp = avgTemp;
        this.minAvgTemp = minAvgTemp;
        this.maxWindSpeed = maxWindSpeed;
    }

    public ResponceData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "ResponceData{" +
                "id=" + id +
                ", maxAvgTemp=" + maxAvgTemp +
                ", avgTemp=" + avgTemp +
                ", minAvgTemp=" + minAvgTemp +
                ", maxWindSpeed=" + maxWindSpeed +
                '}';
    }
}
