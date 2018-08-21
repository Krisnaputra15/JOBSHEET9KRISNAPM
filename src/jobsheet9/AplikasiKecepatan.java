/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class AplikasiKecepatan {
    public static int i(int jrk, int wkt) {
        int kec = jrk / wkt;
        return  kec;
    }
    
public static void main(String[] args) {
    Scanner b = new Scanner(System.in);
    
    System.out.print("Masukkan jarak : ");
    int jrk = b.nextInt();
    
    System.out.print("Masukkan waktu tempuh : ");
    int wkt = b.nextInt();
    
    double z ;
    z = i (jrk,wkt);
    
    
    System.out.println("kecepatan : " + z+ " km/jam");
}
    
}
