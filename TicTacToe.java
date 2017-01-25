// Sean Jaffe
// Tic-Tac-Toe game

// To use you r own bot, simply set either p1 or p2 to be an instance of your bot.
// Bot must extend and be declared as a 'Player' object. 
// Assumes players make only valid moves.

public class TicTacToe {
	
	public static final  Player p1 = new HumanPlayer();
	public static final  Player p2 = new MiniMaxBot(2);

	
	public static void main(String[] args) {
		Board board = new Board();

		Player[] players = {p1, p2};
		int curr = 0;
		while(board.winner() == 0 && board.getMoves().size() > 0) {
			
			Move next = players[curr % 2].makeMove(board);
			System.out.println(next.row + ", " + next.col);
			board.makeMove(next, curr % 2 + 1);
			
			curr ++;
			System.out.println(board);
		}
		
		System.out.print(board.winner());
		
	}
}
