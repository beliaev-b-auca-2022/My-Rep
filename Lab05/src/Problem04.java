import javax.swing.*;
import java.awt.*;
public class Problem04 extends JFrame {
    public Problem04() {
        setTitle("Chess Board");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel chessBoard = new JPanel(new GridLayout(8, 8));
        chessBoard.setSize(300, 300);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if ((row + col) % 2 == 0) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.BLACK);
                }
                chessBoard.add(square);
            }
        }
        add(chessBoard);
    }
    public static void main(String[] args) {
        Problem04 board = new Problem04();
        board.setVisible(true);
    }
}