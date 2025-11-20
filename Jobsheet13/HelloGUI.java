import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloGUI Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        JLabel label = new JLabel("Ini percobaan HelloGUI Frame", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}