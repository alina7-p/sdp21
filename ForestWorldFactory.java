package abstractfactory;

public class ForestWorldFactory implements WorldFactory {
    @Override
    public Enemy createEnemy() {
        return new ForestGoblin();
    }

    @Override
    public Terrain createTerrain() {
        return new ForestTerrain();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new ForestSoundtrack();
    }
}
