package com.demo.patterns.prototype.test;

public class Resume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	private WorkExperience workExperience;
	
	public Resume(String name) {
		this.name = name;
		this.workExperience = new WorkExperience();
	}
	
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
		this.workExperience.setWorkDate(timeArea);
		this.workExperience.setCompany(company);
	}
	
	public void display() {
		System.out.println(name+ " " + sex + " " + age);
		System.out.println("工作经历：" + timeArea + " " + company);
		System.out.println("工作经历：" + workExperience.getWorkDate() + " " + workExperience.getCompany());
		
	}
	
	public Object clone() {
		Resume re = null;
		try {
			re = (Resume)super.clone();//浅复制
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		re.workExperience = (WorkExperience)workExperience.clone();//深复制
		return re;
	}
}
