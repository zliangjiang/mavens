package com.demo.patterns.memento.test;

public class RoleStateMemento {
	private int vit;
	private int atk;
	private int def;
	
	public RoleStateMemento(int vit, int atk, int def) {
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}

	public int getVitality() {
		return vit;
	}

	public void setVitality(int vit) {
		this.vit = vit;
	}

	public int getAttack() {
		return atk;
	}

	public void setAttack(int atk) {
		this.atk = atk;
	}

	public int getDefense() {
		return def;
	}

	public void setDefense(int def) {
		this.def = def;
	}
}
