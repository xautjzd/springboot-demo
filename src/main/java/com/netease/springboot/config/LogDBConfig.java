package com.netease.springboot.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by gingko on 2017/3/30.
 */
@Component
//@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix="log.datasource")
public class LogDBConfig {

	public DataSource logDataSource() {
		return DataSourceBuilder.create().build();
	}
}
