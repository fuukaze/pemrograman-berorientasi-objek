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
public class tampilAngka {
    public static void main(String[] args) {
        Scanner UI = new Scanner(System.in);
        System.out.print("Banyak Bilangan : ");
        int angka = UI.nextInt();
        for (int x = 1; x <= angka; x++){
            if(x % 5 == 0){
                System.out.print(x + "\n");
            }
            else {
                System.out.print(x + " ");
            }
        }
        System.out.print("Dipecah Menjadi : ");
        int pecah = UI.nextInt();
        for (int x = 1; x <= angka; x++){
            if(x % pecah == 0){
                System.out.print(x + "\n");
            }
            else{
                System.out.print(x + " ");
            }
        }
    }
}
