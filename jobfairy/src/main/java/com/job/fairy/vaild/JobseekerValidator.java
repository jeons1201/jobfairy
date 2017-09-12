package com.job.fairy.vaild;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.job.fairy.vo.JobseekerVO;

public class JobseekerValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		boolean re = JobseekerVO.class.isAssignableFrom(cls);
		return re;
	}

	@Override
	public void validate(Object target, Errors errors) {
	 
		JobseekerVO jvo = (JobseekerVO) target;
		
		// 가입시 필수항목 공백검사 
		
		
		
		
		
		
		
		
	} // end of validate()

}// end of class
