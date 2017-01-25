# MinimaxLearner
A simple, text based tic-tac-toe game designed for an introductory lesson on minimax entirely in java. The game is formatted such taht you can create your own bot with very little restriction.

# Contents
The Minimax repository includes two files for managing the game state - board.java and move.java, one helper file for evaluating moves - BestMove.java, one file to run the game - Tic-Tac-Toe.java, one bot-tempalte file- Player.java, and two example bots - HumanPlayer.java and Minimax.java

# Making and using bots
The only guideline for making a bot is that it extend the Player class and that it never return an invalid move. Player behavior is not defined when there are no moves left on the board. There are two examples of a bot included in the repository. HumanPlayer.java is a bot that determines its move by taking in input from the user. Using the HumanPlayer bot is equivalent to having the user play the game. Minimax.java is a bot that performs a minimax search up to a certain depth.

# Playing the game
To play the game, simply run Tic-Tac-Toe.java. To have your bot play the game. Simply change the types of one of the Playes to be your bot. To play against your bot, make one of the Players a HumanPlayer. To have two human players, make both of the bots HumanPlayers.
