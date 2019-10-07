public class Test {
    static void start(){
        System.out.println("Тест модулей.");
        Hero hero = new Hero();
        hero.createHero();
        System.out.println(hero);
        Vrag vrag = new Vrag(hero);
        Battle.start(hero,new Vrag(hero));
    }
}
