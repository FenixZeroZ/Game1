package Map;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    ArrayList<Terrain> territories = new ArrayList<>();     //Список территорий

    // Генерация карты
    public void generated() {
        Random random = new Random();
        String nameA = nameTerritoryFarmA[random.nextInt(nameTerritoryFarmA.length)];      //Первая часть названия территории
        String nameB = nameTerritoryFarmB[random.nextInt(nameTerritoryFarmB.length)];      //Вторая часть названия территории
        String t = type[random.nextInt(type.length)];      //Генерация типа территории
        String opis="";     //Переменная для описания территории

        // Выбор описания по типу территории
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

        //Добавление сгенерированной территории в список земель
        territories.add(new Terrain(nameA + " " + nameB, opis, t));

    }

    public Terrain getTerrain(int index){
        return territories.get(index);
    }

    String[] type = {"war", "farm", "town"};
    String[] nameTerritoryFarmA = {"Белый", "Победоносный", "Жженый", "Небесный", "Чёрный", "Богатый", "Дьявольский", "Нетронутый"};
    String[] nameTerritoryFarmB = {"Рог", "Гром", "Тронх", "Берехт", "Взор", "Звон", "Клин", "Дом"};
    String[] opisanieTerritori = {"Место наполненое опасности и смерти", "Место с возможностью добыть ценные ресурсы", "Благородное место для отдыха и торговли"};


}
