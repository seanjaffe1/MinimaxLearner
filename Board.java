// Sean Jaffe
// Represents a state of a Tic-Tac-Toe board
import java.util.ArrayList;
import java.util.List;

public class Board {
	public int size = 4;
	public int[][] board;
	
	// constructs a new board
	public Board() {
		board = new int[size][size];
	}
	
	// If i == 1: returns " X ". if i == 2: returns " 0 ". 
	// Otherwise returns three spaces.
	private String print(int i) {
		if(i == 1) {
			return (" " + "X" + " ");
		} else if (i==2) {
			return (" " + "O" + " ");
		} else {
			return ("   ");
		}
	}
	
	// Returns the String representation of the current board state
	public String toString() {
		String ret = "";
		for (int i = 0; i < board.length; i++) {
			ret += print(board[i][0]);
			for (int j = 1; j < board[i].length; j++) {
				ret += "|";
				ret += print(board[i][j]);
			}
			ret += "\n";
		}
		return ret;
	}
	
	// returns winner, 0 if no winner
	public int winner() {
		for (int i = 0; i < board.length; i++) {
			if (wonRow(i)) {
				return board[i][0];
			}
		}
		for (int i = 0; i < board[0].length; i++) {
			if (wonCol(i)) {
				return board[0][i];
			}
		}
		
		//Check Diags
		int team = board[0][0];
		int found = team;
		if (team != 0) {
			for (int i = 1; i < board.length; i++) {
				if (board[i][i] != team) {
					found = 0;
				}
			}
		}
		if (found != 0) {
			return found;
		}
		//Check other Diag
		team = board[0][board[0].length - 1];
		found = team;
		if (team != 0) {
			for (int i = 1; i < board.length; i++) {
				if (board[i][board[0].length - 1 -i] != team) {
					found = 0;
				}
			}
		}
		return found;
	}
	
	// Returns true if Row contains all the same letters
	public boolean wonRow(int row) {
		int team = board[row][0];
		if (team == 0) {
			return false;
		}
		for (int i = 1; i < board[row].length; i++) {
			if (board[row][i] != team) {
				return false;
			}
		}
		return true;
	}
	
	// Returns true if Row contains all the same letters
	public boolean wonCol(int col) {
		int team = board[0][col];
		if (team == 0) {
			return false;
			
		}
		for (int i = 1; i < board.length; i++) {
			if (board[i][col] != team) {

				return false;
			}
		}
		return true;
	}
	
	// Makes move, assumes move is valid
	public void makeMove(Move m, int team) {
		board[m.row][m.col] = team;
	}
	
	// Undoes the given move from the board
	public void undoMove(Move m) {
		board[m.row][m.col] = 0;
	}
	
	// Returns a list of all moves that have been made in row-order.
	public List<Move> getMoves() {
		List<Move> ret = new ArrayList<Move>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 0) {
					ret.add(new Move(i, j));
				}
			}
		}
		return ret;
	}

}
