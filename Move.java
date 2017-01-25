// Sean Jaffe
// Represents a single move that can be made

public class Move {
	public int row;
	public int col;
	
	// Creates a move object at the given location
	public Move(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	// Prints the move in [r, c] form
	public String toString() {
		return "[" + row  + ", " + col+"]";
	}
	
	@Override
	public boolean equals(Object other) {
		if (! (other instanceof Move)) {
			return false;
		}
		
		Move o = (Move) other;
		return this.row == o.row && this.col == o.col;
	}
}
