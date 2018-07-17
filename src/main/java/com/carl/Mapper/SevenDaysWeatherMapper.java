package com.carl.Mapper;

import com.carl.Pojo.SevenDaysWeather;

import java.util.List;

public interface SevenDaysWeatherMapper {
    List<SevenDaysWeather> getById(String id);
}
