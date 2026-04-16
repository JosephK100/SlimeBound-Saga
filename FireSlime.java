//Fire slime 

public class FireSlime extends Creature{
    public FireSlime(){
        super("Fire Slime", 18, 6, 1, ElementalType.Fire, MoveSet.fireSlimeMoves());
    }
}