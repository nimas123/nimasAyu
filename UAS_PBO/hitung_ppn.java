/**
 *
 * @author Nimas Ayu Anggun Kharisma
 * Teknik Informatika - univ. Islam Balitar
 * NIM : 22104410051
 */
import javax.swing.JOptionPane;
public class hitung_ppn implements ppn {

    String vendor;
    String tipe;
    double harga;
    
    public hitung_ppn(String vendor, String tipe, double harga){
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }   
    
    
    @Override
    public double hitungHargaSetelahPpn(double harga) {
        double ppn = 0.0;
        if (harga > 4000000 && harga <= 4200000){
            ppn = 0.01;
        } else if (harga > 4200000 && harga <= 4500000) {
            ppn = 0.02;
        } else if (harga > 4500000){
            ppn = 0.05;
        }
        return harga + (harga * ppn);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan Pilihan Anda = (1,2,3) ");
        int pilihan = Integer.parseInt(input);
        
        String vendor = null;
        String tipe = null;
        double harga = 0.0;
        
        switch (pilihan){
            case 1:
               vendor ="Samsung";
               tipe ="A1";
               harga = 5000000;
               break;
            case 2:
                vendor = "OPPO";
                tipe = "reno5";
                harga = 4400000;
                break;
            case 3:
                vendor = "Xiaomi";
                tipe = "A1";
                harga = 4100000;
                break;    
            default:
                System.out.println("Pilihan Anda Belum Masuk Dalam Sistem!");
                System.exit(0);
        }
                
        hitung_ppn main = new hitung_ppn (vendor, tipe, harga);
        double hitungHargaSetelahPpn = main.hitungHargaSetelahPpn(harga);
                
        System.out.println("Vendor = "+main.vendor);
        System.out.println("Tipe = "+main.tipe);
        System.out.println("Harga = "+hitungHargaSetelahPpn);
                  
        }
        
    }