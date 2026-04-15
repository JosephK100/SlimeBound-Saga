//Slime.java (Test)

public class Slime extends Creature{
	
	public Slime(){
		super(
				"Slime",
				20, //HP
				5, //Attack
				1, //Defense
				ElementalType.Earth,
				createMoves()
		     );
	}

	private static MoveSet createMoves(){
		MoveSet set = new MoveSet();
		set.addMove(new Move("Smack", 4));
		set.addMove(new Move("Mud bomb", 6));
		return set;
	}
}
