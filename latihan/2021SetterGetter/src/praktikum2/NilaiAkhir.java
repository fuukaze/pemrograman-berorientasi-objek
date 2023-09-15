/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author ruffi
 */
public class NilaiAkhir {
    //perhitungannya
    private double nilaiUts;
    private double pNilaiUts;

    
    public double getNilaiUts() {
        return this.nilaiUts;
    }

    public void setNilaiUts(int nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getpNilaiUts() {
        return this.pNilaiUts;
    }

    public void setpNilaiUts() {
        this.pNilaiUts = getNilaiUts()*0.2;
    }
    
}

//class main yg akan di run sebagai class utama dari projek
class Main{
    public static void main(String[] args) {
        NilaiAkhir joko = new NilaiAkhir();
        joko.setNilaiUts(8);
        joko.setpNilaiUts();
        System.out.println("Tampilkan presentase nilai uts\t: "+joko.getpNilaiUts());
        System.out.print("Tampilkan presentase nilai uts: "+joko.getpNilaiUts());
    }
}
