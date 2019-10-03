package edu.mju.www.webdemo.config;

import edu.mju.www.webdemo.component.MyLocalResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: webdemo
 * @description: 自定义springmvc
 * @author: Mr.Lin
 * @create: 2019-07-29 22:45
 **/
//使用webmvcconfigerAdapter可以拓展springmvc的功能
//@EnableWebMvc 不要全面接管springmvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    //注册手动配置的区域组建==组件
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
