package edu.mju.www.webdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Administrator
 */
@SpringBootApplication( exclude = {DataSourceAutoConfiguration.class})
public class WebdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebdemoApplication.class, args);
    }

}
