package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import POJO.Device;
import POJO.MuonDevice;
import Utils.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author QuanLDM
 */
public class HistoryDao {
     public static ArrayList<MuonDevice> layDSMuondevice(String sql) {
        
        ArrayList<MuonDevice> DSmuondevice = new ArrayList<>();
        try {
            ResultSet rs = null;
            Connection con = Connect.getConnection();
            Statement sm = con.createStatement();
            rs = sm.executeQuery(sql);

            while (rs.next()) {
                MuonDevice muondvc = new MuonDevice();
                muondvc.setMamuon32(rs.getString(1));
                muondvc.setMathietbi32(rs.getString(2));
                muondvc.setManguoimuon32(rs.getString(3));         
                muondvc.setTennguoimuon32(rs.getString(4));
                muondvc.setNgaymuon32(rs.getString(5));
                muondvc.setNgaytra32(rs.getString(6));
                DSmuondevice.add(muondvc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DSmuondevice;
    }
}
