package com.carl.Service;

import com.carl.Pojo.City;

import java.util.List;

public interface CityService {

    List<City> list();

    List<City> searchByName(String cityName);

    City get(String id);
}
