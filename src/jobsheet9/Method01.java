/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

/**
 *
 * @author ASUS
 */
public class Method01 {

    /* 
   /*
     */
    public static int hitung(int a, int b) {
        int hitung = a + b;
        return hitung;
        // TODO code application logic here
    }
    public static void main(String[] args) {
        int x;
        int bil1 = 18,bil2 = 02;
        
        x = hitung(bil1,bil2);
        System.out.println("hasil : " + x);
    }
    
}
