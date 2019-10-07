import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ypravlenie {
    private static BufferedReader reader;
    private static boolean game = true; // Управление циклом меню и игры
    private static String s = "";
    Hero hero = new Hero();

    public  void start() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Добро пожаловать в игру Game1.\n");

        while (game) {
            Menu.menu();
            try {
                s = Ypravlenie.getReader().readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (s) {
                case "a":
                    hero.createHero();
                    System.out.println(hero);
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

    // Передача потока приёма данных для нужд просящих классов

    public static BufferedReader getReader() {
        return reader;
    }
}
