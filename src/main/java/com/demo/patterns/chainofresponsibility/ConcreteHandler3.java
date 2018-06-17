package com.demo.patterns.chainofresponsibility;

public class ConcreteHandler3 extends Handler{

	@Override
	public void handlerRequest(int request) {
		// TODO Auto-generated method stub
		if(request >= 20 && request < 30) {
			System.out.println(this.getClass().getName()+"处理请求:" + request);
		}else if(successor != null) {
			successor.handlerRequest(request);
		}
	}
}
