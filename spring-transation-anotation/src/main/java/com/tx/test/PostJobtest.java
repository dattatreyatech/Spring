package com.tx.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tx.command.PostJobCommand;
import com.tx.controller.PostJobController;
import com.tx.exception.CaseVailationFailedExecption;
import com.tx.javaConfig.RootConfig;

public class PostJobtest {
public static void main(String[] args) throws CaseVailationFailedExecption {
	PostJobCommand  pjc=null;
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(RootConfig.class);
	PostJobController controllet=context.getBean("postJobController",PostJobController.class);
	
	pjc=new PostJobCommand();
	
	pjc.setCompaneyId(2);
	pjc.setCompaneyNm("stacktrace");
	pjc.setServiceType("IT");
	pjc.setLocation("panjaguta");
	
	pjc.setJobNo(1);
	pjc.setTitle("sr.engineer");
	pjc.setDescription("urgent requiteing for thos job");
	pjc.setExperiance(3);
	pjc.setQualification("b.tech");
	//pjc.setCompaneyId(1);

	controllet.postJob(pjc);
	context.close();
}
}
