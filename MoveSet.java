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
}
