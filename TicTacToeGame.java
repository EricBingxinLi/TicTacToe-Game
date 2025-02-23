
/**
 * 
 *
 *  Eric Li
 * 2024
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private boolean xTurn;

    public TicTacToeGame() {
        setTitle("Tic-Tac-Toe");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 3));
        buttons = new JButton[3][3];
        xTurn = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
                buttons[i][j].addActionListener(this);
                panel.add(buttons[i][j]);
            }
        }

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToeGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton.getText().equals("")) {
            if (xTurn)
                clickedButton.setText("X");
            else
                clickedButton.setText("O");

            if (checkForWin()) {
                JOptionPane.showMessageDialog(this, (xTurn ? "X" : "O") + " wins!");
                resetGame();
            } else if (checkForDraw()) {
                JOptionPane.showMessageDialog(this, "It's a draw!");
                resetGame();
            } else {
                xTurn = !xTurn;
            }
        }
    }

    private boolean checkForWin() {
        String[][] board = new String[3][3];

        // Copy button texts to a 2D array for easier checking
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = buttons[i][j].getText();
            }
        }

        // Check rows, columns, and diagonals for a winning condition
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals(""))
                return true;
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals(""))
                return true;
        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals(""))
            return true;
        return board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("");
    }

    private boolean checkForDraw() {
        // Check if all buttons are clicked and no winner
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals(""))
                    return false;
            }
        }
        return true;
    }

    private void resetGame() {
        // Clear the text of all buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        xTurn = true;
    }
}