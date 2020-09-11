package ru.vkopyl.test.weatherapp.model;

public class WeatherData {

    private double high_temp;
    private double temp;
    private double min_temp;
    private double wind_spd;

    public WeatherData(double high_temp, double temp, double min_temp, double wind_spd) {
        this.high_temp = high_temp;
        this.temp = temp;
        this.min_temp = min_temp;
        this.wind_spd = wind_spd;
    }

    public WeatherData() {
    }

    public double getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(double wind_spd) {
        this.wind_spd = wind_spd;
    }

    public double getHigh_temp() {
        return high_temp;
    }

    public void setHigh_temp(double high_temp) {
        this.high_temp = high_temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(double min_temp) {
        this.min_temp = min_temp;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "high_temp=" + high_temp +
                ", temp=" + temp +
                ", min_temp=" + min_temp +
                ", wind_spd=" + wind_spd +
                '}';
    }
}
