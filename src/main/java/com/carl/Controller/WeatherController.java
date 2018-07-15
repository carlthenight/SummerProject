package com.carl.Controller;

import com.carl.Pojo.WeatherMain;
import com.carl.Service.WeatherMainService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/weather")
public class WeatherController {

    Logger logger = LogManager.getLogger(WeatherController.class);

    @Autowired
    WeatherMainService weatherMainService;

    @RequestMapping("/getById")
    @ResponseBody
    public Map<String,WeatherMain> WeatherSearchById(HttpServletRequest request, HttpServletResponse response,String id) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin","*");
        Map<String,WeatherMain> map = new HashMap<>();
        logger.info("cityID = " + id);
        if(id !=null && !id.equals("")){
            map.put("data",weatherMainService.get(id));
            return map;
        }else {
            map.put("data",new WeatherMain());
            return map;
        }
    }
}
