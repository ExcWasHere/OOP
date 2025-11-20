import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Swing2 extends JFrame {

    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JTable table;
    private DefaultTableModel tableModel;
    private JPanel panel3;
    private JTree tree;
    private JTextField txtTurunan;
    private JButton cmdTambah;

    public Swing2() {
        setTitle("Percobaan 5 - Swing2");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();
    }

    private void initUI() {
        tabbedPane = new JTabbedPane();
        panel1 = new JPanel();
        panel1.add(new JLabel("Halaman pertama"));
        tabbedPane.addTab("Halaman 1", panel1);
        panel2 = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel(
                new Object[][]{
                        {"001", "Andi", "TI"},
                        {"002", "Budi", "TI"},
                        {"003", "Cici", "MI"},
                },
                new String[]{"NIM", "Nama", "Jurusan"}
        );
        table = new JTable(tableModel);
        panel2.add(new JScrollPane(table), BorderLayout.CENTER);
        tabbedPane.addTab("Halaman 2", panel2);
        panel3 = new JPanel(new BorderLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
        tree = new JTree(root);
        panel3.add(new JScrollPane(tree), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("Masukan Pewaris/Turunan"));
        txtTurunan = new JTextField(15);
        inputPanel.add(txtTurunan);
        cmdTambah = new JButton("Tambah");
        inputPanel.add(cmdTambah);

        panel3.add(inputPanel, BorderLayout.SOUTH);

        tabbedPane.addTab("Halaman 3", panel3);

        add(tabbedPane);

        cmdTambah.addActionListener(this::cmdTambahActionPerformed);
    }

    private void cmdTambahActionPerformed(ActionEvent evt) {
        String teks = txtTurunan.getText().trim();
        if (teks.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Teks turunan belum diisi!",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode root =
                (DefaultMutableTreeNode) model.getRoot();
        TreePath selectedPath = tree.getSelectionPath();
        DefaultMutableTreeNode selectedNode;
        if (selectedPath != null) {
            selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();
        } else {
            selectedNode = root;
        }

        DefaultMutableTreeNode child = new DefaultMutableTreeNode(teks);
        selectedNode.add(child);
        model.reload();

        txtTurunan.setText("");
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Swing2().setVisible(true);
        });
    }
}