package com.tx.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tx.bo.CompaneyBo;
import com.tx.bo.JobBo;
import com.tx.command.PostJobCommand;
import com.tx.dao.CompaneyDao;
import com.tx.dao.JobDao;
import com.tx.exception.CaseVailationFailedExecption;
@Service
public class JobService {
	@Autowired
	private CompaneyDao companeydao;
	@Autowired
	private JobDao jobDao;
	@Transactional
	public void postJobCommand(PostJobCommand pjc) throws CaseVailationFailedExecption{

		 CompaneyBo cbo=null;
		 JobBo jbo=null;
		 try{
		cbo=new CompaneyBo();
		cbo.setCompaneyId(pjc.getCompaneyId());
		cbo.setCompaneyNm(pjc.getCompaneyNm());
		cbo.setServiceType(pjc.getServiceType());
		cbo.setLocation(pjc.getLocation());
		companeydao.saveCompaney(cbo);
		
		jbo=new JobBo();
		jbo.setJobNo(pjc.getJobNo());
		jbo.setTitle(pjc.getTitle());
		jbo.setDescription(pjc.getDescription());
		jbo.setExperiance(pjc.getExperiance());
		jbo.setQualification(pjc.getQualification());
		jbo.setCompaneyId(3);	
		jobDao.saveJob(jbo);
		 }catch (Exception e) {
			 e.printStackTrace();
			 throw new CaseVailationFailedExecption("job applied is fialed");
		 }
	}
	
	
}
