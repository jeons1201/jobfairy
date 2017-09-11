package com.job.fairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.job.fairy.dao.JobseekerDAO;
import com.job.fairy.vo.JobseekerVO;

public class JobseekerServiceImpl implements JobseekerService {

	
	@Autowired
	private JobseekerDAO jdao;
	
	@Override
	public boolean joinJsk(JobseekerVO jvo) {
		jdao.joinJsk(jvo);
		return false;
	}

	@Override
	public boolean updateJsk(JobseekerVO jvo) {
		jdao.updateJsk(jvo);
		return false;
	}

	@Override
	public boolean withdrawJsk(JobseekerVO jvo) {
		jdao.withdrawJsk(jvo);
		return false;
	}

	@Override
	public JobseekerVO selectOneJsk(JobseekerVO jvo) {
		jdao.selectOneJsk(jvo);
		return null;
	}

	@Override
	public List<JobseekerVO> selectAllJsk(JobseekerVO jvo) {
		jdao.selectAllJsk(jvo);
		return null;
	}

}
