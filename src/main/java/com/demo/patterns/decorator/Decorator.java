package com.demo.patterns.decorator;

public class Decorator extends Component {

	private Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		if(component != null) {
			component.Operation();
		}
	}

}
