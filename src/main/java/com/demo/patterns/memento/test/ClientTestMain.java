package com.demo.patterns.memento.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameRole lixiaoyao = new GameRole();
		lixiaoyao.GetInitState();
		lixiaoyao.StateDisplay();
		
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(lixiaoyao.SaveState());
		
		lixiaoyao.Fight();
		lixiaoyao.StateDisplay();
		
		lixiaoyao.RecoveryState(stateAdmin.getMemento());
		lixiaoyao.StateDisplay();
		
		System.out.println("");
	}

}
