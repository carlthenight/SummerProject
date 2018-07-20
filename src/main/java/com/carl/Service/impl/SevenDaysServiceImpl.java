package com.carl.Service.impl;

import com.carl.Mapper.SevenDaysWeatherMapper;
import com.carl.Pojo.SevenDaysWeather;
import com.carl.Service.SevenDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SevenDaysServiceImpl implements SevenDaysService {

    @Autowired
    SevenDaysWeatherMapper sevenDaysWeatherMapper;

    @Override
    public List<SevenDaysWeather> getById(String id, String start, String end) {
        return sevenDaysWeatherMapper.getById(id, start, end);
    }
}
