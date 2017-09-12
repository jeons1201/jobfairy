package com.job.fairy.dao;

import java.util.List;

import com.job.fairy.vo.JobseekerVO;

public interface JobseekerDAO {

	public boolean joinJsk(JobseekerVO jvo); // 구직자 가입 
	public boolean updateJsk(JobseekerVO jvo); // 회원정보수정
	public boolean withdrawJsk(JobseekerVO jvo); // 회원탈퇴 
	public JobseekerVO selectOneJsk(JobseekerVO jvo); // 회원 1인 정보 조회 
	public List<JobseekerVO> selectAllJsk(JobseekerVO jvo); // 전체 회원 목록 조회
	
	
	
} // END OF DOC. 

