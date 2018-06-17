package com.demo.patterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for(AbstractExpression exp:list) {
			exp.interpret(context);
		}
	}

}
