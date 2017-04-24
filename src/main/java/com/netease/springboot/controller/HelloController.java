package com.netease.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by gingko on 2017/3/30.
 */
@Controller
public class HelloController {

	@Autowired
	private DataSource dataSource;

	@RequestMapping("/")
	@ResponseBody
	public String index(String name) {
		try {
			dataSource.getConnection().prepareStatement("select * from user limit 1");
		} catch (SQLException e) {
			System.out.println("e:" + e);
		}
		return "hello";
	}
}
