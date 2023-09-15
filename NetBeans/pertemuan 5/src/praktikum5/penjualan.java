/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author mabdu
 */
public class penjualan {
        private String kode;
    private String GetTotalPembelian;
    private String nama;
    private float harga;
    private float total;
    private int jumlah;

    public void setdata(String kode, String nama, float harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float GetTotalPembelian (){
        this.total = this.harga * this .jumlah;
        return this.total;
    }

    public String Bonus(){
        if (GetTotalPembelian() >= 500000 && this.jumlah > 5){
            System.out.println("Anda Mendapatkan Bonus Sebuah Setrika");
        } 
        else if (GetTotalPembelian() >= 100000 && this.jumlah > 3){
            System.out.println("Anda Mendapatkan Bonus Sebuah Payung");
        }
        else if (GetTotalPembelian() >= 50000 && this.jumlah > 2){
            System.out.println("Anda Mendapatkan Bonus Sebuah Ballpoint");
        }
        else{
            System.out.println("Anda Tidak Mendapatkan Bonus Apapun");
        }
        return GetTotalPembelian;
    }

    public void CekNota(){
        System.out.println("Kode            : "+this.kode );
        System.out.println("Nama Barang     : "+this.nama);
        System.out.println("Harga Barang    : "+this.harga);
        System.out.println("Jumlah Barang   : "+this.jumlah);
        System.out.println("Total           : "+this.GetTotalPembelian());
    }
    public static void main(String[] args) {
        penjualan[] jual = new penjualan[2001];
        jual[0] = new penjualan();
        jual[0].setdata("bear", "bearbland", 12000, 10);
        jual[0].CekNota();
        jual[0].Bonus();
    }
}
