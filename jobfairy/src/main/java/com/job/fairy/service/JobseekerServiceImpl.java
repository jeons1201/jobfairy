package com.job.fairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.job.fairy.dao.JobseekerDAO;
import com.job.fairy.vo.JobseekerVO;

@Service
public class JobseekerServiceImpl implements JobseekerService {

	
	@Autowired
	private JobseekerDAO jobseekerDAO;
	
	@Override
	public boolean joinJsk(JobseekerVO jvo) {
		jobseekerDAO.joinJsk(jvo);
		return false;
	}

	@Override
	public boolean updateJsk(JobseekerVO jvo) {
		jobseekerDAO.updateJsk(jvo);
		return false;
	}

	@Override
	public boolean withdrawJsk(JobseekerVO jvo) {
		jobseekerDAO.withdrawJsk(jvo);
		return false;
	}

	@Override
	public JobseekerVO selectOneJsk(JobseekerVO jvo) {
		jobseekerDAO.selectOneJsk(jvo);
		return null;
	}

	@Override
	public List<JobseekerVO> selectAllJsk(JobseekerVO jvo) {
		jobseekerDAO.selectAllJsk(jvo);
		return null;
	}

}
