import java.util.ArrayList;
import java.util.Random;

public class Map {
    ArrayList<Terrain> territories = new ArrayList<>();

    // Генерация карты
    public void generated() {
        Random random = new Random();
        String nameA = nameTerritoryFarmA[random.nextInt(nameTerritoryFarmA.length)];
        String nameB = nameTerritoryFarmB[random.nextInt(nameTerritoryFarmB.length)];
        String t = type[random.nextInt(type.length)];
        String opis="";
        switch (t) {
            case "war":
                opis = opisanieTerritori[0];
                break;
            case "farm":
                opis = opisanieTerritori[1];
                break;
            case "town":
                opis = opisanieTerritori[2];
                break;
        }

        territories.add(new Terrain(nameA + " " + nameB, opis, t));
        System.out.println(territories.get(0));
        territories.remove(0);
    }

    String[] type = {"war", "farm", "town"};
    String[] nameTerritoryFarmA = {"Белый", "Победоносный", "Жженый", "Небесный", "Чёрный", "Богатый", "Дьявольский", "Нетронутый"};
    String[] nameTerritoryFarmB = {"Рог", "Гром", "Тронх", "Берехт", "Взор", "Звон", "Клин", "Дом"};
    String[] opisanieTerritori = {"Место наполненое опасности и смерти", "Место с возможностью добыть ценные ресурсы", "Благородное место для отдыха и торговли"};


}
