package com.staff.controller;

import com.staff.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@ResponseBody
public class TestController {

    @Autowired
    private IRedisService redisService;

    @RequestMapping(value = "/setRedis",method = RequestMethod.GET)
    public int testSetRedis(String key,String str){
        redisService.setValue(key,str);
        return 1;
    }

    @RequestMapping(value = "/getRedis",method = RequestMethod.GET)
    public String testGetRedis(String key){
        String str= (String) redisService.getValue(key);
        System.out.print(str);
        return str;
    }
}
