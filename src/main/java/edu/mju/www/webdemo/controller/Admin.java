package edu.mju.www.webdemo.controller;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: webdemo
 * @description: 管理员信息
 * @author: Mr.Lin
 * @create: 2019-09-17 09:16
 **/
@Component
@ConfigurationProperties(prefix = "admin")
@PropertySource(value = "classpath:application-tes.properties")
@Data
public class Admin {
    private Integer aid;
    private String aname;
    private int aage;
    private String ytt;

}
