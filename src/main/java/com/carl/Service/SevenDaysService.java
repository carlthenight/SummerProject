package com.carl.Service;

import com.carl.Pojo.SevenDaysWeather;

import java.util.List;

public interface SevenDaysService {

    List<SevenDaysWeather> getById(String id, String start, String end);
}
