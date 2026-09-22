import factorymethod.*;
import abstractfactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: FACTORY METHOD DEMO ===");

        EnemySpawner goblinSpawner = new GoblinSpawner();
        goblinSpawner.spawnAndAttack();

        EnemySpawner skeletonSpawner = new SkeletonSpawner();
        skeletonSpawner.spawnAndAttack();

        EnemySpawner slimeSpawner = new SlimeSpawner();
        slimeSpawner.spawnAndAttack();

        System.out.println("\n=== PART B: ABSTRACT FACTORY DEMO ===");

        abstractfactory.WorldFactory selectedWorldFactory = new ForestWorldFactory();

        WorldGenerator gameWorld = new WorldGenerator(selectedWorldFactory);
        gameWorld.generateWorld();

        System.out.println("\nSwitching world theme to Ice World...");
        abstractfactory.WorldFactory iceWorldFactory = new IceWorldFactory();
        WorldGenerator iceWorld = new WorldGenerator(iceWorldFactory);
        iceWorld.generateWorld();
    }
}