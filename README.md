Theme: Game World Kit

This project demonstrates the implementation of two creational design patterns: Factory Method and Abstract Factory, replacing hardcoded new ConcreteClass() instantiations and multi-branch if/switch statements with flexible, decoupled creation mechanisms.   

Part A (Factory Method): Creation of individual enemy types (Goblin, Skeleton, Slime) delegated to concrete creator subclasses (GoblinSpawner, SkeletonSpawner, SlimeSpawner).
Part B (Abstract Factory): Creation of style-consistent game world product families consisting of an Enemy, Terrain, and Soundtrack for distinct themes (Forest, Ice, Desert).   

Project Structure

assignment2-design-patterns/
  ├── src/
  │    ├── factorymethod/
  │    │    ├── Enemy.java             - Product interface
  │    │    ├── Goblin.java            - Concrete Product 1
  │    │    ├── Skeleton.java          - Concrete Product 2
  │    │    ├── Slime.java             - Concrete Product 3
  │    │    ├── EnemySpawner.java      - Abstract Creator
  │    │    ├── GoblinSpawner.java     - Concrete Creator 1
  │    │    ├── SkeletonSpawner.java   - Concrete Creator 2
  │    │    └── SlimeSpawner.java      - Concrete Creator 3
  │    │
  │    ├── abstractfactory/
  │    │    ├── Enemy.java             - Abstract Product Interface 1
  │    │    ├── Terrain.java           - Abstract Product Interface 2
  │    │    ├── Soundtrack.java        - Abstract Product Interface 3
  │    │    ├── ForestGoblin.java      - Forest Product 1
  │    │    ├── ForestTerrain.java     - Forest Product 2
  │    │    ├── ForestSoundtrack.java  - Forest Product 3
  │    │    ├── IceSkeleton.java       - Ice Product 1
  │    │    ├── IceTerrain.java        - Ice Product 2
  │    │    ├── IceSoundtrack.java     - Ice Product 3
  │    │    ├── DesertSlime.java       - Desert Product 1
  │    │    ├── DesertTerrain.java     - Desert Product 2
  │    │    ├── DesertSoundtrack.java  - Desert Product 3
  │    │    ├── WorldFactory.java      - Abstract Factory Interface
  │    │    ├── ForestWorldFactory.java  - Concrete Factory 1
  │    │    ├── IceWorldFactory.java   - Concrete Factory 2
  │    │    ├── DesertWorldFactory.java - Concrete Factory 3
  │    │    └── WorldGenerator.java    - Client Class
  │    │
  │    └── Main.java                   - Program Entry Point
  └── README.md

Part A: Factory Method
Delegation: Object creation is delegated to specialized subclasses (GoblinSpawner, SkeletonSpawner, SlimeSpawner).   
Business Method Integration: The abstract class EnemySpawner contains the business logic method spawnAndAttack(), which calls the abstract factory method createEnemy() to execute behavior on the Enemy interface without coupling to concrete classes.   

Part B: Abstract Factory
Product Families: Ensures that related elements (Enemy, Terrain, Soundtrack) belong to the exact same style/theme without cross-contamination (e.g., preventing a Forest Goblin from appearing with an Ice Soundtrack).   
Composition & Decoupling: The client WorldGenerator receives the WorldFactory via constructor dependency injection. The client solely works with abstract product interfaces and has zero dependency on concrete implementation classes.   
Single Selection Point: The concrete factory instantiation takes place in exactly one location inside Main.java.   

SOLID Principles Application:
Open/Closed Principle (OCP): New enemy types or entire new world themes (e.g., LavaWorld) can be introduced into the project by creating new classes without modifying existing client code or factory logic.   
Single Responsibility Principle (SRP): Object creation logic is completely separated from game domain mechanics and isolated inside dedicated spawner and factory classes.   

Execution Output:
=== PART A: FACTORY METHOD DEMO ===
[Spawner System] Spawning unit: Goblin attacks with a rusty dagger dealing 10 damage!
[Spawner System] Spawning unit: Skeleton shoots a bone arrow dealing 15 damage!
[Spawner System] Spawning unit: Slime splashes acid dealing 5 damage and slows down the player!

=== PART B: ABSTRACT FACTORY DEMO ===
=== Generating Game World ===
Rendering lush green trees, grass, and wooden paths.
Playing ambient forest soundtrack (birds, rustling leaves).
Forest Goblin strikes from behind a bush!
=============================

Switching world theme to Ice World...
=== Generating Game World ===
Rendering slippery ice surfaces, snowdrifts, and glaciers.
Playing chilling arctic soundtrack (howling wind, echo resonance).
Ice Skeleton shoots a freezing frost arrow!
=============================
