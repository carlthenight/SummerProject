package com.carl.Service.impl;

import com.carl.Mapper.CityMapper;
import com.carl.Pojo.City;
import com.carl.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityMapper cityMapper;

    public List<City> list() {
        return cityMapper.list();
    }

    public List<City> searchByName(String cityName){
        return cityMapper.searchByName(cityName);
    }

    public City get(String id){
        return cityMapper.get(id);
    }
}
