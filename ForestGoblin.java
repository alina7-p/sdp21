package abstractfactory;

public class ForestGoblin implements Enemy {
    @Override
    public void attack() {
        System.out.println("Forest Goblin strikes from behind a bush!");
    }
}