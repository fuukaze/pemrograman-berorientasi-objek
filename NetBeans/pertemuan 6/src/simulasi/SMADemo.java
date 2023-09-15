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
public class SMADemo extends SMA {
    public static boolean isAlamatSMA(SMA t1, SMA t2){
        String alamat1 = t1.getAlamat().toLowerCase();
        String alamat2 = t2.getAlamat().toLowerCase();
        return alamat1.equals(alamat2);
    }
    public static double main2(double a, double b){
        if (a<b)
            return a;
        else
            return b;
    
    }
    public static void main(String[] args) {
    SMA x[] = new SMA[3];
    x[0] = new SMA("Rizky", "Bali", 1, 11);
    x[1] = new SMA("Helmi", "Balikpapan", 2, 12);
    x[2] = new SMA();
    x[2].reset("Putra", "Bali", 3, 10);
    
    x[0].Cetak();
    x[1].Cetak();
    x[2].Cetak();
    
    if (isAlamatSMA(x[0], x[2]))
        System.out.println("Alamat "+x[0].getNama()+" & "+x[2].getNama()+ " sama ");
    else
        System.out.println("Alamat Beda");
    if (x[0].getKelasSiswa()<=main2(x[1].getKelasSiswa(),x[2].getKelasSiswa()))
        System.out.println("Siswa yang paling muda adalah "+x[0].getNama());
    else if (x[1].getKelasSiswa()<=main2(x[0].getKelasSiswa(),x[2].getKelasSiswa()))
        System.out.println("Siswa yang paling muda adalah "+x[1].getNama());
    else if (x[2].getKelasSiswa()<=main2(x[0].getKelasSiswa(),x[1].getKelasSiswa()))
        System.out.println("Siswa yang paling muda adalah "+x[2].getNama());
    
    }
}

