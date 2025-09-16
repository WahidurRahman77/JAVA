import java.awt.*;
import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frist one");
        frame.setSize(600, 500);
        JTextField text = new JTextField(20);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Hello ", SwingConstants.CENTER));
        panel.add(new JButton("Submit"));
        panel.add(text);
        frame.add(panel);
        panel.setLayout(new GridLayout(3, 3));
        panel.add(new JButton("ONE"));
        panel.add(new JButton("TWO"));
        panel.add(new JButton("Three"));
        panel.add(new JButton("Four"));
        panel.add(new JRadioButton("Click"));
        panel.add(new JCheckBox("CHECKBOX"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setVisible(true);
    }
}
