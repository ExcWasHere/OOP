import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Swing extends JFrame {
    private String nama, nim, jenisKelamin, info, jurusan, semester, alamat;
    private JTextField txtNama;
    private JTextField txtNim;
    private JTextField txtAlamat;
    private JRadioButton rbLaki;
    private JRadioButton rbPerempuan;
    private JCheckBox cbProgramming;
    private JCheckBox cbDesain;
    private JCheckBox cbNetworking;
    private JComboBox<String> cmbJurusan;
    private JList<String> listSemester;
    private JTextArea txtHasil;
    private JButton cmdTampil;
    private JButton cmdClear;

    public Swing() {
        setTitle("Data Mahasiswa");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        JPanel formPanel = new JPanel(new GridLayout(9, 2, 5, 5));
        formPanel.add(new JLabel("Nama"));
        txtNama = new JTextField(20);
        formPanel.add(txtNama);
        formPanel.add(new JLabel("NIM"));
        txtNim = new JTextField(20);
        formPanel.add(txtNim);
        formPanel.add(new JLabel("Alamat"));
        txtAlamat = new JTextField(20);
        formPanel.add(txtAlamat);
        formPanel.add(new JLabel("Jenis Kelamin"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rbLaki = new JRadioButton("Laki-laki");
        rbPerempuan = new JRadioButton("Perempuan");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbLaki);
        bg.add(rbPerempuan);
        genderPanel.add(rbLaki);
        genderPanel.add(rbPerempuan);
        formPanel.add(genderPanel);
        formPanel.add(new JLabel("Minat"));
        JPanel minatPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cbProgramming = new JCheckBox("Programming");
        cbDesain = new JCheckBox("Desain");
        cbNetworking = new JCheckBox("Networking");
        minatPanel.add(cbProgramming);
        minatPanel.add(cbDesain);
        minatPanel.add(cbNetworking);
        formPanel.add(minatPanel);
        formPanel.add(new JLabel("Jurusan"));
        cmbJurusan = new JComboBox<>(new String[]{
                "DIV Teknik Informatika",
                "DIII Teknik Informatika",
                "DIII Teknologi Informasi"
        });
        formPanel.add(cmbJurusan);
        formPanel.add(new JLabel("Semester"));
        listSemester = new JList<>(new String[]{
                "Semester 1", "Semester 2", "Semester 3",
                "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"
        });
        listSemester.setVisibleRowCount(4);
        formPanel.add(new JScrollPane(listSemester));
        cmdTampil = new JButton("Tampil");
        cmdClear = new JButton("Clear");
        formPanel.add(cmdTampil);
        formPanel.add(cmdClear);
        txtHasil = new JTextArea(8, 40);
        txtHasil.setEditable(false);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(txtHasil), BorderLayout.CENTER);

        add(panel);
        cmdTampil.addActionListener(this::cmdTampilActionPerformed);
        cmdClear.addActionListener(this::cmdClearActionPerformed);
    }
    private void cmdTampilActionPerformed(ActionEvent evt) {
        nama = txtNama.getText();
        nim = txtNim.getText();
        alamat = txtAlamat.getText().trim();
        if (alamat.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Alamat belum diisi!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            txtAlamat.requestFocus();
            return;
        }
        if (rbLaki.isSelected()) {
            jenisKelamin = "Laki-laki";
        }
        if (rbPerempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        }
        info = "";
        if (cbProgramming.isSelected()) {
            info += "Programming ";
        }
        if (cbDesain.isSelected()) {
            info += "Desain ";
        }
        if (cbNetworking.isSelected()) {
            info += "Networking ";
        }

        jurusan = (String) cmbJurusan.getSelectedItem();
        semester = listSemester.getSelectedValue();

        txtHasil.setText(
                "Nama       : " + nama + "\n" +
                "NIM        : " + nim + "\n" +
                "Alamat     : " + alamat + "\n" +
                "Jenis Kel  : " + jenisKelamin + "\n" +
                "Minat      : " + info + "\n" +
                "Jurusan    : " + jurusan + "\n" +
                "Semester   : " + semester + "\n"
        );
    }
    private void cmdClearActionPerformed(ActionEvent evt) {
        txtNama.setText("");
        txtNim.setText("");
        txtAlamat.setText("");
        rbLaki.setSelected(false);
        rbPerempuan.setSelected(false);
        cbProgramming.setSelected(false);
        cbDesain.setSelected(false);
        cbNetworking.setSelected(false);
        listSemester.clearSelection();
        txtHasil.setText("");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }
}