package Enemy;

import java.util.Random;

public class Vrag extends Enemy {
    String[] names = {"Бандит"};
    Random r = new Random();
    int value;

    public Vrag(Hero hero) {
        value = r.nextInt(names.length);
        name = names[value];

        value = r.nextInt(5);
        switch (value) {
            case 0:
                if (hero.getLevel() > 3)
                    level = hero.getLevel() - 2;
                else
                    level = hero.getLevel();
                break;
            case 1:
                if (hero.getLevel() > 2)
                    level = hero.getLevel() - 1 ;
                else
                    level = hero.getLevel();
                break;
            case 2:
                level = hero.getLevel();
                break;
            case 3:
                level = hero.getLevel() + 1;
                break;
            case 4:
                level = hero.getLevel() + 2;
                break;
            default:
                level = hero.getLevel();

        }

        maxHp += (10 * level);
        hp = maxHp;
        armor += (1 * level);
        damage += (1 * level);

    }
}
