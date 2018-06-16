package com.demo.patterns.prototype.test;

public class WorkExperience implements Cloneable{
	private String workDate;
	
	private String company;

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Object clone() {
		WorkExperience work = null;
		try {
			work = (WorkExperience)super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return work;
	}
	
}
