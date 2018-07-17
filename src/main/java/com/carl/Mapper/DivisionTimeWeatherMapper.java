package com.carl.Mapper;

import com.carl.Pojo.DivisionTimeWeather;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DivisionTimeWeatherMapper {

    List<DivisionTimeWeather> getByName(@Param("cityName") String cityName, @Param("start") String start, @Param("end")String end);

}
