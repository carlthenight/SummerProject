package com.carl.Pojo;

public class WeatherMain {
    private String id;
    private String degree;
    private String humidity;
    private String weather;
    private String wind_direction;
    private String wind_power;
    private String update_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_power() {
        return wind_power;
    }

    public void setWind_power(String wind_power) {
        this.wind_power = wind_power;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "WeatherMain{" +
                "id='" + id + '\'' +
                ", degree='" + degree + '\'' +
                ", humidity='" + humidity + '\'' +
                ", weather='" + weather + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_power='" + wind_power + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
