/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

import java.util.Scanner;

/**
 *
 * @author mabdu
 */
public class hitungFaktorial {
    public static void main(String[] args) {
        int n,counter,faktorial =1;
       System.out.print("Masukan Angka : ");
       Scanner a = new Scanner (System.in);
       n = a.nextInt();
       if (n<0){
           
       }
       else {
           for (counter=1; counter<=n-1; counter++){
               faktorial = faktorial*counter;
               System.out.println(faktorial+" X "+(counter+1)+" = "+(faktorial*(counter+1)));
           }
           System.out.println("Jadi Faktorial Dari Angka "+n+" : "+faktorial*counter );
       }
    }
    
}
