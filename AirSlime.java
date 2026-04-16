import java.io.Serializable;

public class AirSlime extends Creature implements Serializable{
    public AirSlime(){
        super("Air Slime", 16, 7, 1, ElementalType.AIR, MoveSet.airSlimeMoves());
    }
}