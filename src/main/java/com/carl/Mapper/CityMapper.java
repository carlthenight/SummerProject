package com.carl.Mapper;

import com.carl.Pojo.City;

import java.util.List;

public interface CityMapper {
    public City get(String id);

    public List<City> searchByName(String cityName);

    public List<City> list();

    public int count();
}
