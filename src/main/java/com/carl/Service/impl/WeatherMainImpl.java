package com.carl.Service.impl;

import com.carl.Mapper.WeatherMainMapper;
import com.carl.Pojo.WeatherMain;
import com.carl.Service.WeatherMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherMainImpl implements WeatherMainService {
    @Autowired
    WeatherMainMapper weatherMainMapper;

    public WeatherMain get(String id){
        return weatherMainMapper.get(id);
    }
}
