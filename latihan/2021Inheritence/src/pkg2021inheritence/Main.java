/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021inheritence;

/**
 *
 * @author ruffi
 */

//Superclass BangunDatar
class BangunDatar{
    public void luas(){
        System.out.println("Aplikasi Menghitung Luas");
    }
    
    public void keliling(){
        System.out.println("Aplikasi Menghitung Keliling");
    }
}

//Subclass Persegi dari Superclass BangunDatar
class Persegi extends BangunDatar{
    public float sisi;
}


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Syarat untuk menggunakan class adalah membuat objek dari class tsb
        Persegi meja = new Persegi();
        meja.sisi = 2.8f;
        
        meja.luas();
        System.out.println("Sisi meja yang bentuknya persegi adalah "+meja.sisi);
    }
    
}
