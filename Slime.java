package factorymethod;

public class Slime implements Enemy {
    @Override
    public void attack() {
        System.out.println("Slime splashes acid dealing 5 damage and slows down the player!");
    }
}