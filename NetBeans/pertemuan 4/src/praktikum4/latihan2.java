/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author mabdu
 */
class konversiWaktu{
    int hari = 86400;
    int jam = 3600;
    int menit = 60;
    int detik ;
    public konversiWaktu(int detik){
        this.detik = detik;
    }
    public void cetakkonversi(){
        System.out.println("detik: " + detik);
        System.out.println("detik ke hari: " + detik/hari + " hari");
        System.out.println("detik ke jam: " + detik/jam + " jam");
        System.out.println("detik ke menit: " + detik/menit + " menit");
    }
}
public class latihan2 {
    public static void main(String[] args) {
        konversiWaktu konversiku = new konversiWaktu(50000000);
        
        konversiku.cetakkonversi();
    }
}
