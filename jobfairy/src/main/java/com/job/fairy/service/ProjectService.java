package com.job.fairy.service;

import java.util.List;

import com.job.fairy.vo.ProjectVO;

public interface ProjectService {
	
	public boolean insertProject(ProjectVO projectVO);
	public boolean updateProject(ProjectVO projectVO);
	public boolean deleteProject(ProjectVO projectVO);
	public List<ProjectVO> selectAllProject(ProjectVO projectVO);
	public ProjectVO selectOneProject(ProjectVO projectVO);
}
