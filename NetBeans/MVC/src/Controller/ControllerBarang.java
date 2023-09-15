/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBarang;
import DAO.ImplementBarang;
import Model.ModBarang;
import Model.ModTblBarang;
import View.FormBarang;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mabdu
 */
public class ControllerBarang {
    FormBarang frame;
    ImplementBarang implBarang;
    List<ModBarang> lmb;

    public ControllerBarang(FormBarang frame) {
        this.frame = frame;
        implBarang = new DAOBarang();
        lmb = implBarang.getAll();
    }
    
    public void reset(){
        frame.getTxt_no().setText("");
        frame.getTxt_nama().setText("");
        frame.getTxt_harga().setText("");
        frame.getTxt_stok().setText("");
    }
    
    public void isiTabel(){
        lmb = implBarang.getAll();
        ModTblBarang mtb = new ModTblBarang(lmb);
        frame.getTbl_barang().setModel(mtb);
    }
    
    public void isiField(int row){
        frame.getTxt_no().setText(String.valueOf(lmb.get(row).getNo()));
        frame.getTxt_nama().setText(lmb.get(row).getNama());
        frame.getTxt_harga().setText(String.valueOf(lmb.get(row).getHarga()));
        frame.getTxt_stok().setText(String.valueOf(lmb.get(row).getStok()));
    }
    
    public void insert(){
        if(!frame.getTxt_nama().getText().trim().isEmpty() & !frame.getTxt_nama().getText().trim().isEmpty()){
            ModBarang mb = new ModBarang();
            
            mb.setNama(frame.getTxt_nama().getText());
            mb.setHarga(Integer.valueOf(frame.getTxt_harga().getText()));
            mb.setStok(Integer.valueOf(frame.getTxt_stok().getText()));
            
            implBarang.insert(mb);
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal Tersimpan");
        }
    }
    
    public void delete(){
        if(!frame.getTxt_no().getText().trim().isEmpty()){
            int no = Integer.parseInt(frame.getTxt_no().getText());
            
            implBarang.delete(no);
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        } else {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }
    
    public void update(){
        if(!frame.getTxt_no().getText().trim().isEmpty()){
            ModBarang mb = new ModBarang();
            
            mb.setNama(frame.getTxt_nama().getText());
            mb.setHarga(Integer.valueOf(frame.getTxt_harga().getText()));
            mb.setStok(Integer.valueOf(frame.getTxt_stok().getText()));
            mb.setNo(Integer.valueOf(frame.getTxt_no().getText()));
            
            implBarang.update(mb);
            JOptionPane.showMessageDialog(null, "Data Telah diUpdate");
        }else{
            JOptionPane.showMessageDialog(null, "Data Gagal diUpdate");
        }
    }
    
    public void isiTblCariNama(){
        lmb = implBarang.getCariNama(frame.getTxt_cari().getText());
        ModTblBarang mtb = new ModTblBarang(lmb);
        frame.getTbl_barang().setModel(mtb);
    }
    
    public void CariNama(){
        if(!frame.getTxt_cari().getText().trim().isEmpty()){
            implBarang.getCariNama(frame.getTxt_cari().getText());
            isiTblCariNama();
        }else{
            JOptionPane.showMessageDialog(null, "Nama Kosong, Tolong DiIsi");
        }
    }
}
