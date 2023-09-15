/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author mabdu
 */
class buku{
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    public buku(String judul,String pengarang,String penerbit,int tahun ){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public void cetakbuku(){
        System.out.println("judul: "+judul);
        System.out.println("pengarang: "+pengarang);
        System.out.println("penerbit: "+penerbit);
        System.out.println("tahun: "+tahun);
    }
}
public class latihan1 {
    public static void main(String[] args) {
        buku bukuku = new buku("libur akhir sekolah","gramedia","joko",2019);
        bukuku.cetakbuku();
    }
}
