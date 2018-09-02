package rpg.characters.impl;

import static rpg.common.Contents.*;

import rpg.characters.Character;
import rpg.characters.Sleep;

public class Warrior extends Character implements Sleep{

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void attack(Devil devil) {  //攻撃
		System.out.println(this.getName() + "は" + devil.getName() + "に攻撃をした！");
		devil.damaged(WARRIOR_POWER);
	}

	public void damaged(int damage) {
		if(isDefending() == true) {
			damage /= 2;
		}
		super.damaged(damage);
	}

	public void sleep() {  //睡眠
		this.setHp(WARRIOR_HP);
		System.out.println(this.getName() + "は、眠って全回復した。");
	}
}
