Tic-Tac-Toe Game
A classic two-player Tic-Tac-Toe game implemented in Java Swing. Players take turns marking cells with "X" and "O" on a 3x3 grid, with automatic win/draw detection and game reset functionality.

Tic-Tac-Toe Game Preview (Replace with actual screenshot if available)

Features
Two-Player Mode: Alternate turns between "X" and "O".

Win Detection: Checks for winning patterns in rows, columns, and diagonals.

Draw Detection: Identifies when all cells are filled with no winner.

Auto-Reset: Restarts the game automatically after a win or draw.

Input Validation: Prevents overwriting occupied cells.

Simple GUI: Clean interface with large, visible symbols.

Installation
Prerequisites
Java Development Kit (JDK) 8 or later

Steps
Download the Code:
Save the TicTacToeGame.java file locally.

Compile the Code:


javac TicTacToeGame.java
Run the Game:


java TicTacToeGame
Usage
Starting the Game:

The game launches with an empty 3x3 grid.

Taking Turns:

Player 1 ("X") clicks any empty cell to start.

Player 2 ("O") takes the next turn.

Continue alternating until a win or draw occurs.

Game End:

A popup announces the winner ("X" or "O") or a draw.

The board resets automatically for a new game.

Exiting:

Close the window to exit the application.

Code Structure
Key Components
Class: TicTacToeGame

Extends JFrame and implements ActionListener.

Variables:

buttons: 3x3 array of JButton for the game grid.

xTurn: Tracks whose turn it is (true = "X", false = "O").

Methods:

actionPerformed(): Handles button clicks and updates the game state.

checkForWin(): Checks rows, columns, and diagonals for a winner.

checkForDraw(): Verifies if all cells are filled.

resetGame(): Clears the board and resets turns.

Known Issues/Limitations
No Single-Player Mode: Only supports two human players.

No Score Tracking: Wins/draws are not recorded between games.

Manual Reset Missing: Game auto-resets but lacks a manual reset button.

Winning Line Not Highlighted: The winning combination isn’t visually emphasized.

Exit Mechanism: Requires closing the window (no dedicated exit button).

Contributing
Contributions are welcome! To enhance this project:

Fork the repository.

Create a feature branch:

git checkout -b feature/improvement
Commit changes:

git commit -m 'Add feature'
Push to the branch:

git push origin feature/improvement
Open a Pull Request.

License
This project is open-source under the MIT License.

Author: Eric Li
Contact: [ericbingxinli@gmail.com]
Year: 2024


