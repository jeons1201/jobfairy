package com.job.fairy.controller;

import java.util.Locale;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		
		return "/member/login";
	}
	
	@RequestMapping(value = "/member/login.do", method = RequestMethod.POST)
	public String login(Locale locale, Model model, HttpSession session) {
		
		session.setAttribute("userId", "test");
		session.setAttribute("rank", "admin");
		
		return "/member/main";
	}
}
