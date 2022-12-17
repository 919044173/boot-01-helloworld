package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ay.
 * @create 2022-12-16 17:56
 */
@Configuration
public class MyConfig {

    @Bean
    public User user01(){
        return new User("user01",18);
    }

    @Bean
    public Pet tomcat(){
        return new Pet("tomcat");
    }

}
