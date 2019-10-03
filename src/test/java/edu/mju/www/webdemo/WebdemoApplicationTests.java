package edu.mju.www.webdemo;

import edu.mju.www.webdemo.controller.Admin;
import edu.mju.www.webdemo.controller.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WebdemoApplicationTests {
    @Autowired
    Admin admin;
    @Autowired
    User user;
    @Test
    public void contextLoads() {
//        Admin admin=new Admin();
//        User user=new User();
        System.out.println(admin.toString());
        System.out.println(admin.toString());
        System.out.println(admin.toString());
        System.out.println(user.toString());
        System.out.println(user.toString());
        System.out.println(user.toString());
    }

}
