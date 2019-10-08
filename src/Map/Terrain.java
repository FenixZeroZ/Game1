package Map;

public class Terrain extends Territory {
    // С какой территорией соединяется
    private Terrain connectedLeft = null;
    private Terrain connectedUp = null;
    private Terrain connectedDown = null;
    private Terrain connectedRight = null;



    Terrain(String name, String opisanieTerritory, String type){
        setNameTerritory(name);
        setOpisanieTerritory(opisanieTerritory);
        setType(type);
    }

    public void setConnectedDown(Terrain connectedDown) {
        this.connectedDown = connectedDown;
    }

    public Terrain getConnectedDown() {
        return connectedDown;
    }

    public void setConnectedLeft(Terrain connectedLeft) {
        this.connectedLeft = connectedLeft;
    }

    public Terrain getConnectedLeft() {
        return connectedLeft;
    }

    public void setConnectedRight(Terrain connectedRight) {
        this.connectedRight = connectedRight;
    }

    public Terrain getConnectedRight() {
        return connectedRight;
    }

    public void setConnectedUp(Terrain connectedUp) {
        this.connectedUp = connectedUp;
    }

    public Terrain getConnectedUp() {
        return connectedUp;
    }

    @Override
    public void setNameTerritory(String nameTerritory) {
        super.setNameTerritory(nameTerritory);
    }

    @Override
    public void setOpisanieTerritory(String opisanieTerritory) {
        super.setOpisanieTerritory(opisanieTerritory);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String toString() {
        return getNameTerritory()+" "+getOpisanieTerritory()+" "+getType();
    }
}
