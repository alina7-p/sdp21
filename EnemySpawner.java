package factorymethod;

public abstract class EnemySpawner {

    public abstract Enemy createEnemy();

    public void spawnAndAttack() {
        Enemy enemy = createEnemy();
        System.out.print("[Spawner System] Spawning unit: ");
        enemy.attack();
    }
}