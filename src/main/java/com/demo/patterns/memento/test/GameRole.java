package com.demo.patterns.memento.test;

public class GameRole {
	private int vit;
	private int atk;
	private int def;
	
	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void StateDisplay() {
		System.out.println("角色当前状态:");
		System.out.println("体力:" + this.vit);
		System.out.println("攻击力:" + this.atk);
		System.out.println("防御力:" + this.def);
		System.out.println("");
	}
	
	public void GetInitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	public void Fight() {
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	public RoleStateMemento SaveState() {
		return (new RoleStateMemento(vit, atk, def));
	}
	
	public void RecoveryState(RoleStateMemento memento) {
		this.vit = memento.getVitality();
		this.atk = memento.getAttack();
		this.def = memento.getDefense();
	}
}
