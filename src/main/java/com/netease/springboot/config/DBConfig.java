package com.netease.springboot.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by gingko on 2017/3/30.
 */
@Configuration
@PropertySource("classpath:${spring.profiles.active}/jdbc.yml")
@ConfigurationProperties(prefix="jdbc")
//@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class DBConfig {

	private String url;
	private String username;
	private String password;
	private String driverClassName;

	private int initialSize;
	private int maxActive;
	private int maxIdle;
	private int minIdle;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);

		if (initialSize > 0) {
			dataSource.setInitialSize(initialSize);
		}
		if (maxActive > 0) {
			dataSource.setMaxIdle(maxActive);
		}
		if (maxIdle > 0) {
			dataSource.setMaxIdle(maxIdle);
		}
		if (minIdle > 0) {
			dataSource.setMinIdle(minIdle);
		}
		dataSource.setTestOnBorrow(true);
		dataSource.setLogAbandoned(true);
		dataSource.setValidationQuery("select 1 from dual");

		return dataSource;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

}
