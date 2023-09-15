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
class konversiSuhu{
    int celcius;
    int hasil;
    
    void kelvin(int celcius){
        hasil = (int) (celcius + 273.15) ;
        System.out.println("c - k ="+hasil);
    }
    void fahrenheit(int celcius){
        hasil = (int) (celcius * 1.8 + 32) ;
        System.out.println("c - f ="+hasil);
    }
    void rankine(int celcius){
        hasil = (int) (celcius * 1.8 + 491.67) ;
        System.out.println("c - r ="+hasil);
    }
    void delisle(int celcius){
        hasil = (int) ((100-celcius) * 1.5) ;
        System.out.println("c - d ="+hasil);
    }
    void newton(int celcius){
        hasil = (int) (celcius * 33/100) ;
        System.out.println("c - n ="+hasil);
    }
    void reaumur(int celcius){
        hasil = (int) (celcius * 0.8) ;
        System.out.println("c - re ="+hasil);
    }
    void romer(int celcius){
        hasil = (int) (celcius * 21/40 + 7.5) ;
        System.out.println("c - ro ="+hasil);
    }
}
public class latihan2 {
    public static void main(String[] args) {
        konversiSuhu CekSuhu = new konversiSuhu();
        
        CekSuhu.celcius = 7;
        
        CekSuhu.kelvin(7);
        CekSuhu.fahrenheit(7);
        CekSuhu.rankine(7);
        CekSuhu.delisle(7);
        CekSuhu.newton(7);
        CekSuhu.reaumur(7);
        CekSuhu.romer(7);
    }
}
