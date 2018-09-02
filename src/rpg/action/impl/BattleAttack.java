package rpg.action.impl;

import java.util.Random;

import rpg.action.Battle;
import rpg.characters.Character;
import rpg.characters.impl.Devil;

public class BattleAttack implements Battle{

	public void battle(Character[] members, Devil devil) {

		Random random = new Random();
		int num_1 = random.nextInt(10) + 1;  //Devil の行動パターンを決める。(0:攻撃,1:防御)

		if(num_1 % 2 == 0) {   //0の場合、Devil は攻撃
			for(Character character : members) {   //拡張for文
				if(character.isAlive() == true) {  //characterが生き残っているなら
					character.attack(devil);       //devilに攻撃(生き残ったcharacterは攻撃)
				}
				if(devil.isAlive() == false) {     //devilが生き残っていなかったら（体力がなければ）
					System.out.println(devil.getName() + "は、倒れた。");
					break;
				}
				if(character.isAlive() == true) {  //Hero が生きていて、かつcharacterが生きている。
					devil.attack(character);
					if(character.isAlive() == false) {  //character が死んだら
						System.out.println(character.getName() + "は、倒れた。");
					}
				}
			}
		} else {  //1の場合、Devil は防御
			devil.defending();   //防御する
			for(Character character : members) {
				if(character.isAlive() == true) {  //character が生きていたら。
					character.attack(devil);
				}
				if(devil.isAlive() == false) {
					System.out.println(devil.getName() + "は、倒れた。");
				}
			}
			devil.setDefending(false);
		}
		for(Character character : members) {    //toStringをオーバーライド
			System.out.println(character.toString());
		}
	}
}
