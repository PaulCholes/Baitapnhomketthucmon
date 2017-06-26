/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_java;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HongAnh
 */
public class Ket_Noi_CSDL {
        public static Connection MoKetNoi_MySQL(String tenmay,
                                 int CongDichVu,
                                 String tenCSDL,
                                 String tenDN,
                                 String matkhau) throws SQLException
    {
        String chuoiKN = "jdbc:mysql://"+tenmay+":"+CongDichVu+"/"+tenCSDL;
        return DriverManager.getConnection(chuoiKN,tenDN,matkhau);
    }
        
    
    
}
