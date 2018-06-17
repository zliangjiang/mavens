package com.demo.patterns.interpreter.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayContext context = new PlayContext();
		System.out.println("上海滩:");
		context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		try {
			while(context.getText().length() > 0) {
				String str = context.getText().substring(0, 1);
				switch (str) {
				case "O":
					expression = new Scale();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
				case "P":
					expression = new Note();
					break;
				}
				expression.interpret(context);
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
