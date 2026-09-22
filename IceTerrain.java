package abstractfactory;

public class IceTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering slippery ice surfaces, snowdrifts, and glaciers.");
    }
}