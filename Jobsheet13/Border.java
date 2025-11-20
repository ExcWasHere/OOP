import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    public Border() {
        setTitle("Border Layout Demo");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        panel.add(new JButton("Utara"), BorderLayout.NORTH);
        panel.add(new JButton("Barat"), BorderLayout.WEST);
        panel.add(new JButton("Tengah"), BorderLayout.CENTER);
        panel.add(new JButton("Timur"), BorderLayout.EAST);
        panel.add(new JButton("Selatan"), BorderLayout.SOUTH);

        add(panel);
    }
}