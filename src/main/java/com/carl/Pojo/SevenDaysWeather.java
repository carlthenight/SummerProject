package com.carl.Pojo;

public class SevenDaysWeather {

    private String id;
    private String temperature_High;
    private String temperature_Low;
    private String date;
    private String wind_direction;
    private String wind_power;
    private String weather_day;
    private String weather_night;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemperature_High() {
        return temperature_High;
    }

    public void setTemperature_High(String temperature_High) {
        this.temperature_High = temperature_High;
    }

    public void setTemperature_Low(String temperature_Low) {
        this.temperature_Low = temperature_Low;
    }

    public String getTemperature_Low() {
        return temperature_Low;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getWeather_day() {
        return weather_day;
    }

    public void setWeather_day(String weather_day) {
        this.weather_day = weather_day;
    }

    public String getWeather_night() {
        return weather_night;
    }

    public void setWeather_night(String weather_night) {
        this.weather_night = weather_night;
    }

    @Override
    public String toString() {
        return "SevenDaysWeather{" +
                "id='" + id + '\'' +
                ", temperature_High='" + temperature_High + '\'' +
                ", temperature_Low='" + temperature_Low + '\'' +
                ", date='" + date + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_power='" + wind_power + '\'' +
                ", weather_day='" + weather_day + '\'' +
                ", weather_night='" + weather_night + '\'' +
                '}';
    }
}
