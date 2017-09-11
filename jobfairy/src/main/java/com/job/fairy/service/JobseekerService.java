package com.job.fairy.service;

import java.util.List;

import com.job.fairy.vo.JobseekerVO;

public interface JobseekerService {
	
	public boolean joinJsk(JobseekerVO jvo); // ������ ���� 
	public boolean updateJsk(JobseekerVO jvo); // ȸ����������
	public boolean withdrawJsk(JobseekerVO jvo); // ȸ��Ż�� 
	public JobseekerVO selectOneJsk(JobseekerVO jvo); // ȸ�� 1�� ���� ��ȸ 
	public List<JobseekerVO> selectAllJsk(JobseekerVO jvo); // ��ü ȸ�� ��� ��ȸ

} // end of doc.
