package com.carl.Controller;

import com.carl.Pojo.City;
import com.carl.Service.CityService;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/city",method = {RequestMethod.GET})
public class CityController {

    Logger logger = LogManager.getLogger(CityController.class);

    @Autowired
    CityService cityService;

    @RequestMapping(value = "/listCity",method = {RequestMethod.GET})
    @ResponseBody
    public List<City> lisCity(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin","*");
      return cityService.list();
    }

    @RequestMapping(value="/searchCity",method = {RequestMethod.GET})
    @ResponseBody
    public Map<String,List> searchCity(HttpServletRequest request, HttpServletResponse response, String cityName) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        Map<String,List> map = new HashMap<>();
        logger.info("cityName = " + cityName);
        if(cityName !=null && !cityName.equals("")){
            map.put("data",cityService.searchByName(cityName));
            return map;
        }else {
            map.put("data",new ArrayList());
            return map;
        }
    }
}
