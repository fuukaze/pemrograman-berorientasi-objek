/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulasi2021;

public class SMADemo extends SMA {
    public static boolean isAlamatSama(SMA t1, SMA t2){
        String almt1 = t1.getAlamat().toLowerCase();
        String almt2 = t2.getAlamat().toLowerCase();
        return almt1.equals(almt2);
    }
    public static double main2(double x, double y){
        if (x<y)
            return x;
        else
            return y;
    
    }
    public static void main(String[] args) {
    SMA t[] = new SMA[3];
    t[0] = new SMA("Rizky", "Bali", 1, 11);
    t[1] = new SMA("Helmi", "Balikpapan", 2, 12);
    t[2] = new SMA();
    t[2].reset("Putra", "Bali", 3, 10);
    
    t[0].Cetak();
    t[1].Cetak();
    t[2].Cetak();
    
    if (isAlamatSama(t[0], t[2]))
        System.out.println("Alamat "+t[0].getNama()+" & "+t[2].getNama()+ " sama ");
    else
        System.out.println("Alamat Beda");
    if (t[0].getKelas()<=main2(t[1].getKelas(),t[2].getKelas()))
        System.out.println("Siswa yang paling muda adalah "+t[0].getNama());
    else if (t[1].getKelas()<=main2(t[0].getKelas(),t[2].getKelas()))
        System.out.println("Siswa yang paling muda adalah "+t[1].getNama());
    else if (t[2].getKelas()<=main2(t[0].getKelas(),t[1].getKelas()))
        System.out.println("Siswa yang paling muda adalah "+t[2].getNama());
    
    }
}
