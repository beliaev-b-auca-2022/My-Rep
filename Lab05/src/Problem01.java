import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem01 extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new Problem01();
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setSize(300,220);
        panel1.setBackground(Color.RED);
        frame.add(panel1,BorderLayout.CENTER);
        JPanel panel2 = new JPanel();
        panel2.setSize(300,80);
        panel2.setBackground(Color.GRAY);
        JButton button1 = new JButton("Red");
        JButton button2 = new JButton("Blue");
        JButton button3 = new JButton("Green");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        frame.add(panel2,BorderLayout.AFTER_LAST_LINE);
    }
}



