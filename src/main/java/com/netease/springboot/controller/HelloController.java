package com.netease.springboot.controller;

import com.netease.springboot.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gingko on 2017/3/30.
 */
@Controller
public class HelloController {

	@Autowired
	private MyConfig myConfig;

	@RequestMapping("/")
	@ResponseBody
	String index() {
		return myConfig.getName() + ":" + myConfig.getAddress();
	}
}
