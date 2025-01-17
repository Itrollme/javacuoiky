/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.DeviceDao;
import POJO.Device;
import Utils.Connect;
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.RowFilter;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.html.parser.DTDConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author QuanLDM
 */
public class List_Device extends javax.swing.JFrame {

    private String dataconstructor = "";
    private String dataconstructor1 = "";
    private String dataconstructor2 = "";
   

    /**
     * Creates new form QuanLi_Device
     */
    public List_Device(String data) {
        initComponents();
        setTitle("Quản lí thiết bị trường học");
        this.dataconstructor = data;
        btn_muon32.setEnabled(false);
        btn_edit_32.setEnabled(false);
        btn_delete_32.setEnabled(false);
        btn_hong_32.setEnabled(false);
        jtf_ma32.setEditable(false);
        history_32.setEnabled(false);
        ArrayList<Device> dv = DeviceDao.layDSdevice("select * from thietbi ");
        DefaultTableModel model = (DefaultTableModel) jtb_ds.getModel();
        Object[] obj = new Object[5];
        for (int i = 0; i < dv.size(); i++) {
            obj[0] = dv.get(i).getMa32();
            obj[1] = dv.get(i).getTen32();
            obj[2] = dv.get(i).getLoai32();
            obj[3] = dv.get(i).getTinhtrang32();
            if (dv.get(i).getTrangthai32().equals("0")) {
                obj[4] = "Chưa mượn";
            } else {
                obj[4] = "Đang mượn";
            }
//            obj[4] = dv.get(i).getTrangthai32();
            model.addRow(obj);
            
        }
       JTable jtb_ds = new JTable(model);
        int rows = jtb_ds.getRowCount();
        soluong_32.setText(" Total device: " +String.valueOf(rows)+" devices ");
    }

