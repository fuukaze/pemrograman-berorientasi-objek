/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasi2021;

/**
 *
 * @author user
 */
public class Murid extends Orang {
    private int NIS;
    
    public Murid(){
    
    }
    public Murid(String nm, String almt, int NIS){
        super(nm,almt);
        this.NIS = NIS;
          
    }
    public int getNoIndukSiswa(){
        return NIS;
    }
    public void setNoIndukSiswa(int NIS){
        this.NIS = NIS;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("No Induk Siswa\t: "+getNoIndukSiswa());
    }
}
