// Sean Jaffe
// Generic Player class used to play the tic-tac-toe game.

import java.util.List;
import java.util.Random;

public class Player {
	Random r;
	
	public Player() {
		r = new Random();
	}
	
	
	public Move makeMove(Board board) {
		List<Move> moves = board.getMoves();
		int i = r.nextInt(moves.size());
		return moves.get(i);
	}
}
