package com.demo.patterns.composite;

public class Leaf extends Component {
	
	public Leaf(String name) {
		super(name);
	}
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void Remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Cannot remove from a leaf");
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
	}

}
