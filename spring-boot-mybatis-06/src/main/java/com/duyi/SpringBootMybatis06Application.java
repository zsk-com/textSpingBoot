package com.duyi;


import org.apache.ibatis.annotations.Mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

//@SpringBootApplication

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan("com.duyi.mapper")//mybatis
@MapperScan("com.duyi.mapper")//tk-mybatis
public class SpringBootMybatis06Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootMybatis06Application.class, args);
    }

}
