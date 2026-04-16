# SlimeBound-Saga
Slime fighter game - Final project for CS 2

```
classDiagram
    class GameEngine {
        +startGame()
        +loadGame()
        +saveGame()
        +explore()
        +battle()
        +serializeData()
        +deserializeData()
    }

    class Player {
        -String name
        -int hp
        -int attackPower
        -int defense
        -List~Item~ inventory
        +takeDamage(int amount)
        +attack(Creature c)
        +isAlive()
        +addItem(Item i)
    }

    class Creature {
        <<abstract>>
        -String name
        -int hp
        -int attackPower
        -int defense
        -ElementalType type
        -MoveSet moveSet
        +takeDamage(int amount)
        +attack(Player p)
        +isAlive()
        +getMoves()
    }

    class FireCreature {
        +specialAttack(Player p)
    }

    class WaterCreature {
        +specialAttack(Player p)
    }

    class EarthCreature {
        +specialAttack(Player p)
    }

    class AirCreature {
        +specialAttack(Player p)
    }

    class ElectricCreature {
        +specialAttack(Player p)
    }

    Creature <|-- FireCreature
    Creature <|-- WaterCreature
    Creature <|-- EarthCreature
    Creature <|-- AirCreature
    Creature <|-- ElectricCreature
   
    class Move {
        -String name
        -int power
        -ElementalType type
        -String description
        +use(Creature user, Player target)
    }

    class MoveSet {
        -Move move1
        -Move move2
        -Move move3
        -Move move4
        +getMoves()
    }

    Creature --> MoveSet : has
    MoveSet --> Move : contains

    class ElementalType {
        <<enumeration>>
        Fire
        Water
        Earth
        Air
        Electric
    }

    class Item {
        -String name
        -String type
        -int value
        +use(Player p)
    }

    class Location {
        -String name
        -String description
        -List~Creature~ creatures
    }

    GameEngine --> Player : manages
    GameEngine --> Location : navigates
    GameEngine --> Creature : spawns
    Player --> Item : uses
    Location --> Creature : contains
    Creature --> ElementalType : has
    Item --> Creature : Is applied to
```
