// Sean Jaffe
// Elementary minimax bot

// Performs a minimax search up depth MAX_DEPTH.
// MAX_DEPTH of 5 recommended for time purposes.

import java.util.List;



public class MiniMaxBot extends Player {
	public static final int MAX_DEPTH = 5;

	int me;
	
	// Constructs a minimax object. Must pass in which player boss is playing as to 'me' parameter;
	// 1 for player one. 2 for player 2.
	public MiniMaxBot(int me) {
		this.me = me;
	}
	
	@Override
	// Returns Move with best score
	public Move makeMove(Board board) {
		BestMove best = miniMax(board, me, 0);
		System.out.println("Best: " + best.value);
		return best.move;
	}
	
	
	// Returns best BestMove form given board
	public BestMove miniMax(Board board, int turn, int depth) {

		List<Move> moves = board.getMoves();
	

		int winner = board.winner();
		if ( winner != 0) {
			// Game being processed has ended
			return new BestMove(null,- 10 * (30 - depth));
		} else if (moves.isEmpty()){
			// No moves remain in game being processed
			return new BestMove(null, 0);
	
		} else {
			
			int bestValue = Integer.MIN_VALUE;
			Move bestMove = null;
			if (depth > MAX_DEPTH ) {
				
				return new BestMove((moves.get(0)), bestValue);
			}
			for (Move move: moves){
				board.makeMove(move, turn);
				BestMove best = miniMax(board, turn % 2 + 1, depth + 1);
				int value = -best.value;
				board.undoMove(move);
				if (value > bestValue){
					bestValue = value;
					bestMove = move;
				}		
			}
			return new BestMove(bestMove, bestValue);
		}
	}
}
