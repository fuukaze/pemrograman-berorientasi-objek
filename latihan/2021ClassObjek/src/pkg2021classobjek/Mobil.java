/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021classobjek;

/**
 *
 * @author ruffi
 */

public class Mobil {
    int roda; //penyebutan dulu tipe datanya baru nama variabel
    String warna;
    int pintu;
    String transmisi;
    String modelSpion;
    String stir;
    
    //kenapa void, karena procedure
    //kalo function, harus ada tipe data
    public void maju(){
        System.out.println("Jalan Maju");
    }
    
    public void belok(){
        System.out.println("Belok");
    }
    
    public void mundur(){
        System.out.println("Mundur");
    }
    
    public void rem(){
        System.out.println("Berhenti ndadak");
    }
    
    //contoh function
    public double luasSegitiga(){
        return 5/2;
    }
}

class objekMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PabrikMobil Mobilku = new PabrikMobil();
        Mobilku.pintu=2;
        Mobilku.warna="Ungu Gelap";
        Mobilku.roda=3;
        System.out.println("Definisi Mobilku");
        System.out.println("Pintu1 "+Mobilku.pintu);
        Mobilku.maju();
        Mobilku.rem();
    }
    
}
