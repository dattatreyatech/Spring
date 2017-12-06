package com.tx.bo;

public class JobBo {
	private int jobNo;
	private String title;
	private String description;
	private String Qualification;
	private int experiance;
	private int companeyId;
	
	public int getCompaneyId() {
		return companeyId;
	}
	public void setCompaneyId(int companeyId) {
		this.companeyId = companeyId;
	}
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	
	
}
