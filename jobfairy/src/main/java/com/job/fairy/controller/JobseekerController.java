package com.job.fairy.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.job.fairy.service.JobseekerService;
import com.job.fairy.vo.JobseekerVO;

@Controller
public class JobseekerController {

	@Autowired
	private ServletContext context;
	@Autowired 
	private JobseekerService jobseekerService;
	
	//1 가입창으로 이동 
	@RequestMapping("/jobseeker/joinJsk.do") 
	public String joinForm(@ModelAttribute("jobseekerVO") JobseekerVO jobseekerVO) {
	
		
		return "/jobseeker/joinJsk";
	}
	
	// 2 가입양식 제출 
	@RequestMapping(value="/jobseeker/aplJoin.do", 
			method= {RequestMethod.POST, RequestMethod.GET}) 
	public String joinJsk(@ModelAttribute @Valid JobseekerVO jobseekerVO, 
							BindingResult bindingResult,
							Model model) {
		
		/*if(bindingResult.hasErrors()) {
		  return "jobseeker/joinJsk";	
		}
		*/
		//1 사진 업로드 처리 
		try {
		String uploadPath = 
				context.getRealPath(context.getInitParameter("uploadPath"));
		
		File file = new File (uploadPath+jobseekerVO.getPhotoFile().getOriginalFilename());
		if(file.exists()) file.delete();
		FileUtils.writeByteArrayToFile(file, jobseekerVO.getPhotoFile().getBytes());
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jobseekerService.joinJsk(jobseekerVO);
		if(jobseekerService.joinJsk(jobseekerVO)) {
			System.out.println("회원추가성공");
		}
		
		return "로그인화면으로..?";
	}// end of joinJsk()
	
	
	
	
	
} // end of class 
