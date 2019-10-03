package edu.mju.www.webdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: webdemo
 * @description: 测试
 * @author: Mr.Lin
 * @create: 2019-07-28 17:27
 **/
@Controller
@RequestMapping("/access")
public class HelloWorld {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        map.put("hello", "<h1>nihao</h1>");
        map.put("users", Arrays.asList("jshagd", "sad", "sdsd"));
//        return "./examples/sign-in/index";
        return "index";
//        return "login";
    }

    @GetMapping("/dologin")
    public String doLogin(User user) {
        System.out.printf("iiiiiiiiiiiiiiiii");
        if ("qwe@123".equals(user.getName())) {
            return "Add";
        }
        return "redirect:hello";
    }
}






