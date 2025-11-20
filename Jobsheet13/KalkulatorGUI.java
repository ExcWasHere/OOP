import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KalkulatorGUI extends JFrame {

    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtHasil;

    private JButton btnTambah;
    private JButton btnKurang;
    private JButton btnKali;
    private JButton btnBagi;

    public KalkulatorGUI() {
        setTitle("Kalkulator Sederhana");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));

        panel.add(new JLabel("Angka 1:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Angka 2:"));
        txtB = new JTextField();
        panel.add(txtB);

        panel.add(new JLabel("Hasil:"));
        txtHasil = new JTextField();
        txtHasil.setEditable(false);
        panel.add(txtHasil);

        JPanel panelTombol = new JPanel(new GridLayout(1, 4, 5, 5));
        btnTambah = new JButton("+");
        btnKurang = new JButton("-");
        btnKali = new JButton("*");
        btnBagi = new JButton("/");

        panelTombol.add(btnTambah);
        panelTombol.add(btnKurang);
        panelTombol.add(btnKali);
        panelTombol.add(btnBagi);

        add(panel, BorderLayout.CENTER);
        add(panelTombol, BorderLayout.SOUTH);
        btnTambah.addActionListener(this::tambahAction);
        btnKurang.addActionListener(this::kurangAction);
        btnKali.addActionListener(this::kaliAction);
        btnBagi.addActionListener(this::bagiAction);
    }

    private double[] getInput() throws NumberFormatException {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        return new double[]{a, b};
    }

    private void tambahAction(ActionEvent evt) {
        try {
            double[] v = getInput();
            double hasil = v[0] + v[1];
            txtHasil.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            showError();
        }
    }

    private void kurangAction(ActionEvent evt) {
        try {
            double[] v = getInput();
            double hasil = v[0] - v[1];
            txtHasil.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            showError();
        }
    }

    private void kaliAction(ActionEvent evt) {
        try {
            double[] v = getInput();
            double hasil = v[0] * v[1];
            txtHasil.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            showError();
        }
    }

    private void bagiAction(ActionEvent evt) {
        try {
            double[] v = getInput();
            if (v[1] == 0) {
                JOptionPane.showMessageDialog(this,
                        "Tidak bisa membagi dengan nol!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            double hasil = v[0] / v[1];
            txtHasil.setText(String.valueOf(hasil));
        } catch (NumberFormatException ex) {
            showError();
        }
    }

    private void showError() {
        JOptionPane.showMessageDialog(this,
                "Input harus berupa angka!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new KalkulatorGUI().setVisible(true);
        });
    }
}