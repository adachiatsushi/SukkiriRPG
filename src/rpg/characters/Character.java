package rpg.characters;

import rpg.characters.impl.Devil;

public abstract class Character implements Defending, Sleep{  //抽象クラス

	private String name;
	private int hp;
	private boolean isDefending = false;

	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isDefending() {
		return isDefending;
	}


	public void setDefending(boolean isDefending) {
		this.isDefending = isDefending;
	}


	public abstract void attack(Devil devil);


	public void defending() {
		System.out.println(this.getName() + "は、防御した。");
		this.isDefending = true;
	}

	public void damaged(int damage) {
		System.out.println(this.name + "に" + damage + "のダメージ");
		this.hp = Math.max(0, (this.hp - damage));   //0より小さくならない。
		this.setDefending(false);
	}

	public boolean isAlive() {
		if(this.hp > 0) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {  //toString をオーバーライド
		return "名前 : " + this.getName() + " / HP : " + this.getHp();
	}
}
