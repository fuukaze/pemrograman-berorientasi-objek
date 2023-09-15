/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_Bean;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SUPER ANDROID
 */
public class Bean {
    private String uname,pass;
   // private boolean results = false;
    
    public String getUname(){
    return uname;
    }
    public void setUname(String uname){
        this.uname=uname;
    }
    
    public String getPass(){
    return pass;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    public boolean Login(){
        
         try{
    Class.forName("com.mysql.jdbc.Driver");
             java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root", "");
        java.sql.Statement stmt = con.createStatement();
    String sql = "SELECT *FROM `register` WHERE `Username`='"+uname+"' AND `Password`='"+pass+"'";
        ResultSet rst = stmt.executeQuery(sql);
    while(rst.next()){
    return true;
    } 
      
    
    }
         
  
   catch(Exception e){
    
    
    }
    return false;
    }
    
    
    public boolean Register(){
        
         try{
    Class.forName("com.mysql.jdbc.Driver");
             java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root", "");
        ///java.sql.Statement stmt = con.createStatement();
    String sql = "INSERT INTO `register` (`Username`,`Password`) VALUES ('"+uname+"','"+pass+"')";
    PreparedStatement pst = con.prepareStatement(sql);
    int res = pst.executeUpdate();
//        ResultSet rst = stmt.executeQuery(sql);
    if(res==1){
    return true;
    } 
    else{
    return false;
    }
      
    
    }
         
  
   catch(Exception e){
    
    
    }
    return false;
    }
    
    
    
    
    
    
    
    
    
    
    
}
