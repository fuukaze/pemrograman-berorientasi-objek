/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author mabdu
 */
public class Processor {
    String Model;
    int Tahun;
    
    public Processor(){
        this.Model = "core i5 gen 10";
        this.Tahun = 2018;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }
}