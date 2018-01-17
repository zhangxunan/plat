package com.vdong.file.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HomeController {
    @RequestMapping("/")
    String hello() {
        return "hello zhangxunan v1.0.0";
    }

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {

        map.put("hello", "from TemplateController.helloHtml 章");
        return "/hello";
    }

}
