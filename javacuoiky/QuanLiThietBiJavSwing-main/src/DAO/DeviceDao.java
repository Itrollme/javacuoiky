/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.Device;
import Utils.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author QuanLDM
 */
public class DeviceDao {

    public static ArrayList<Device> layDSdevice(String sql) {
        
        ArrayList<Device> DSdevice = new ArrayList<>();
        try {
            ResultSet rs = null;
            Connection con = Connect.getConnection();
            Statement sm = con.createStatement();
            rs = sm.executeQuery(sql);

            while (rs.next()) {
                Device device = new Device();
                device.setMa32(rs.getString(1));
                device.setTen32(rs.getString(2));         
                device.setLoai32(rs.getString(3));
                device.setTinhtrang32(rs.getString(4));
                device.setTrangthai32(rs.getString(5));
                DSdevice.add(device);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DSdevice;
    }
}
