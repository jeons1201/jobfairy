package com.job.fairy.dao;

import java.util.List;

import com.job.fairy.vo.ProjectVO;

public interface RecruitDAO {
	
	public List<ProjectVO> rctSelectList(ProjectVO projectVO);
}
