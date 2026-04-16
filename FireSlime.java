//Fire slime 
import java.io.Serializable;

public class FireSlime extends Creature implements Serializable{
    public FireSlime(){
        super("Fire Slime", 18, 6, 1, ElementalType.FIRE, MoveSet.fireSlimeMoves());
    }
}