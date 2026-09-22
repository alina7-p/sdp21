package abstractfactory;

public class WorldGenerator {
    private final Enemy enemy;
    private final Terrain terrain;
    private final Soundtrack soundtrack;

    public WorldGenerator(WorldFactory factory) {
        this.enemy = factory.createEnemy();
        this.terrain = factory.createTerrain();
        this.soundtrack = factory.createSoundtrack();
    }

    public void generateWorld() {
        System.out.println("=== Generating Game World ===");
        terrain.render();
        soundtrack.play();
        enemy.attack();
        System.out.println("=============================");
    }
}