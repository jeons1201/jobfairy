package com.job.fairy.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/jobseeker")
public class RecruitController {

	@RequestMapping(value = "/recruitList.do", method = RequestMethod.POST)
	public String rctSelectList(Locale locale, Model model, HttpSession session) {
		
		return "/jobseeker/recruitList";
	}
	
}
