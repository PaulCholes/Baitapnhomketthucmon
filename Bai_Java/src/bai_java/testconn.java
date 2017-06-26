/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class testconn {
    Connection conn;
    public Connection getConnectToMSSQL()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RL66J1L/SQLEXPRESS:1433;databaseName=QLSKTHAYTHO","", "");
        } catch (SQLException ex) {
            Logger.getLogger(testconn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
