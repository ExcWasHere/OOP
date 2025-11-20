import javax.swing.*;

public class Box extends JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel panel;

    public Box() {
        setTitle("Box Layout Demo");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("Tombol 1"));
        panel.add(javax.swing.Box.createVerticalStrut(5));
        panel.add(new JButton("Tombol 2"));
        panel.add(javax.swing.Box.createVerticalStrut(5));
        panel.add(new JButton("Tombol 3"));
        panel.add(javax.swing.Box.createVerticalStrut(5));
        panel.add(new JButton("Tombol 4"));

        add(panel);
    }
}