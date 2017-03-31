package com.netease.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gingko on 2017/3/30.
 */
@SpringBootApplication //same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
