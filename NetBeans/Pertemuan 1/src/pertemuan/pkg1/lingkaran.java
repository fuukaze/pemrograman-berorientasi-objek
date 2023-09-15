/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg1;

/**
 *
 * @author mabdu
 */
public class lingkaran {
    public static void main(String[] args) {
     // TODO code application logic here
        System.out.println("Menghitung lingkaran");
        double pi, r, luas, keliling;
        pi = 3.14; 
        r = 7;
        luas = pi * r * r;
        keliling = pi * 2 * r;
        System.out.println("jari-jari = "+r);
        System.out.println("diameter = "+(2*r));
        System.out.println("luas = "+luas);
        System.out.println("keliling = "+keliling);
    }
}
