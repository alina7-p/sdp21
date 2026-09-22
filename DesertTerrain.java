package abstractfactory;

public class DesertTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering vast sand dunes, pyramids, and dried oases.");
    }
}