/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasi;

/**
 *
 * @author mabdu
 */
public class Murid extends Orang{
    private int NoInduk;
    
    public Murid(){
    
    }
    public Murid(String Nama, String Alamat, int NoInduk){
        super(Nama,Alamat);
        this.NoInduk = NoInduk;
          
    }
    public int getNoInduk(){
        return NoInduk;
    }
    public void setNoInduk(int NoInduk){
        this.NoInduk = NoInduk;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("No Induk Siswa\t: "+getNoInduk());
    }
}
