package com.sweb.sweb.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sweb.sweb.util.Log;


@Controller
public class HomeController {
	
	public static String ip() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		String ip = request.getHeader("X-FORWARDED-FOR");
		if (ip == null) ip = request.getRemoteAddr(); // 현재위치 받아오기
		return ip;
	}
	public static Log Logger = new Log();
	{
		// 윈도우 Path
//		Logger.Path("C:\\Users\\Admin\\Desktop\\java study\\workspace\\blog\\src\\main\\upload\\log/");
		
		// 리눅스 Path
		Logger.Path("/root/tomcat/webapps/upload/log/");
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest req) {
		
		HomeController.Logger.info("test" + HomeController.ip());
		HttpSession session = req.getSession();
		session.setAttribute("test", "test");
		
		return "home";
	}
	
}
