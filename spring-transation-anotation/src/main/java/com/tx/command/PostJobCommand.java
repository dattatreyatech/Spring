package com.tx.command;

public class PostJobCommand {
	private int  companeyId;
	private String companeyNm;
	private String serviceType;
	private String location;
	private int jobNo;
	private String title;
	private String description;
	private String Qualification;
	private int experiance;
	public int getCompaneyId() {
		return companeyId;
	}
	public void setCompaneyId(int companeyId) {
		this.companeyId = companeyId;
	}
	public String getCompaneyNm() {
		return companeyNm;
	}
	public void setCompaneyNm(String companeyNm) {
		this.companeyNm = companeyNm;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
