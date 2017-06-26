/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_java;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HongAnh
 */
public class Them_Moi_Khach_Hang {
    public static void main(String[] args) {
     
        testconn s = new testconn();
        Connection conn= s.getConnectToMSSQL();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT MAKH from KHACHHANG");   
            while(rs.next())
                System.out.println(rs.getString("MAKH"));
        } catch (SQLException ex) {
            Logger.getLogger(Them_Moi_Khach_Hang.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
}
