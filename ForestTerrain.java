package abstractfactory;

public class ForestTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering lush green trees, grass, and wooden paths.");
    }
}