package abstractfactory;

public class ForestSoundtrack implements Soundtrack {
    @Override
    public void play() {
        System.out.println("Playing ambient forest soundtrack (birds, rustling leaves).");
    }
}