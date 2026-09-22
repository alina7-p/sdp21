package abstractfactory;

public class DesertSlime implements Enemy {
    @Override
    public void attack() {
        System.out.println("Desert Sand Slime burrows under sand and spits scorching grit!");
    }
}