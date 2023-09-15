/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021settergetter;

/**
 *
 * @author ruffi
 */
class hitungLuas{
    private int sisi; //attribute
    //public dan non modifier sama sama bisa diakses oleh lain class
    
    private int luas;
    
    //karena private tidak bisa diakses oleh class lain, isi nilai
    //harus dari fungsi yang public melalui parameternya
    public void setSisi(int sisi2){
        this.sisi=sisi2;
    }
    
    public int getSisi(){
        return this.sisi;
    }
    
//    public void calcLuas(){
////        return this.sisi*this.sisi;
////        return getSisi()*getSisi();
//        this.luas = getSisi()*getSisi();
//    }
    
    public void setLuas(){
        this.luas = getSisi()*getSisi();
    }
    
    public int getLuas(){
        return this.luas;
    }
}


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hitungLuas persegi = new hitungLuas();
        
        persegi.setSisi(80);
        //setter untuk memasukkan value / nilai
        
        System.out.println("Sisi "+persegi.getSisi());
        //getter untuk mendapatkan nilai
        
        persegi.setLuas();
        System.out.println("Luasnya adalah "+persegi.getLuas());
    }
    
}
