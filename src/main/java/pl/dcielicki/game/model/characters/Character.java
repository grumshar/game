package pl.dcielicki.game.model.characters;

import pl.dcielicki.game.model.items.Armor;
import pl.dcielicki.game.model.items.Weapon;

public abstract class Character {

    private String name;
    private int level;

    private int healthPoints;
    private int strength;
    private int dexterity;
    private int stamina;
    private int magic;

    private Weapon weapon;
    private Armor armor;

}
