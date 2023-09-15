/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasi2021;

public class Orang {
    private String nm,almt;
    
    public Orang(){
    }
    
    public Orang(String nm, String almt){
        this.nm = nm;
        this.almt= almt;
    }
    public String getNama(){
        return nm;
    }
    public void setNama(String nm){
        this.nm = nm;
    }
    public String getAlamat(){
        return almt;
    }
    public void setAlamat(String almt){
        this.almt = almt;
    }
    public void Cetak(){
        System.out.println("Nama\t\t: "+getNama());
        System.out.println("Alamat\t\t: "+getAlamat());
    }
}
