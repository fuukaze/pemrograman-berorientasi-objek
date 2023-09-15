/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ModBarang;
import java.util.List;

/**
 *
 * @author mabdu
 */
public interface ImplementBarang {
    public void insert(ModBarang mb);
    public void delete(int no);
    public void update(ModBarang mb);
    public List<ModBarang> getAll();
    public List<ModBarang> getCariNama(String nama);
}