    public void openFile(String file) {
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_ma32 = new javax.swing.JTextField();
        jtf_ten32 = new javax.swing.JTextField();
        jtf_tinhtrang32 = new javax.swing.JTextField();
        jtf_trangthai32 = new javax.swing.JTextField();
        btn_them_32 = new javax.swing.JButton();
        btn_edit_32 = new javax.swing.JButton();
        btn_delete_32 = new javax.swing.JButton();
        btn_hong_32 = new javax.swing.JButton();
        btn_muon32 = new javax.swing.JButton();
        jtf_loai32 = new javax.swing.JTextField();
        history_32 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_ds = new javax.swing.JTable();
        soluong_32 = new javax.swing.JLabel();
        jtf_search20 = new swing.TextFieldAnimation();
        jlb_20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText(" List of devices");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 51, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mã");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Tên");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Loại");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Tình trạng");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Trạng thái");

        jtf_ma32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_ma32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_ma32ActionPerformed(evt);
            }
        });

        jtf_ten32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jtf_tinhtrang32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_tinhtrang32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tinhtrang32ActionPerformed(evt);
            }
        });

        jtf_trangthai32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btn_them_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_them_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_them_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus.png"))); // NOI18N
        btn_them_32.setText("Add");
        btn_them_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them_32ActionPerformed(evt);
            }
        });

        btn_edit_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_edit_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_edit_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        btn_edit_32.setText("Update");
        btn_edit_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_32ActionPerformed(evt);
            }
        });

        btn_delete_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_delete_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_delete_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btn_delete_32.setText("Delete");
        btn_delete_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_32ActionPerformed(evt);
            }
        });

        btn_hong_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_hong_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_hong_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/report.png"))); // NOI18N
        btn_hong_32.setText("Broken report");
        btn_hong_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hong_32ActionPerformed(evt);
            }
        });

        btn_muon32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_muon32.setForeground(new java.awt.Color(0, 51, 51));
        btn_muon32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/inspiration.png"))); // NOI18N
        btn_muon32.setText("Borrow");
        btn_muon32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_muon32ActionPerformed(evt);
            }
        });

        jtf_loai32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        history_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        history_32.setForeground(new java.awt.Color(0, 51, 51));
        history_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/parchment.png"))); // NOI18N
        history_32.setText("History");
        history_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_32ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/export.png"))); // NOI18N
        jButton2.setText("Export Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jtf_trangthai32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(jtf_tinhtrang32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_ma32)
                            .addComponent(jtf_ten32)
                            .addComponent(jtf_loai32, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_them_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete_32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hong_32))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_muon32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history_32, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_ma32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them_32)
                    .addComponent(btn_muon32))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_ten32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(history_32)
                    .addComponent(btn_edit_32))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_loai32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(btn_delete_32))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_tinhtrang32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hong_32))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_trangthai32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jtb_ds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102)));
        jtb_ds.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtb_ds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ THIẾT BỊ", "TÊN THIẾT BỊ", "LOẠI", "TÌNH TRẠNG", "TRẠNG THÁI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_ds.setGridColor(new java.awt.Color(0, 153, 0));
        jtb_ds.setRowHeight(30);
        jtb_ds.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jtb_ds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_dsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_ds);
        if (jtb_ds.getColumnModel().getColumnCount() > 0) {
            jtb_ds.getColumnModel().getColumn(3).setMinWidth(10);
        }

        soluong_32.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        soluong_32.setForeground(new java.awt.Color(255, 255, 51));
        soluong_32.setText("jLabel8");
        soluong_32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 102), null, null));

        jtf_search20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_search20KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(soluong_32, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlb_20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_search20, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(soluong_32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlb_20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtf_search20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_dsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_dsMouseClicked
        history_32.setEnabled(true);
        DefaultTableModel tmodel = (DefaultTableModel) jtb_ds.getModel();
        int selectrowindex = jtb_ds.getSelectedRow();
        jtf_ma32.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        jtf_ten32.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        jtf_loai32.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        jtf_tinhtrang32.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        jtf_trangthai32.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        dataconstructor1 = jtf_ma32.getText();
        boolean a = jtb_ds.isEditing();
        if (jtf_ma32.getText() != null) {
            btn_edit_32.setEnabled(true);
            btn_delete_32.setEnabled(true);
        }
        if (jtf_tinhtrang32.getText().equals("Normal")) {
            btn_hong_32.setEnabled(true);
            btn_muon32.setEnabled(true);
        } else {
            btn_hong_32.setEnabled(false);

        }

        if (jtf_trangthai32.getText().equals("Chưa mượn") && jtf_tinhtrang32.getText().equals("Normal")) {
            btn_muon32.setEnabled(true);
        } else {
            btn_muon32.setEnabled(false);
        }
        if (a == false) {
            JOptionPane.showMessageDialog(null, "Bạn không thể chỉnh sửa ở đây ");
        }
        dataconstructor2 = jtf_ma32.getText();
    }//GEN-LAST:event_jtb_dsMouseClicked

    private void btn_them_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them_32ActionPerformed
        Add_Device li = new Add_Device(dataconstructor);
        li.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_them_32ActionPerformed

    private void btn_delete_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_32ActionPerformed
        // TODO add your handling code here:
        String sql = "delete from thietbi where ma =?";
        try {
            Connection con = Connect.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, jtf_ma32.getText());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (Exception e) {
        }
        List_Device s = new List_Device(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_delete_32ActionPerformed

    private void jtf_ma32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_ma32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_ma32ActionPerformed

    private void jtf_tinhtrang32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tinhtrang32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tinhtrang32ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Menu s = new Menu(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
    private void btn_edit_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_32ActionPerformed
        try {
            Connection con = Connect.getConnection();
            String value1 = jtf_ma32.getText();
            String value2 = jtf_ten32.getText();
            String value3 = jtf_loai32.getText();
            String sql = "UPDATE thietbi set ten='" + value2 + "' ,loai='" + value3 + "' where ma='" + value1 + "' ";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công ");
            con.close();
            List_Device s = new List_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_edit_32ActionPerformed

    private void btn_hong_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hong_32ActionPerformed
        // TODO add your handling code here:

        try {
            Connection con = Connect.getConnection();
            String value1 = "Error";
            String value2 = jtf_ma32.getText();
            String sql = "UPDATE thietbi set tinhtrang='" + value1 + "' where ma='" + value2 + "'";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Báo hỏng thành công");
            con.close();
            List_Device s = new List_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_hong_32ActionPerformed

    private void btn_muon32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_muon32ActionPerformed
        Add_Borrow dv = new Add_Borrow(dataconstructor, dataconstructor1);
        dv.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_muon32ActionPerformed

    private void history_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_32ActionPerformed
        HistoryByMa s = new HistoryByMa(dataconstructor, dataconstructor2);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_history_32ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null) {
                saveFile = new File(saveFile.toString() + ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("device");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < jtb_ds.getColumnCount(); i++) {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(jtb_ds.getColumnName(i));
                }

                for (int j = 0; j < jtb_ds.getRowCount(); j++) {
                    Row row = sheet.createRow(j + 1);
                    for (int k = 0; k < jtb_ds.getColumnCount(); k++) {
                        Cell cell = row.createCell(k);
                        if (jtb_ds.getValueAt(j, k) != null) {
                            cell.setCellValue(jtb_ds.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
            } else {
                JOptionPane.showMessageDialog(null, "Error Export File");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException io) {
            System.out.println(io);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtf_search20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_search20KeyReleased
        // TODO add your handling code here:
       // TODO add your handling code here:        
                getContentPane().setBackground(new Color(240, 240, 240));
        jtf_search20.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    for (int i = 1; i <= 100; i++) {
                        jlb_20.setText("Loading: " + i);
                        Thread.sleep(10);
                        if(i == 100)
                        { 
        DefaultTableModel model = (DefaultTableModel) jtb_ds.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_ds.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtf_search20.getText().trim()));
        }
                    }
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {

            }
        });
    }//GEN-LAST:event_jtf_search20KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(List_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete_32;
    private javax.swing.JButton btn_edit_32;
    private javax.swing.JButton btn_hong_32;
    private javax.swing.JButton btn_muon32;
    private javax.swing.JButton btn_them_32;
    private javax.swing.JButton history_32;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb_20;
    private javax.swing.JTable jtb_ds;
    private javax.swing.JTextField jtf_loai32;
    private javax.swing.JTextField jtf_ma32;
    private swing.TextFieldAnimation jtf_search20;
    private javax.swing.JTextField jtf_ten32;
    private javax.swing.JTextField jtf_tinhtrang32;
    private javax.swing.JTextField jtf_trangthai32;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel soluong_32;
    // End of variables declaration//GEN-END:variables
}
