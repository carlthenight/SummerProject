package com.carl.Mapper;

import com.carl.Pojo.SevenDaysWeather;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SevenDaysWeatherMapper {
    List<SevenDaysWeather> getById(@Param("id") String id,@Param("start") String start, @Param("end")String end);
}
