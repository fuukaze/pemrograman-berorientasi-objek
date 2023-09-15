/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author mabdu
 */
class OperasiHitung{
    int hasil;
    int bil1;
    int bil2;
    void tambah(int bil1,int bil2){
        hasil = bil1 + bil2;
        System.out.println(bil1+"+"+bil2+"="+hasil);
    }
    void kurang(int bil1,int bil2){
        hasil = bil1 - bil2;
        System.out.println(bil1+"-"+bil2+"="+hasil);
    }
    void kali(int bil1,int bil2){
        hasil = bil1 * bil2;
        System.out.println(bil1+"*"+bil2+"="+hasil);
    }
    void bagi (int bil1,int bil2){
        hasil = bil1 / bil2;
        System.out.println(bil1+"/"+bil2+"="+hasil);
    }
}
public class latihan1 {
    public static void main(String[] args) {
        OperasiHitung hitung = new OperasiHitung();
        
        hitung.bil1 = 15;
        hitung.bil2 = 15;
        
        hitung.tambah(15, 15);
        hitung.kurang(15, 15);
        hitung.kali(15, 15);
        hitung.bagi(15, 15);
    }
}
