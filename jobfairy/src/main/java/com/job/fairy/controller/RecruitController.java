package com.job.fairy.controller;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.job.fairy.service.RecruitService;
import com.job.fairy.vo.ProjectVO;

@Controller
@RequestMapping("/jobseeker")
public class RecruitController {

	@Resource
	RecruitService recruitService;
	
	@RequestMapping(value = "/recruitList.do", method = RequestMethod.GET)
	public String rctSelectList(Locale locale, Model model, HttpSession session, @ModelAttribute("projectVO") ProjectVO projectVO) {
		
		List<ProjectVO> list = recruitService.rctSelectList(projectVO);
		model.addAttribute("list", list);
		
		return "/jobseeker/recruitList";
	}
	
}
