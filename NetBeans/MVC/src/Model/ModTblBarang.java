/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author mabdu
 */
public class ModTblBarang extends AbstractTableModel{
    List<ModBarang> lmb;

    public ModTblBarang(List<ModBarang> lmb) {
        this.lmb = lmb;
    }
    
    @Override
    public int getRowCount() {
        return lmb.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
       switch(column){
            case 0:
                return lmb.get(row).getNo();
            case 1:
                return lmb.get(row).getNama();
            case 2:
                return lmb.get(row).getHarga();
            case 3:
                return lmb.get(row).getStok();
            default:
                return null;
       }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "No";
            case 1: 
                return "Nama";
            case 2: 
                return "Harga";
            case 3: 
                return "Stok";
            default:
                return null;
        }
        
    }
    
    
}
