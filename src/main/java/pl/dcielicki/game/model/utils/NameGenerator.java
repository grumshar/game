package pl.dcielicki.game.model.utils;

import pl.dcielicki.game.model.characters.Enemy;
import pl.dcielicki.game.model.characters.Goblin;
import pl.dcielicki.game.model.characters.Orc;

import java.util.Random;

public class NameGenerator {

    private static String[] goblinNames = {"Kwok", "Grenbe", "Vele", "Kweengiz", "Rankle", "Dexmek"};
    private static String[] orcishNames = {"Ghamorz", "Rilug", "Zurgug", "Ugghra", "Nargulg", "Shulong"};
    private static String[] nicknames = {"Okrutny", "Groźny", "Przebiegły", "Mocarz"};
    private static final Random random = new Random();

    public static String generateName(Enemy enemy){
        StringBuilder sb = new StringBuilder();
        if(enemy instanceof Goblin){
            sb.append(goblinNames[random.nextInt(goblinNames.length)]);
        } else if(enemy instanceof Orc){
            sb.append(orcishNames[random.nextInt(orcishNames.length)]);
        }
        sb.append(" ").append(nicknames[random.nextInt(nicknames.length)]);
        return sb.toString();
    }

}
