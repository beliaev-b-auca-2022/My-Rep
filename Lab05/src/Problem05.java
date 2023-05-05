import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Problem05 extends JFrame {
    private JPanel chessBoard;
    private JPanel redCircle;
    private int circleRow = 0;
    private int circleCol = 0;
    public Problem05() {
        setTitle("Chess Board");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessBoard = new JPanel(new GridLayout(8, 8));
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
        redCircle = new JPanel();
        redCircle.setBackground(Color.RED);
        redCircle.setPreferredSize(new Dimension(30, 30));
        JPanel startSquare = (JPanel) chessBoard.getComponent(0);
        startSquare.add(redCircle);
        circleRow = 0;
        circleCol = 0;
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        moveCircle(-1, 0);
                        break;
                    case KeyEvent.VK_DOWN:
                        moveCircle(1, 0);
                        break;
                    case KeyEvent.VK_LEFT:
                        moveCircle(0, -1);
                        break;
                    case KeyEvent.VK_RIGHT:
                        moveCircle(0, 1);
                        break;
                }
            }
        });
        setFocusable(true);
        setVisible(true);
    }

    private void moveCircle(int rowOffset, int colOffset) {
        JPanel currentSquare = (JPanel) chessBoard.getComponent(circleRow * 8 + circleCol);
        currentSquare.remove(redCircle);
        currentSquare.revalidate();
        currentSquare.repaint();
        circleRow = Math.max(0, Math.min(circleRow + rowOffset, 7));
        circleCol = Math.max(0, Math.min(circleCol + colOffset, 7));
        JPanel newSquare = (JPanel) chessBoard.getComponent(circleRow * 8 + circleCol);
        newSquare.add(redCircle);
        newSquare.revalidate();
        newSquare.repaint();
    }
    public static void main(String[] args) {
        Problem05 board = new Problem05();
    }
}