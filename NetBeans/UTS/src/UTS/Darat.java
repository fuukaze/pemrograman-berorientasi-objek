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
public class Darat extends Kendaraan{
    private int roda;
    
    public Darat(){
        
    }
    
    public Darat(String nama, int tahunProduksi, int roda){
       super(nama, tahunProduksi);
       this.roda = roda;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }
    
    public void cetak(){
        super.cetak();
        System.out.println("Banyak roda : "+getRoda());
    }
}
