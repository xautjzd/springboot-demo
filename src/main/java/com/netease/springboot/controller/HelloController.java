package com.netease.springboot.controller;

import com.netease.springboot.config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * Created by gingko on 2017/3/30.
 */
@Controller
public class HelloController {

	@Autowired
	private DBConfig dbConfig;

	@RequestMapping("/")
	@ResponseBody
	String index() {
		try {
			DataSource dataSource = dbConfig.mysqlDataSource();
			dataSource.getConnection().prepareStatement("select * from nce_web_pub_user limit 1");
		} catch (Exception e) {
			System.out.println("e:" + e);
		}
		return "hello";
	}
}
