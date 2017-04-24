package com.netease.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netease.springboot.filter.GreetFilter;
import com.netease.springboot.filter.HelloFilter;

/**
 * Created by gingko on 2017/4/22.
 */
@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean helloFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setName("helloFilter");
		HelloFilter helloFilter = new HelloFilter();
		registration.setFilter(helloFilter);
		registration.addUrlPatterns("/*");
		//registration.addInitParameter("paramName", "paramValue");
		registration.setOrder(1);
		return registration;
	}

	@Bean
	public FilterRegistrationBean greetFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setName("greetFilter");
		GreetFilter greetFilter = new GreetFilter();
		registration.setFilter(greetFilter);
		registration.addUrlPatterns("/greet/*");
		registration.setOrder(2);
		return registration;
	}

}
