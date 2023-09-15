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
public class HitungLuas {
    
    
    //function
    public int luasPersegi(int panjang, int lebar){
        return panjang*lebar;
    }
    
    public double luasSegitiga(int alas, int tinggi){
        return alas*tinggi/2;
    }
    
}

class luasPersegi{
    public static void main(String[] args){
        //cara buat objek
        HitungLuas persegi1 = new HitungLuas(); //nama classnya dulu, nama objek
        
        
        int Luas1 = persegi1.luasPersegi(4, 3);
        double Luas2 = persegi1.luasSegitiga(10, 2);
        
        System.out.println("Luas Persegi dari 4x3 adalah "+ Luas1);
        System.out.println("Luas Segitiga: "+ Luas2);
        
        double Luas3 = Luas1 + Luas2;
        
        System.out.println("Hasil Penjumlahan: "+Luas3);
    }
}
