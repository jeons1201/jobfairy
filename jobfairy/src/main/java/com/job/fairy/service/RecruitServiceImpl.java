package com.job.fairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.job.fairy.dao.RecruitDAO;
import com.job.fairy.vo.ProjectVO;

@Service
@Transactional
public class RecruitServiceImpl implements RecruitService{

	@Autowired
	private RecruitDAO recruitDAO;
	
	@Override
	public List<ProjectVO> rctSelectList(ProjectVO projectVO) {
		
		return recruitDAO.rctSelectList(projectVO);
	}

}
