/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author QuanLDM
 */
public class Connect {
    private Connection con;
    public static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/da_quanlythietbi", "root", "123456");
        return con;
    }
    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement sm = con.createStatement();
            rs = sm.executeQuery(sql);
        } catch (Exception e) {
        }
        return rs;
    }
    public int executeUpdate(String sql) {
        int rs = -1;
        try {
            Statement sm = con.createStatement();
            rs = sm.executeUpdate(sql);
        } catch (Exception e) {
        }
        return rs;
    }
    public void Close() throws Exception {
        con.close();
    }

}
