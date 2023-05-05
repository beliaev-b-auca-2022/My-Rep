import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Problem03 extends JFrame implements MouseMotionListener {
    public Problem03() {
        super("Move mouse");
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        setTitle(x + ", " + y);
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        setTitle(x + ", " + y);
    }
    public static void main(String[] args) {
        Problem03 frame = new Problem03();
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setSize(300, 300);
        panel1.setBackground(Color.GRAY);
        frame.getContentPane().add(panel1, BorderLayout.CENTER);
    }
}