package rpg.action;

import rpg.characters.Character;
import rpg.characters.impl.Devil;

public interface Battle {  //インターフェース

	void battle(Character[] members, Devil devil);
}
