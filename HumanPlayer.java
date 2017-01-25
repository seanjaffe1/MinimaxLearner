// Human Player class used to allow user to play game.
import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends Player {
	Scanner input;
	
	public HumanPlayer() {
		input = new Scanner(System.in);
	}
	
	@Override
	// Prompts user for move. Checks for validity. If invalid, will report and ask again.
	public Move makeMove(Board board) {
		List<Move> moves = board.getMoves();
		while (true) {
			System.out.println("What row ? ");
			int row = input.nextInt();
			System.out.println("What col ? ");
			int col = input.nextInt();
			Move m = new Move(row, col);
			if (moves.contains(m)) {
				return m;
			}
			System.out.println("Invalid move, please give another");
		}
	}
	

}
