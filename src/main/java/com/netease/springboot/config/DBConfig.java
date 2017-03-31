package com.netease.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by gingko on 2017/3/30.
 */
@Component
//@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix="spring.datasource")
public class DBConfig {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	public DataSource mysqlDataSource() {
		return DataSourceBuilder.create()
				.url(url)
				.username(username)
				.password(password)
				.build();
	}
}
