package rpg.characters.impl;

import static rpg.common.Contents.*;

import rpg.characters.BadCharacter;
import rpg.characters.Character;

public class Devil extends BadCharacter{

	public Devil(String name, int hp) {
		super(name, hp);
		System.out.println(this.getName() + "が君臨した。");
	}

	public void attack(Character c) {  //攻撃
		System.out.println(this.getName() + "は" + c.getName() + "に攻撃した。");
		c.damaged(DEVIL_POWER);
	}

	public void damaged(int damage) {  //防御
		if(isDefending() == true) {  //防御しているならダメージ半減
			damage /= 2;
		}
		super.damaged(damage);  //親クラスのdamagedを呼び出す。
	}
}
