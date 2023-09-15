package hitungkramik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My MSI
 */
public class HitungKKM {
    public static void main(String[] args) {
        HitungPersegi KMDepan = new HitungPersegi();
        KMDepan.setPanjang(10);
        
        System.out.println("Sisi : "+KMDepan.getPanjang());
        System.out.println("Luas 1 Kramik : "+KMDepan.Luas());
        System.out.println("Hitung Luas Lantai Dalam Saja : "+KMDepan.HitungJmlKramik(5));
        System.out.println("Hitung Luas Lantai Dalam dan Tembok : "+KMDepan.HitungJmlKramik(5,5));
        System.out.println("Hitung Luas Lantai Dalam, Tembok dan lantai Luar: "+KMDepan.HitungJmlKramik(5,5,5));
    }
}
