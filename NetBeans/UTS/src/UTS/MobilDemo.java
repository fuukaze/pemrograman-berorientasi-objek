/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author mabdu
 */
public class MobilDemo extends Mobil{
    public static boolean isNamaSama(Mobil m1, Mobil m2){ 
        String nama1 = m1.getNama().toLowerCase();
        String nama2 = m2.getNama().toLowerCase();
        return nama1.equals(nama2);
    }
    public static int min2(int a, int b){
        if (a < b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Mobil[] m = new Mobil[3];
        m[0] = new Mobil();
        m[1] = new Mobil("Limousine American Dreams", 1980, 26, 14);
        m[2] = new Mobil("Limousine Superbus", 2011, 6, 33);
        m[0].reset("Limousine Mercedes-Benz 500SEL", 1994, 4, 6);

        m[0].cetak();System.out.println("");
        m[1].cetak();System.out.println("");
        m[2].cetak();System.out.println("");
 
        System.out.print("Nama Limousine pertama dan kedua ");
        if(isNamaSama(m[0], m[2]))
            System.out.println("sama");
        else
            System.out.println("tidak sama");
        
        System.out.print("");
        if(m[0].getMuatan()<=min2(m[1].getMuatan(),m[2].getMuatan()))
            System.out.println("Muatan paling sedikit = "+m[0].getNama());
        else if(m[1].getMuatan()<=min2(m[0].getMuatan(),m[2].getMuatan()))
            System.out.println("Muatan paling sedikit = "+m[1].getNama());
        else
            System.out.println("Muatan paling sedikit = "+m[2].getNama()); 
    }
}


