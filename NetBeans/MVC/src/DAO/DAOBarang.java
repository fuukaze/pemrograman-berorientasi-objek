/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.KoneksiDB;
import Model.ModBarang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mabdu
 */
public class DAOBarang implements ImplementBarang{

    Connection koneksi;
    final String insert = "INSERT INTO barang(nama, harga, stok) VALUES (?,?,?)";
    final String update = "UPDATE barang SET nama=?, harga=?, stok=? WHERE no=?";
    final String delete = "DELETE FROM barang where no=?";
    final String select = "SELECT * FROM barang";
    final String CariNama = "SELECT * FROM barang WHERE nama like ?";

    public DAOBarang() {
        koneksi = KoneksiDB.Koneksi();
    }
    
    @Override
    public void insert(ModBarang mb) {
        PreparedStatement state = null;
        
        try {
            state = koneksi.prepareStatement(insert);
            state.setString(1, mb.getNama());
            state.setInt(2, mb.getHarga());
            state.setInt(3, mb.getStok());
            state.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int no) {
        PreparedStatement state = null;
        
        try {
            state = koneksi.prepareStatement(delete);
            
            state.setInt(1, no);
            state.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    @Override
    public void update(ModBarang mb) {
        PreparedStatement state = null;
        
        try {
            state = koneksi.prepareStatement(update);
            state.setString(1, mb.getNama());
            state.setInt(2, mb.getHarga());
            state.setInt(3, mb.getStok());
            state.setInt(4, mb.getNo());
            state.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                state.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public List<ModBarang> getAll() {
        List<ModBarang> lmb = null;
        
        lmb = new ArrayList<ModBarang>();
        try {
            Statement state = koneksi.createStatement();
            ResultSet rs = state.executeQuery(select);
            while(rs.next()){
                ModBarang mb = new ModBarang();
                mb.setNo(rs.getInt("no"));
                mb.setNama(rs.getString("nama"));
                mb.setHarga(rs.getInt("harga"));
                mb.setStok(rs.getInt("stok"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }

    @Override
    public List<ModBarang> getCariNama(String nama) {
        List<ModBarang> lmb = null;
        
        try {
            lmb = new ArrayList<ModBarang>();
            
            PreparedStatement state = koneksi.prepareStatement(CariNama);
            state.setString(1, "%" + nama + "%");
            ResultSet rs = state.executeQuery();
            while(rs.next()){
                ModBarang mb =  new ModBarang();
                mb.setNo(rs.getInt("no"));
                mb.setNama(rs.getString("nama"));
                mb.setHarga(rs.getInt("harga"));
                mb.setStok(rs.getInt("stok"));
                lmb.add(mb);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lmb;
    }

}
