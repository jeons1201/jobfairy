package com.job.fairy.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.job.fairy.vo.JobseekerVO;

@Repository("jobseekerDAO")
public class JobseekerDAOImpl implements JobseekerDAO {

	@Autowired
	private SqlSession sqlSession;
	private boolean result;
	
	@Override
	public boolean joinJsk(JobseekerVO jvo) {
		
		return sqlSession.insert("insertJsk", jvo)==1;
	}

	@Override
	public boolean updateJsk(JobseekerVO jvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawJsk(JobseekerVO jvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JobseekerVO selectOneJsk(JobseekerVO jvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobseekerVO> selectAllJsk(JobseekerVO jvo) {
		// TODO Auto-generated method stub
		return null;
	}

}// end of class
