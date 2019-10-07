public abstract class Enemy {
    public  String name;
    public   int hp;
    public   int maxHp;
    public   int damage;
    public   int armor;
    public   int level;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public String toString() {
        return ("Имя "+name+"\nЗдоровье "+maxHp+"\nЗащита "+armor+"\nАтака "+damage+"\nУровень "+level);
    }
}
