//Slime.java (Test)
import java.io.Serializable;

public class Slime extends Creature implements Serializable{
	
	public Slime(){
		super(
				"Slime",
				20, //HP
				5, //Attack
				1, //Defense
				ElementalType.EARTH,
				MoveSet.basicSlimeMoves()
		     );
	}
	/*These are outdated moves.
	private static MoveSet createMoves(){
		MoveSet set = new MoveSet();
		set.addMove(new Move("Smack", 4));
		set.addMove(new Move("Mud bomb", 6));
		return set;
	}
	*/
}
