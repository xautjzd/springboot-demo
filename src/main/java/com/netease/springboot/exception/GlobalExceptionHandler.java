package com.netease.springboot.exception;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gingko on 2017/4/22.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = {RuntimeException.class})
	public ModelAndView defaultErrorHandler(HttpServletRequest request, HttpServletResponse response, Exception ex) {
		response.setCharacterEncoding("UTF-8");
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 400);
		map.put("msg", ex.getMessage());
		response.setStatus(400);
		try {
			response.getWriter().write(JSON.toJSONString(map));
		} catch (IOException e) {
			logger.warn("io exception: ", e);
		}
		return new ModelAndView();
	}

}
