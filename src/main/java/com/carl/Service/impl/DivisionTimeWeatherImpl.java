package com.carl.Service.impl;

import com.carl.Mapper.DivisionTimeWeatherMapper;
import com.carl.Pojo.DivisionTimeWeather;
import com.carl.Service.DivisionTimeWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DivisionTimeWeatherImpl implements DivisionTimeWeatherService {

    @Autowired
    DivisionTimeWeatherMapper divisionTimeWeatherMapper;

    public List<DivisionTimeWeather> getByName(String cityName, String start, String end){
        return divisionTimeWeatherMapper.getByName(cityName,start,end);
    }
}
