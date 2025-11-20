import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyInputForm extends JFrame {

    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JTextField cField;

    private JButton btnKali;
    private JButton btnTambah;

    private JPanel panel;

    private static final int FIELD_WIDTH = 10;

    public MyInputForm() {
        setTitle("Percobaan 2 - MyInputForm");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createTextField();
        createButton();
        createPanel();
    }

    private void createTextField() {
        aLabel = new JLabel("Nilai A:");
        bLabel = new JLabel("Nilai B:");
        cLabel = new JLabel("Hasil :");

        aField = new JTextField(FIELD_WIDTH);
        bField = new JTextField(FIELD_WIDTH);
        cField = new JTextField(FIELD_WIDTH);
        cField.setEditable(false);
    }

    private void createButton() {
        btnKali = new JButton("Kali");
        btnTambah = new JButton("Tambah");
        btnKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(aField.getText());
                    int b = Integer.parseInt(bField.getText());
                    int hasil = a * b;
                    cField.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(MyInputForm.this,
                            "Input harus berupa angka!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(aField.getText());
                    int b = Integer.parseInt(bField.getText());
                    int hasil = a + b;
                    cField.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(MyInputForm.this,
                            "Input harus berupa angka!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void createPanel() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        panel.add(aLabel);
        panel.add(aField);

        panel.add(bLabel);
        panel.add(bField);

        panel.add(cLabel);
        panel.add(cField);

        panel.add(btnKali);
        panel.add(btnTambah);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyInputForm frame = new MyInputForm();
            frame.setVisible(true);
        });
    }
}