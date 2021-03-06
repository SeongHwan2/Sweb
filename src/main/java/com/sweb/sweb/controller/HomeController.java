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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sweb.sweb.dao.DaoInterFace;
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
//		Logger.Path("/root/tomcat/webapps/upload/log/");
	}
	
	@Autowired
	DaoInterFace di;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest req) {
		
		HomeController.Logger.info("test" + HomeController.ip());
		HttpSession session = req.getSession();
		session.setAttribute("test", "test");
		
		di.test();
		
		return "home";
	}
	
	@RequestMapping("/blog")
	public String blog() {
		return "blog";
	}
	
	@RequestMapping("/session")
	public String session(HttpServletRequest req) {
		HttpSession session = req.getSession();
		System.out.println(session.getId());
		session.setAttribute("test", "test");
		return "TP";
	}
	
	
}
