import java.io.Serializable;

public class WaterSlime extends Creature implements Serializable{
    public WaterSlime(){
        super("Water Slime", 22, 5, 2, ElementalType.WATER, MoveSet.waterSlimeMoves());
    }
}