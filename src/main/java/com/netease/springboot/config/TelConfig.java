package com.netease.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gingko on 2017/3/31.
 */
@Component
@ConfigurationProperties
public class TelConfig {
	private int telephone;

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
}
