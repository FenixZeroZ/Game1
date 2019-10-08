package Game;

import Enemy.Hero;
import Enemy.Vrag;

public class Battle {
    private static   boolean battle =true;

    static void start(Hero hero, Vrag vrag){
        System.out.println("Битва началась. Ваш противник:");
        System.out.println(vrag);
        while (battle){

            vrag.hp-= 2;
            System.out.println("Enemy.Vrag hp "+vrag.getHp());
            if (vrag.getHp()<=0){
                System.out.println("Вы победили: "+vrag.getName());
                System.out.println("Вы получили опыта: "+vrag.level*10);
                hero.setXp(vrag.level*10);
                battle = false;

            }
           // if((vrag.getDamage()-hero.getArmor())>0)
           // hero.setHp(-1);
            System.out.println("hero hp "+hero.getHp());
            if (hero.getHp()<=0){
                System.out.println("Вы проиграли. Игра окончена.");
                battle = false;

            }

        }
        battle = true;
    }
}
