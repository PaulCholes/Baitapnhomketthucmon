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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HongAnh
 */
public class Quan_Ly_Khach_Hang {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Bước 1: Tạo kết nối đến CSDL
        String chuoiKN="jdbc:mysql://localhost/qlsv";
        Connection KN;
        try {
            KN = DriverManager.getConnection(chuoiKN, "root","");
            System.out.println("OK, Hha hahahaa ");
            // Bước 3
            String strSQL ="insert into HOSO values (?,?,?)";
            // Bước 2
            PreparedStatement lenhChuanBi = KN.prepareStatement(strSQL);
              // Truyen tham so
                 // --- lay tu ban phim
              Scanner banphim = new Scanner(System.in);
              System.out.println("Ma so HS: ");
              String ms = banphim.nextLine();
              
              System.out.println("Ho ten HS: ");
              String ht = banphim.nextLine();
              
              System.out.println("Lop: ");
              String lop = banphim.nextLine();
                 // dua vao
                 lenhChuanBi.setString(1,ms);
                 lenhChuanBi.setString(2,ht);
                 lenhChuanBi.setString(3,lop);
               // thuc hien lenh
                 lenhChuanBi.executeUpdate();
            
            
            // Bước 4
            Statement lenh = KN.createStatement();
            ResultSet rs = lenh.executeQuery(strSQL);
            // Bước 5
            // in ra màn hình console
            while( rs.next())  // duyệt cho đến bản ghi cuối cùng
            {
                String ms1 = rs.getString("MSSV");
                String ten = rs.getString("HOTEN");
                String malop = rs.getString("MALOP");
                System.out.println(ms1 + "\t" + ten + "\t" + malop);
            }
            // Bước 6
            KN.close();
        } catch (SQLException ex) 
        {
            System.out.println("Khong ket noi duoc");
            System.err.println(ex.toString());  // in loi
        }
        
        
    }
}
