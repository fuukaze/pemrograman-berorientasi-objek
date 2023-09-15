/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.util.Scanner;

/**
 *
 * @author mabdu
 */
public class hitungRumus {
    public static void main(String[] args) {
        
    double a,b,c,d,x1,x2,x3,x4,x5,y;
        Scanner i = new Scanner(System.in);
        
        System.out.print("Angka dari A = ");
        a=i.nextDouble();
        
        System.out.print("Angka dari B = ");
        b=i.nextDouble();
        
        System.out.print("Angka dari C = ");
        c=i.nextDouble();
        
    
    
        d= Math.pow(b,2)-4*a*c;
        y= Math.sqrt(d);
        if (d>0){
           x1=((-b+y)/(2*a));
           x2=((-b-y)/(2*a));
            System.out.println("Hasilnya adalah : "+x1);
            System.out.println("Hasilnya adalah : "+x2);
        }
        else if (d<0){
            x3=((-Math.sqrt(d)/2*a)+(-b/2*a));
            x4=((-Math.sqrt(d)/2*a)-(-b/2*a));
            System.out.println("Hasilnya adalah : "+x3);
            System.out.println("Hasilnya adalah : "+x4);
         }
        else {
            x5=(-b/2*a);
            System.out.println("Hasilnya adalah : "+x5);
        }
    }
}
