package Game;

import Enemy.Hero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Map.Map;

public class Ypravlenie {
    private static BufferedReader reader;
    private static boolean game = true; // Управление циклом меню и игры
    private static String s = "";
    private Hero hero;
    private Map map;

    public void start() {

        System.out.println("Добро пожаловать в игру Game1.\n");

        //Тело цикла меню игры при старте
        while (game) {
            reader = new BufferedReader(new InputStreamReader(System.in));
            Menu.menu();
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (s) {
                case "a":
                    reader = null;
                    hero = new Hero();
                    hero.createHero();
                    System.out.println(hero+"\n");
                    map = new Map();
                    map.generated();
                    System.out.println(map.getTerrain(0)+"\n");
                    break;
                case "b":
                    System.out.println("Планируется в дальнейшем.\n");
                    break;
                case "c":
                    System.out.println("Планируется в дальнейшем.\n");
                    break;
                case "d":
                    System.out.println("Автор игры Китвев Игорь.\n");
                    break;
                case "t":
                    Test.start();
                    break;

                case "q":
                    game = false;
                    break;
                default:
                    System.out.println("Вы ввели неправильный пункт меню. Попробуйте ещё раз\n");
            }
        }
    }
}
