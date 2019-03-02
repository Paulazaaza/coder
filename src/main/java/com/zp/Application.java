package com.zp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangpeng01 on 2019/2/28.
 */
@SpringBootApplication
@RestController("/")
public class Application {
    @RequestMapping("hello")
    String home(){
        return "hello";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
