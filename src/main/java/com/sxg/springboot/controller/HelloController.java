package com.sxg.springboot.controller;

import com.sxg.springboot.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@SuppressWarnings("ALL")
@Controller
public class HelloController {

    @RequestMapping("/success")
    public String thymeleaf(Map<String, Object> map) {
        map.put("hello", "你好");
        return "success";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new MyException("用户不存在",401);
        }
        return "Hello World";
    }
}
