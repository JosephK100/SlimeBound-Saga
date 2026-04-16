//MoveSet.java

import java.util.ArrayList;
import java.util.Random;

public class MoveSet{
	private ArrayList<Move> moves = new ArrayList<>();
	private Random rand = new Random();

	public void addMove(Move move){
		moves.add(move);
	}

	public Move getRandomMove(){
		if (moves.isEmpty()){
			return new Move("Flail", 5);
		}
		return moves.get(rand.nextInt(moves.size()));
	}

	//New moves for the other slimes ;3
	public static MoveSet basicSlimeMoves(){
		MoveSet set = new MoveSet();
		set.addMove(new Move("Smack", 4));
		set.addMove(new Move("Mud Bomb", 6));
		set.addMove(new Move("Goo shot", 3));
		set.addMove(new Move("Bounce", 5));
		return set;
	}

	public static MoveSet fireSlimeMoves(){
		MoveSet set = new MoveSet();
		set.addMove(new Move("Fire Ball", 5));
		set.addMove(new Move("Fire Storm", 7));
		set.addMove(new Move("Flame Wheel", 6));
		return set;
	}

	public static MoveSet waterSlimeMoves(){
		MoveSet set = new MoveSet();
		set.addMove(new Move("Splash", 4));
		set.addMove(new Move("Jet Blast", 6));
		set.addMove(new Move("Surf", 5));
		return set;
	}

	public static MoveSet airSlimeMoves(){
		MoveSet set = new MoveSet();
		set.addMove(new Move("Gust", 5));
		set.addMove(new Move("Typhoon", 7));
		set.addMove(new Move("Air Cutter", 3));
		return set;
	}
}
