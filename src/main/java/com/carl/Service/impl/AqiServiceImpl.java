package com.carl.Service.impl;

import com.carl.Mapper.AqiMapper;
import com.carl.Pojo.Aqi;
import com.carl.Service.AqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AqiServiceImpl implements AqiService {

    @Autowired
    AqiMapper aqiMapper;

    public Aqi getAqiById(String id){
        return aqiMapper.getAqiById(id);
    }
}
