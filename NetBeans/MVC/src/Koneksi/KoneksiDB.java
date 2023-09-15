/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mabdu
 */
public class KoneksiDB {
    static Connection conn;
    
    public static Connection Koneksi(){
        if(conn == null){
            MysqlDataSource data = new  MysqlDataSource();
            data.setUrl("jdbc:mysql://localhost:3306/db_pbo");
            data.setUser("root");
            data.setPassword("");
            
            try {
                conn = data.getConnection();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conn;
    }
}
