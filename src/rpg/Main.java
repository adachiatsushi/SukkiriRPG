package rpg;

import static rpg.common.Contents.*;

import java.util.Scanner;

import rpg.action.Battle;
import rpg.action.impl.BattleAttack;
import rpg.action.impl.BattleDefending;
import rpg.action.impl.BattleSleep;
import rpg.characters.Character;
import rpg.characters.impl.Devil;
import rpg.characters.impl.General;
import rpg.characters.impl.Hero;
import rpg.characters.impl.Warrior;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("勇者の名前を入力せよ。");
		String name_1 = sc.next();
		System.out.println("戦士の名前を入力せよ。");
		String name_2 = sc.next();
		System.out.println("賢者の名前を入力せよ。");
		String name_3 = sc.next();

		Character[] members = new Character[3];

		Hero h = new Hero(name_1, HERO_HP);
		members[0] = h;

		Warrior w = new Warrior(name_2, WARRIOR_HP);
		members[1] = w;

		General g = new General(name_3, GENERAL_HP);
		members[2] = g;

		Devil devil = new Devil(DEVIL_NAME, DEVIL_HP);

		System.out.println("---------- バトル開始 -----------");

		String[] str = {"0:attack", "1:defence", "2:sleep"};
		while(h.isAlive() == true) {
			for(String msg : str) {
				System.out.println(msg);
			}
			System.out.println("選択せよ。");
			System.out.println("(* 数字を入力してください。)");
			int judge = sc.nextInt();
			if(judge == 0) {
				Battle battleAttack = new BattleAttack();
				battleAttack.battle(members, devil);
			} else if(judge == 1) {
				Battle battleDefending = new BattleDefending();
				battleDefending.battle(members, devil);
			} else if(judge == 2) {
				Battle battleSleep = new BattleSleep();
				battleSleep.battle(members, devil);
			}
			if(h.isAlive() == false) {
				System.out.println("ゲーム終了");
				break;
			}
			if(devil.isAlive() == false) {
				System.out.println("ゲーム終了");
				break;
			}
		}
	}

}
