package rpg.action.impl;

import java.util.Random;

import rpg.action.Battle;
import rpg.characters.Character;
import rpg.characters.impl.Devil;


public class BattleSleep implements Battle{

	public void battle(Character[] members, Devil devil) {

		Random random = new Random();
		int num_1 = random.nextInt(10) + 1;  //Devil の行動パターンを決める。(0:攻撃,1:防御)
		if(num_1  % 2 == 0) {
			for(Character character : members) {
				if(character.isAlive() == true) {
					character.sleep();
					devil.attack(character);
				}
			}
		} else {
			devil.defending();
			for(Character character : members) {
				if(character.isAlive() == true) {
					character.sleep();
				}
			}
			devil.setDefending(false);
		}
		for(Character character : members) {
			System.out.println(character.toString());
		}
	}

}
