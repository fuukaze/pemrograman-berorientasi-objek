/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg2;
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruffi
 */

class MMORPG {
    String gender; 
    int level;
    int pintu;
    String senjata;
    String armor;
    String sepatu;
    String helm;
    
    public void Serang(){
        System.out.println("Menyerang");
    }
    public void Bertahan(){
        System.out.println("Bertahan dari serangan");
    }
    public void Menghindar(){
        System.out.println("Menghindari serangan");
    }
}
class Truk {
    String transmisi; 
    int roda;
    int harga;
    String warna;
    
    public void Maju(){
        System.out.println("Bergerak Maju");
    }
    public void Mundur(){
        System.out.println("Bergerak Mundur");
    }
    public void Belok(){
        System.out.println("Berbelok");
    }
}
class Laptop {
    String cpu;
    String vga;
    int harga;
    String warna;
    
    public void Ngetik(){
        System.out.println("Mengetik tugas");
    }
    public void Ngegame(){
        System.out.println("Bermain game");
    }
    public void Nonton(){
        System.out.println("Menonton film");
    }
}
class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MMORPG mage = new MMORPG();
        mage.gender = "female";
        mage.level = 30;
        mage.senjata = "tongkat";
        mage.armor = "jubah";
        mage.sepatu = "sepatu kulit";
        mage.helm = "helm mage";
        System.out.println("Attribut Akun");
        System.out.println("gender = "+mage.gender);
        System.out.println("level = "+mage.level);
        System.out.println("senjata = "+mage.senjata);
        System.out.println("armor = "+mage.armor);
        System.out.println("sepatu = "+mage.sepatu);
        System.out.println("helm = "+mage.helm);
        mage.Serang();
        mage.Menghindar();
        System.out.println("============================");
        Truk DAF = new Truk();
        DAF.transmisi = "manual";
        DAF.roda = 6;
        DAF.harga = 1000000000;
        DAF.warna = "putih";
        System.out.println("Rincian Truk");
        System.out.println("jenis transmisi = "+DAF.transmisi);
        System.out.println("roda = "+DAF.roda);
        System.out.println("harga = "+DAF.harga);
        System.out.println("warna = "+DAF.warna);
        DAF.Maju();
        DAF.Mundur();
        DAF.Belok();
        System.out.println("============================");
        Laptop asus = new Laptop();
        asus.cpu = "CORE I5 GEN 10";
        asus.vga = "GTX 1660Ti";
        asus.harga = 140000000;
        asus.warna = "merah";
        System.out.println("Rincian ASUS");
        System.out.println("jenis CPU = "+asus.cpu);
        System.out.println("jenis VGA = "+asus.vga);
        System.out.println("harga = "+asus.harga);
        System.out.println("warna = "+asus.warna);
        asus.Ngegame();
        asus.Nonton();
        System.out.println("============================");
    }
    
}