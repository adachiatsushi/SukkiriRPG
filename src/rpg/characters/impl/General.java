package rpg.characters.impl;

import static rpg.common.Contents.*;

import rpg.characters.Character;
import rpg.characters.Sleep;

public class General extends Character implements Sleep{

	public General(String name, int hp) {
		super(name, hp);
	}

	public void attack(Devil devil) {
		System.out.println(this.getName() + "は" + devil.getName() +"に攻撃をした！");
		devil.damaged(GENERAL_POWER);
	}

	public void damaged(int damage) {
		if(isDefending() == true) {
			damage /= 2;
		}
		super.damaged(damage);
	}

	public void sleep() {
		System.out.println(this.getName() + "は、眠って全回復した。");
		this.setHp(GENERAL_HP);
	}
}
