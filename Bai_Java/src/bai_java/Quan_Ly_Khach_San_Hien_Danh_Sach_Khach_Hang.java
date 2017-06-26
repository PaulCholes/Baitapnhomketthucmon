/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HongAnh
 */
public class Quan_Ly_Khach_San_Hien_Danh_Sach_Khach_Hang {
    public static void main(String[] args) throws SQLException {
        try ( // 1. Kết nối đến CSDL: QLHS, tenDN: root, mK: rong
                Connection KN = Ket_Noi_CSDL.MoKetNoi_MySQL("localhost",3306, "quanlikhachsan", "root", "1234")) {
            Statement stt = KN.createStatement();
            String sql= "select * from nhanvien";
            // stt.executeQuery(sql);
            ResultSet rs = stt.executeQuery(sql);
            // in ra màn hình console
            while (rs.next()) {
                String ms1 = rs.getString("MSSV");
                String ten = rs.getString("HOTEN");
                String malop = rs.getString("MALOP");
                System.out.println(ms1 + "\t" + ten + "\t" + malop);
            }
            // Bước 6
        }
    }
}
