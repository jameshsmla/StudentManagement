package com.sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		System.out.println("Home Page");
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/login")
	public void login(String userName,String password) {
		
	}
}
