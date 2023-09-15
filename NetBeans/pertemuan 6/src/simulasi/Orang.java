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
public class Orang {
    private String Nama;
    private String Alamat;
    
    public Orang(){
    }
    
    public Orang(String Nama, String Alamat){
        this.Nama = Nama;
        this.Alamat= Alamat;
    }
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public void Cetak(){
        System.out.println("Nama\t\t: "+getNama());
        System.out.println("Alamat\t\t: "+getAlamat());
    }
}
