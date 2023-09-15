/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author mabdu
 */
public class Mobil extends Darat{
   private int muatan;
   
    public Mobil(){

    }
    public Mobil(String nama, int tahunProduksi, int roda, int muatan){
        super(nama, tahunProduksi, roda);
        this.muatan = muatan;
    }
    public int getMuatan() {
        return muatan;
    }
    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }
   public void reset(String nama, int tahunProduksi, int roda, int muatan){
       setNama(nama);
       setTahunProduksi(tahunProduksi);
       setRoda(roda);
       setMuatan(muatan);
   }
   public String kategori(int muatan){
       if (muatan <= 6 ){
           return "Mini";
       } else if (muatan <= 15 ){
           return "sedang";
       } else {
           return "Besar";
       }
   }
   public void cetak(){
       super.cetak();
       System.out.println("Muatan anda : "+getMuatan());
       System.out.println("Ukuran muata  : "+kategori(muatan));
   }
}
