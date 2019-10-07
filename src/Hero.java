import java.io.BufferedReader;
import java.io.IOException;

public final class Hero extends Enemy implements Inventar, Scill  {
    private  String name; // Имя героя
    private  boolean createHero = true; // Переменная для цикля создания героя
  //  private  int maxHp = 10;  // Здоровье персонажа
  //  private  int damage = 3; // Урон персонажа
  //  private  int armor = 2; // Защита героя
   // private  int hp;
    private  int xp = 0; // Опыт
   // private  int level; // Уровень
    private  BufferedReader reader = Ypravlenie.getReader();
    private  int xpPred =100;

    public  void createHero() {
        while (createHero) {
            level = 1;
            maxHp = 10;
            damage = 3;
            armor = 2;
            hp = maxHp;

            System.out.println("Введите название героя:");
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            createHero = false;
        }
    }

    public int getMaxhp() {
        return maxHp;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public  void setHp(int hp1) {hp +=hp1;}

    public  void setDamage(int damage1) {damage+=damage1;}

    public  void setArmor(int armor1) {armor+=armor1;}

    static void inv(){
        for (int i = 0; i < inv.size() ; i++) {
            System.out.println(inv.get(i));
        }
        System.out.println("");
    }

     void levelUp(){
        try {
            level+=1;
            System.out.println("Вы получили уровень. Выберите способность:");
            while (true) {
                System.out.println("1. Живучесть (увеличивает здоровье на 5)");
                System.out.println("2. Стойкость (увеличивает броню на 1)");
                System.out.println("3. Атака (увеличивает атаку на 1)");
                int n =Integer.valueOf( reader.readLine());
                if (n ==1) {
                    setHp(5);
                    break;
                } else
                    if(n==2){
                    setArmor(1);
                    break;
                    }
                else if(n==3){
                        setDamage(1);
                        break;
                    }
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public  void setXp(int xp1){
         xp+=xp1;
        System.out.println(xp);
        if(xp>=xpPred){

            levelUp();
            xpPred+=(xpPred*2);
        }
    }

    @Override
    public String toString() {
        return ("Имя: "+ name + "\nЗдоровье: "+ maxHp + "\nЗдоровье текущее: "+ this.hp +"\nУрон: "+ damage +
                "\nЗащита: "+armor+"\nОпыт: "+xp+"\nУроверь: "+level+"\nДо следующего уровня: "+xpPred);
    }
}
