// Sean Jaffe
// Wrapper class for move object and corresponding score

public class BestMove {
	public Move move;
	public int value;
	
	// Constructs a BestMove containing the given move and associated value.
	public BestMove(Move move, int value) {
		this.move = move;
		this.value = value;
	}
	
	@Override
	public boolean equals(Object other) {
		if (! (other instanceof BestMove)) {
			return false;
		}
		
		BestMove o = (BestMove) other;
		return this.move.equals(o.move) && this.value == o.value;
	}

}
