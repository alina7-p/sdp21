package abstractfactory;

public class IceSoundtrack implements Soundtrack {
    @Override
    public void play() {
        System.out.println("Playing chilling arctic soundtrack (howling wind, echo resonance).");
    }
}