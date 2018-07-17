package com.carl.Service;

import com.carl.Pojo.DivisionTimeWeather;

import java.util.List;


public interface DivisionTimeWeatherService {

    List<DivisionTimeWeather> getByName(String cityName, String start, String end);
}
