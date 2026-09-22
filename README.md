Theme: Game World Kit

This project demonstrates two creational design patterns (Factory Method 
and Abstract Factory) to remove hard-coded "new ConcreteClass()" 
instantiations and "if / switch" branching logic from client code.

- Part A (Factory Method): Manages the creation of individual enemy 
  types (Goblin, Skeleton, Slime) through concrete creator subclasses 
  (GoblinSpawner, SkeletonSpawner, SlimeSpawner).

- Part B (Abstract Factory): Manages the creation of consistent game 
  world product families (Enemy, Terrain, Soundtrack) for distinct 
  themes (Forest, Ice, Desert).


PROJECT STRUCTURE
src/
  ├── factorymethod/
  │    ├── Enemy.java              (Product interface)
  │    ├── Goblin.java             (Concrete Product 1)
  │    ├── Skeleton.java           (Concrete Product 2)
  │    ├── Slime.java              (Concrete Product 3)
  │    ├── EnemySpawner.java       (Abstract Creator)
  │    ├── GoblinSpawner.java      (Concrete Creator 1)
  │    ├── SkeletonSpawner.java    (Concrete Creator 2)
  │    └── SlimeSpawner.java       (Concrete Creator 3)
  │
  ├── abstractfactory/
  │    ├── Enemy.java              (Abstract Product Interface 1)
  │    ├── Terrain.java            (Abstract Product Interface 2)
  │    ├── Soundtrack.java         (Abstract Product Interface 3)
  │    ├── ForestGoblin.java       (Forest Product 1)
  │    ├── ForestTerrain.java      (Forest Product 2)
  │    ├── ForestSoundtrack.java   (Forest Product 3)
  │    ├── IceSkeleton.java        (Ice Product 1)
  │    ├── IceTerrain.java         (Ice Product 2)
  │    ├── IceSoundtrack.java      (Ice Product 3)
  │    ├── DesertSlime.java        (Desert Product 1)
  │    ├── DesertTerrain.java      (Desert Product 2)
  │    ├── DesertSoundtrack.java   (Desert Product 3)
  │    ├── WorldFactory.java       (Abstract Factory Interface)
  │    ├── ForestWorldFactory.java (Concrete Factory 1)
  │    ├── IceWorldFactory.java    (Concrete Factory 2)
  │    ├── DesertWorldFactory.java (Concrete Factory 3)
  │    └── WorldGenerator.java     (Client Class)
  │
  └── Main.java                    (Main entry point)


PATTERN DESIGN & JUSTIFICATION

Part A: Factory Method
- Object creation is delegated to specialized subclasses (GoblinSpawner, 
  SkeletonSpawner, SlimeSpawner).
- The abstract EnemySpawner class includes business logic (spawnAndAttack()) 
  that uses the Enemy interface without knowing concrete classes.

Part B: Abstract Factory
- Ensures style consistency across product families (Enemy, Terrain, 
  Soundtrack) to prevent mixing incompatible themes.
- The client class (WorldGenerator) receives WorldFactory via constructor 
  injection and interacts exclusively with interfaces.
- The choice of concrete factory takes place in a single location (Main.java).


SOLID PRINCIPLES

- Open/Closed Principle (OCP): New enemies or world themes (e.g. LavaWorld) 
  can be added by introducing new classes without modifying existing code.
- Single Responsibility Principle (SRP): Object creation logic is isolated 
  inside dedicated factory classes, separate from game mechanics.


PROGRAM OUTPUT

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
