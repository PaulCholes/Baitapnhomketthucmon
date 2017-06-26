/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class Them_Moi_Khach_Hang_D {
     public static void ThemKhachHang(String txt1,
                                 String txt2,
                                 String txt3,
                                 String txt4,
                                 String txt5,
                                 String txt6,
                                 String txt7) throws SQLException
    {
        Connection KN;
            KN = Ket_Noi_CSDL.MoKetNoi_MySQL("localhost",3306, "quanlikhachsan", "root", "1234");
            String sql = "INSERT INTO khachhang VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stt = KN.prepareStatement(sql);

            stt.setString(1, txt1);
            stt.setString(2,txt2);
            stt.setString(3,txt3);
            stt.setString(4,txt4);
            stt.setString(5,txt5);
            stt.setString(6,txt6);
            stt.setString(7,txt7);
            stt.executeUpdate();
           // Bước 6
           KN.close();
        
    }
}
