package factorymethod;

public class Goblin implements Enemy {
    @Override
    public void attack() {
        System.out.println("Goblin attacks with a rusty dagger dealing 10 damage!");
    }
}