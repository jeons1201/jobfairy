package com.job.fairy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.job.fairy.vo.ProjectVO;

@Repository
public class RecruitDAOImpl implements RecruitDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ProjectVO> rctSelectList(ProjectVO projectVO) {
		return sqlSession.selectList("rctSelectList", projectVO);
	}

}
