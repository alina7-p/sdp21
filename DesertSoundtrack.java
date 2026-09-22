package abstractfactory;

public class DesertSoundtrack implements Soundtrack {
    @Override
    public void play() {
        System.out.println("Playing oriental desert soundtrack (middle-eastern percussion).");
    }
}