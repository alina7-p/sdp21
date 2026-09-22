package abstractfactory;

public class IceWorldFactory implements WorldFactory {
    @Override
    public Enemy createEnemy() {
        return new IceSkeleton();
    }

    @Override
    public Terrain createTerrain() {
        return new IceTerrain();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new IceSoundtrack();
    }
}