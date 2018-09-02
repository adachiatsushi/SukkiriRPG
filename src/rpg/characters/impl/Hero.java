package rpg.characters.impl;

import static rpg.common.Contents.*;

import rpg.characters.Character;
import rpg.characters.Sleep;

public class Hero extends Character implements Sleep{

	public Hero(String name, int hp){   	//コンストラクタ①
		super(name, hp);
	}

	public void attack(Devil devil) {  //攻撃
		System.out.println(this.getName() + "は" + devil.getName() +"に攻撃をした！");
		devil.damaged(HERO_POWER);
	}

	public void damaged(int damage) {
		if(isDefending() == true) {
			damage /= 2;
		}
		super.damaged(damage);
	}

	public void sleep() {  //睡眠（回復）
		this.setHp(HERO_HP);
		System.out.println(this.getName() + "は、眠って全回復した。");
	}
}
