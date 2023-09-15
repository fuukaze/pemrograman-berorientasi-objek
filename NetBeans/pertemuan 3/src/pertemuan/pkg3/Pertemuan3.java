/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg3;

/**
 *
 * @author mabdu
 */
class Mhs {
    private String nim;
    private String nama;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiTugas;
    private double pnilaiUTS;
    private double pnilaiUAS;
    private double pnilaiTugas;
    private double nilaiAkhir;
    
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNilaiUTS(double nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }
    public void setNilaiUAS(double nilaiUAS){
        this.nilaiUAS = nilaiUAS;
    }
    public void setNilaiTugas(double nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    public void setpNilaiUTS(double pnilaiUTS){
        this.pnilaiUTS = pnilaiUTS;
    }
    public void setpNilaiUAS(double pnilaiUAS){
        this.pnilaiUAS = pnilaiUAS;
    }
    public void setpNilaiTugas(double pnilaiTugas){
        this.pnilaiTugas = pnilaiTugas;
    }
    public void setNilaiAkhir(double nilaiAkhir){
        this.nilaiAkhir = nilaiAkhir;
    }
    public String getNim(){
        return this.nim;
    }
    public String getNama(){
        return this.nama;
    }
    public double getNilaiUTS(){
        return this.nilaiUTS;
    }
    public double getNilaiUAS(){
        return this.nilaiUAS;
    }
    public double getNilaiTugas(){
        return this.nilaiTugas;
    }
    public double getpNilaiUTS(){
        return getNilaiUTS()*0.2;
    }
    public double getpNilaiUAS(){
        return getNilaiUAS()*0.45;
    }
    public double getpNilaiTugas(){
        return getNilaiTugas()*0.35;
    }
    public double getNilaiAkhir(){
        return getpNilaiUTS()+getpNilaiUAS()+getpNilaiTugas();
    }
}
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mhs menghitung = new Mhs();
        menghitung.setNama("Aziz");
        menghitung.setNim("A11.2019.11790");
        menghitung.setNilaiUTS(90);
        menghitung.setNilaiTugas(85);
        menghitung.setNilaiUAS(80);
        
        System.out.println("Nim : "+menghitung.getNim());
        System.out.println("Nama : "+menghitung.getNama());
        System.out.println("Nilai Tugas : "+menghitung.getNilaiTugas()+" :35% "+menghitung.getpNilaiTugas());
        System.out.println("Nilai UTS : "+menghitung.getNilaiUTS()+" :20% "+menghitung.getpNilaiUTS());
        System.out.println("Nilai UAS : "+menghitung.getNilaiUAS()+" :45% "+menghitung.getpNilaiUAS());
        System.out.println("Nilai Akhir : "+menghitung.getNilaiAkhir());
    }
    
}
