package com.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tx.command.PostJobCommand;
import com.tx.exception.CaseVailationFailedExecption;
import com.tx.services.JobService;
@Controller
public class PostJobController {
	@Autowired
	private JobService jobService;
	
	public void postJob(PostJobCommand pjc) throws CaseVailationFailedExecption{
		jobService.postJobCommand(pjc);
		System.out.println("Job Posted");
	}

}
