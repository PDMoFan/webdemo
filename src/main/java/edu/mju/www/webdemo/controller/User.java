package edu.mju.www.webdemo.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @program: springbootdemo
 * @description: 用户类
 * @author: Mr.Lin
 * @create: 2019-07-21 22:47
 **/
@Component
@ConfigurationProperties(ignoreInvalidFields = true,ignoreUnknownFields = true,prefix = "user")
@PropertySource(value = "classpath:application-dev.properties")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 2377654172749276048L;
    private String id;
    private String name;
    private String age;

}
