/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2021constructor;

/**
 *
 * @author ruffi
 */
class LuasSegitiga{
    private int alas;
    private int tinggi;
    private String nama;

    //nama method constructor harus sama dengan class
    public LuasSegitiga(){

    }
    
    //nama method constructor harus sama dengan class
    public LuasSegitiga(int alas, int tinggi){
        //this itu yang menggunakan attribute, sebelah kanan yg dari parameter
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public LuasSegitiga(int alas, int tinggi, String nama){
        //this itu yang menggunakan attribute, sebelah kanan yg dari parameter
        this.alas = alas;
        this.tinggi = tinggi;
        this.nama = nama;
    }
    
    public int hitungLuas(){
        return this.alas*this.tinggi/2;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Constructor bisa kita set lebih fleksibel tentang berapa parameternya
        LuasSegitiga seg3 = new LuasSegitiga();
        
        //Penggunaan Constructor
        LuasSegitiga seg1 = new LuasSegitiga(10, 5);
        LuasSegitiga seg2 = new LuasSegitiga(10, 5, "Segitiga ke dua");
        
        
        System.out.println("Luasnya adalah "+seg1.hitungLuas());
        
        //menggunakan get untuk dapat kan nilai dari constructor
        System.out.println("Luas "+seg2.getNama()+" adalah "+seg2.hitungLuas());
    }
    
}
