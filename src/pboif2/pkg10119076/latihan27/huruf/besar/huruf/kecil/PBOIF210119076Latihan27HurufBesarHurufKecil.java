/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan27.huruf.besar.huruf.kecil;
import java.util.Scanner;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * NIM : 10119076
 * Kelas : IF2
 */
public class PBOIF210119076Latihan27HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Masukkan Kalimat: ");
        Kalimat = scanner.nextLine();
 
        String hurufBesar = Kalimat.toUpperCase();
        String hurufKecil = Kalimat.toLowerCase();
 
        System.out.println("Masukkan Kalimat: " + Kalimat);
        System.out.println("HURUF BESAR: " + hurufBesar);
        System.out.println("huruf kecil: " + hurufKecil);
        
        System.out.println("_________________________________");
        System.out.println("Developed by Sulthon Naufal Akmal");
    }

}
    
   

