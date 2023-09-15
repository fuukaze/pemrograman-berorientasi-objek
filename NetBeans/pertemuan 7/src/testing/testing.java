/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author mabdu
 */
import constructor.Processor;
public class testing extends Processor{
    
    public static void main(String[] args) {
        testing Jalan = new testing();
        System.out.println("Model   = "+Jalan.getModel());
        System.out.println("Tahun   = "+Jalan.getTahun());
    }

}
