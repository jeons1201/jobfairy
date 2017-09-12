package com.job.fairy.dao;

import java.util.List;

import com.job.fairy.vo.JobseekerVO;

public interface JobseekerDAO {

	public boolean joinJsk(JobseekerVO jvo); // ������ ���� 
	public boolean updateJsk(JobseekerVO jvo); // ȸ����������
	public boolean withdrawJsk(JobseekerVO jvo); // ȸ��Ż�� 
	public JobseekerVO selectOneJsk(JobseekerVO jvo); // ȸ�� 1�� ���� ��ȸ 
	public List<JobseekerVO> selectAllJsk(JobseekerVO jvo); // ��ü ȸ�� ��� ��ȸ
	
	
	
} // END OF DOC. 

