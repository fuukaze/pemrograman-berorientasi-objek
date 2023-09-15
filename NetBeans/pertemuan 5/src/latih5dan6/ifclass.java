/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latih5dan6;

/**
 *
 * @author mabdu
 */
class Nilai {
    private int nilai;
    private String predikat, nHuruf;

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getPredikat() {
        return predikat;
    }

    public void setPredikat(String predikat) {
        this.predikat = predikat;
    }

    public String getnHuruf() {
        return nHuruf;
    }

    public void setnHuruf(String nHuruf) {
        this.nHuruf = nHuruf;
    }

    
    char getNilHuruf(float nilai){ 
        if(nilai>=85) 
            nHuruf='A'; 
        else if(nilai>=70 && nilai<85) 
            nHuruf='B'; 
        else if(nilai>=60 && nilai<70) 
            nHuruf='C'; 
        else if(nilai>=40 && nilai<60) 
            nHuruf='D'; 
        else 
            nHuruf='E'; 
    return nHuruf; 
    } 
 String getPredikat(char huruf){
 switch(huruf) 
 { 
 case 'A':predikat="Apik"; 
 break; 
 case 'B':predikat="Baik"; 
 break; 
 case 'C':predikat="Cukup"; 
 break; 
 case 'D':predikat="Dablek"; 
 break; 
 default:predikat="Elek"; 
 } 
 return predikat; 
 } 
}
 
public class ifclass {

    public static void main(String[] args) {

    }
}
