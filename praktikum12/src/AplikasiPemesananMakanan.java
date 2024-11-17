import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiPemesananMakanan extends JFrame {
    private JTextField txtNama, txtAlamat, txtNoTelp;
    private JCheckBox cbSteak, cbSpaghetti, cbPizza;
    private JLabel lblTotalBayar;
    private JTextArea txtAreaPesanan;
    private int totalBayar;

    public AplikasiPemesananMakanan() {
        setTitle("Aplikasi Pemesanan Makanan");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Data Customer
        JLabel lblTitle = new JLabel("APLIKASI PEMESANAN");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16));
        lblTitle.setBounds(150, 10, 200, 30);
        add(lblTitle);

        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 50, 100, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(120, 50, 200, 25);
        add(txtNama);

        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 90, 100, 25);
        add(lblAlamat);

        txtAlamat = new JTextField();
        txtAlamat.setBounds(120, 90, 200, 25);
        add(txtAlamat);

        JLabel lblNoTelp = new JLabel("No Telp:");
        lblNoTelp.setBounds(20, 130, 100, 25);
        add(lblNoTelp);

        txtNoTelp = new JTextField();
        txtNoTelp.setBounds(120, 130, 200, 25);
        add(txtNoTelp);

        // Pilih Menu
        JLabel lblMenu = new JLabel("Pilih Menu");
        lblMenu.setBounds(20, 170, 100, 25);
        add(lblMenu);

        cbSteak = new JCheckBox("Steak (100000)");
        cbSteak.setBounds(120, 170, 200, 25);
        add(cbSteak);

        cbSpaghetti = new JCheckBox("Spaghetti (40000)");
        cbSpaghetti.setBounds(120, 200, 200, 25);
        add(cbSpaghetti);

        cbPizza = new JCheckBox("Pizza (80000)");
        cbPizza.setBounds(120, 230, 200, 25);
        add(cbPizza);

        // Total Bayar
        JLabel lblTotal = new JLabel("TOTAL BAYAR");
        lblTotal.setBounds(20, 270, 100, 25);
        add(lblTotal);

        lblTotalBayar = new JLabel("0");
        lblTotalBayar.setFont(new Font("Arial", Font.BOLD, 20));
        lblTotalBayar.setBounds(120, 270, 200, 25);
        add(lblTotalBayar);

        JButton btnTambah = new JButton("TAMBAH");
        btnTambah.setBounds(120, 310, 100, 25);
        add(btnTambah);

        // Data Penjualan
        txtAreaPesanan = new JTextArea();
        txtAreaPesanan.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaPesanan);
        scrollPane.setBounds(20, 350, 450, 200);
        add(scrollPane);

        // Action Listener
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalBayar = 0;
                StringBuilder pesanan = new StringBuilder();
                pesanan.append("Nama: ").append(txtNama.getText()).append("\n");
                pesanan.append("Alamat: ").append(txtAlamat.getText()).append("\n");
                pesanan.append("Telp: ").append(txtNoTelp.getText()).append("\n");
                pesanan.append("-----------------------------\n");
                pesanan.append("Pesanan:\n");

                if (cbSteak.isSelected()) {
                    totalBayar += 100000;
                    pesanan.append("- Steak (100000)\n");
                }
                if (cbSpaghetti.isSelected()) {
                    totalBayar += 40000;
                    pesanan.append("- Spaghetti (40000)\n");
                }
                if (cbPizza.isSelected()) {
                    totalBayar += 80000;
                    pesanan.append("- Pizza (80000)\n");
                }

                pesanan.append("-----------------------------\n");
                pesanan.append("Total Bayar: Rp. ").append(totalBayar).append("\n");

                lblTotalBayar.setText(String.valueOf(totalBayar));
                txtAreaPesanan.setText(pesanan.toString());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AplikasiPemesananMakanan app = new AplikasiPemesananMakanan();
            app.setVisible(true);
        });
    }
}
