package Map;

public abstract class Territory {
    private String nameTerritory;  // Название территории
    private String opisanieTerritory; // Описание территории
    private String type; // Тип территории

    public String getNameTerritory() {
        return nameTerritory;
    }

    public void setNameTerritory(String nameTerritory) {
        this.nameTerritory = nameTerritory;
    }

    public String getOpisanieTerritory() {
        return opisanieTerritory;
    }

    public void setOpisanieTerritory(String opisanieTerritory) {
        this.opisanieTerritory = opisanieTerritory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
