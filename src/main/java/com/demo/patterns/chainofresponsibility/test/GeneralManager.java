package com.demo.patterns.chainofresponsibility.test;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() == "请假") {
			System.out.println(name +":"+ request.getRequestContent() +"数量" + request.getNumber() + " 被批准了");
		}else if(request.getRequestType() == "加薪" && request.getNumber() <= 500) {
			System.out.println(name +":"+ request.getRequestContent() +"数量" + request.getNumber() + " 被批准了");
		}else if(request.getRequestType() == "加薪" && request.getNumber() > 500) {
			System.out.println(name +":"+ request.getRequestContent() +"数量" + request.getNumber() + " 再说吧");
		}
	}

}
