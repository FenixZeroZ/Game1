import java.util.ArrayList;
// Инвентарь героя
public interface Inventar {
    static int gold = 0;
    ArrayList<Item> inv = new ArrayList<>();
    static void setInv(Item i){
        inv.add(i);
    }

    static void delInv(int i){
        inv.remove(i);
    }

}
