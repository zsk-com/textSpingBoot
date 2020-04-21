package com.duyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.duyi.mapper")
@EnableTransactionManagement
public class SpringBootDatasorues07Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDatasorues07Application.class, args);
    }

}
