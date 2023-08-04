/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package WLast_UAS;

/**
 *
 * @author Jonathan Setya Widayat
 * @NIM 22104410047
 * @Prodi Teknik Informatika - Universitas Islam Balitar
 */
import javax.swing.JOptionPane;

public class HitungOperasi {
    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil;

        while (true) {
            String inputPilihan = JOptionPane.showInputDialog(null,
                    "Menu Pilihan\n" +
                            "1. Tambahkan a + b\n" +
                            "2. Kurangkan a - b\n" +
                            "3. Keluar\n" +
                            "Masukkan pilihan (1/2/3)");

            if (inputPilihan == null) {
                // Jika pengguna mengklik tombol "Cancel" atau menutup dialog
                JOptionPane.showMessageDialog(null, "Program berakhir.");
                System.exit(0);
            }

            int pilihan;
            try {
                pilihan = Integer.parseInt(inputPilihan);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan pilih lagi.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    hasil = a + b;
                    JOptionPane.showMessageDialog(null, "Hasil dari a + b = " + hasil);
                    break;
                case 2:
                    hasil = a - b;
                    JOptionPane.showMessageDialog(null, "Hasil dari a - b = " + hasil);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Terima kasih! Program berakhir.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
