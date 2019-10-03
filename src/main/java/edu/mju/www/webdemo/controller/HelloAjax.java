package edu.mju.www.webdemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: RedisTest
 * @description: ajaxtest
 * @author: Mr.Lin
 * @create: 2019-07-21 21:33
 **/
@Controller
@RequestMapping("/ajax")
@Slf4j
public class HelloAjax {

//    @PostMapping("/hello")
//    @ResponseBody
//    private String hello(@RequestBody User user,@RequestBody String userJson){
//        System.out.println(user.toString());
//        return user.toString();
//    }
    @PostMapping("/hello")
    @ResponseBody
    private String hello(@RequestBody String userJson){
        System.out.println(userJson.toString());
        User user = JSON.parseObject(userJson,User.class);
        return user.toString();

    }
}
