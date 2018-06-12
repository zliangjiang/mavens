package com.demo.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private List<Component> children = new ArrayList<Component>();
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(i<depth) {
			sb.append("-");
			i++;
		}
		System.out.println(sb.toString() + name);
		
		for(i = 0; i< children.size(); i++){
			children.get(i).Display(depth +2);
		}
	}

}
