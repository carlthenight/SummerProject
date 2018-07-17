package com.carl.Pojo;

public class DivisionTimeWeather {

    private String weather_time;
    private String weather;
    private String temperature;

    @Override
    public String toString() {
        return "DivisionTimeWeather{" +
                "weather_time='" + weather_time + '\'' +
                ", weather='" + weather + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }

    public String getWeather_time() {
        return weather_time;
    }

    public void setWeather_time(String weather_time) {
        this.weather_time = weather_time;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
