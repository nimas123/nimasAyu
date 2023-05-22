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
public class energyKinetik {
    
    public double massa;
    public double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
        public double hitungenergyKinetik(){
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        energyKinetik ek = new energyKinetik();
        
        System.out.println("Masukkan Massa(kg): ");
        double massa = scanner.nextDouble();
        ek.setMassa(massa);
        
        System.out.println("Masukkan Kecepatan(m/s): ");
        double kecepatan = scanner.nextDouble();
        ek.setKecepatan(kecepatan);
        
        double energyKinetikHasil = ek.hitungenergyKinetik();
        
        System.out.println("Energi Kinetik adalah: "+energyKinetikHasil);
    }
    
    
    

    }
    
