package com.vdong.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {


    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        //Config config = new Config();
        //RedissonClient redisson = Redisson.create(config);

        map.put("hello", "章旭楠。222。fuck2222");
        return "hello";
    }

}
