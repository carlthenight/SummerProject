package com.carl.Controller;

import com.carl.Mapper.SevenDaysWeatherMapper;
import com.carl.Pojo.*;
import com.carl.Service.AqiService;
import com.carl.Service.CityService;
import com.carl.Service.DivisionTimeWeatherService;
import com.carl.Service.WeatherMainService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping(value = "/weather",method = {RequestMethod.GET})
public class WeatherController {

    Logger logger = LogManager.getLogger(WeatherController.class);

    @Autowired
    WeatherMainService weatherMainService;
    @Autowired
    CityService cityService;
    @Autowired
    AqiService aqiService;
    @Autowired
    DivisionTimeWeatherService divisionTimeWeatherService;
    @Autowired
    SevenDaysWeatherMapper sevenDaysWeatherMapper;

    @RequestMapping(value = "/getById",method = {RequestMethod.GET})
    @ResponseBody
    public Map<String,Map<String,WeatherMain>> WeatherSearchById(HttpServletRequest request, HttpServletResponse response,String id) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        Map<String,Map<String,WeatherMain>> map1 = new HashMap<>();
        Map<String,WeatherMain> map2 = new HashMap<>();
        map2.put("weatherMain",weatherMainService.get(id));
        if(id !=null && !id.equals("")){
            map1.put("data",map2);
            return map1;
        }else {
            map1.put("data",map2);
            return map1;
        }
    }

    @RequestMapping(value = "/getByName", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String,Map<String,WeatherMain>> WeatherSearchByName(HttpServletRequest request,HttpServletResponse response,String cityName) throws UnsupportedEncodingException{
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        Map<String,Map<String,WeatherMain>> map1 = new HashMap<>();
        Map<String,WeatherMain> map2 = new HashMap<>();
        List<City> listSaveCityId = cityService.searchByName(cityName);
        map2.put("weatherMain",weatherMainService.get(listSaveCityId.get(0).getId()));
        map1.put("data",map2);
        return map1;
    }

    @RequestMapping(value = "/getAqi",method = {RequestMethod.GET})
    @ResponseBody
    public Map<String,Map<String,Aqi>> getAqiByName(HttpServletRequest request, HttpServletResponse response, String cityName) throws UnsupportedEncodingException{
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        Map<String,Map<String,Aqi>> map1 = new HashMap<>();
        Map<String,Aqi> map2 = new HashMap<>();
        List<City> listSaveCityId = cityService.searchByName(cityName);
        logger.info("CITYID是:" + listSaveCityId.get(0).getId());
        map2.put("aqi",aqiService.getAqiById(listSaveCityId.get(0).getId()));
        map1.put("data",map2);
        return map1;
    }

    @RequestMapping(value = "/getDivisionWeather",method = {RequestMethod.GET})
    @ResponseBody
    public Map<String,Map<String,List<DivisionTimeWeather>>> getDivisionWeatherByName(HttpServletRequest request, HttpServletResponse response, String cityName) throws UnsupportedEncodingException{
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");

        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        Date dateStart = calendar.getTime();
        calendar.add(calendar.DATE,4);//把日期往后增加一天.整数往后推,负数往前移动
        Date dateEnd  =calendar.getTime(); //这个时间就是日期往后推一天的结果
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        String start = formatter.format(dateStart);
        String end = formatter.format(dateEnd);

        Map<String,Map<String,List<DivisionTimeWeather>>> map1 = new HashMap<>();
        Map<String,List<DivisionTimeWeather>> map2 = new HashMap<>();

        map2.put("divisionWeather",divisionTimeWeatherService.getByName(cityName, start, end));
        map1.put("data",map2);
        return map1;
    }

    @RequestMapping(value = "/getSevenDays")
    @ResponseBody
    Map<String,Map<String,List<SevenDaysWeather>>> getSevenDaysWeatherByName(HttpServletRequest request, HttpServletResponse response, String cityName) throws UnsupportedEncodingException{
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");

        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,-1);//把日期往前增加一天.整数往后推,负数往前移动
        Date dateStart = calendar.getTime();
        calendar.add(calendar.DATE,7);//把日期往后增加六天.整数往后推,负数往前移动
        Date dateEnd  =calendar.getTime(); //这个时间就是日期往后推一天的结果
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        String start = formatter.format(dateStart);
        String end = formatter.format(dateEnd);

        Map<String,Map<String,List<SevenDaysWeather>>> map1 = new HashMap<>();
        Map<String,List<SevenDaysWeather>> map2 = new HashMap<>();
        List<City> listSaveCityId = cityService.searchByName(cityName);
        String cityId = listSaveCityId.get(0).getId();
        map2.put("sevenDaysWeather",sevenDaysWeatherMapper.getById(cityId, start, end));
        map1.put("data",map2);

        return map1;
    }



}
