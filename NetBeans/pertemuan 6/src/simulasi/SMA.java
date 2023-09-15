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
public class SMA extends Murid {
    private int KelasSiswa;
    
    public SMA(){
    
    }
    public SMA(String Nama, String Alamat, int NoInduk, int KelasSiswa ){
        super(Nama,Alamat,NoInduk);
        this.KelasSiswa = KelasSiswa;
          
    }
    public int getKelasSiswa(){
        return KelasSiswa;
    }
    public void setKelasSiswa(int KelasSiswa){
        this.KelasSiswa = KelasSiswa;
        
    }
    public void reset(String Nama, String Alamat, int NoInduk, int KelasSiswa){
       setNama(Nama);
       setAlamat(Alamat);
       setNoInduk(NoInduk);
       setKelasSiswa(KelasSiswa);
    }
    public int KelasSiswa(int KelasSiswa){
        return KelasSiswa - 9;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("Kelas\t\t: "+getKelasSiswa()+" SMA ");
    }
}
