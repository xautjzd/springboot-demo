package com.netease.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gingko on 2017/3/30.
 */
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
