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
public class SMA extends Murid {
    private int Class;
    
    public SMA(){
    
    }
    public SMA(String nm, String almt, int NIS, int Class ){
        super(nm,almt,NIS);
        this.Class = Class;
          
    }
    public int getKelas(){
        return Class;
    }
    public void setKelas(int Class){
        this.Class = Class;
        
    }
    public void reset(String nm, String almt, int NIS, int Class){
       setNama(nm);
       setAlamat(almt);
       setNoIndukSiswa(NIS);
       setKelas(Class);
    }
    public int KelasSMA(int Class){
        return Class - 9;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("Kelas\t\t: "+getKelas()+" SMA ");
    }
}
