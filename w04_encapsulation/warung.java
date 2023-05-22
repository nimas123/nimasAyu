/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w04_encapsulation;

import java.util.Scanner;

/**
 *
 * @author Nimas Ayu Anggun Kharisma
 * Teknik Informatika - univ. Islam Balitar
 * NIM : 22104410051
 */
public class warung {
    
    public String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
        //minuman yang ungu merujuk ke global variable di atas, yang minuman abu cuma untuk function ini
    }
    

    
    public static void main(String[] args) {
        
        warung warung = new warung();
        System.out.println("Masukkan Makanan: ");
        Scanner varMakanan = new Scanner(System.in);
        warung.setMakanan(varMakanan.nextLine());
        
       // warung.setMakanan("Mie Ayam");
        //warung.setMinuman("Es Teh");
        
        
        System.out.println("Menu Makanan: "+warung.getMakanan()); //mencampur/menambah string dikasih tanda +
       // System.out.println("Menu Minuman: "+warung.getMinuman());
    }

}
