package rpg.action.impl;

import java.util.Random;

import rpg.action.Battle;
import rpg.characters.Character;
import rpg.characters.impl.Devil;

public class BattleDefending implements Battle{
	public void battle(Character[] members, Devil devil) {
		Random random = new Random();
		int num_1 = random.nextInt(10) + 1;  //Devil の行動パターンを決める。(0:攻撃,1:防御)
		if(num_1 % 2 == 0) {   //0は Devil の攻撃
			for(Character character : members) {
				if(character.isAlive() == true) {  //characterが生きていたら
					character.defending();
					devil.attack(character);
					if(character.isAlive() == false) {   //character が死んでいたら
						System.out.println(character.getName() + "倒れた。");
					}
				}
			}
		} else {   //それ以外は Devil の防御
			devil.defending();
			for(Character character : members) {
				if(character.isAlive() == true) {
					character.defending();
					System.out.println("何も起こらなかった。");
				}
				character.setDefending(false);
				devil.setDefending(false);
			}
		}
		for(Character character : members) {
			System.out.println(character.toString());
		}
	}
}
