package ERS_NU;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserCheckAvailability extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserCheckAvailability.class.getName());
    
    private void reservation_data() {
   try {
       try (Connection con = DBConnection1.getConnection()) {
           String sql = "SELECT start, end, venue FROM reservation_data";
           PreparedStatement pst = con.prepareStatement(sql);
           ResultSet rs = pst.executeQuery();
           
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           model.setRowCount(0);
           
           while (rs.next()) {
               model.addRow(new Object[]{
                   rs.getString("start"),
                   rs.getString("end"),
                   rs.getString("venue")
               });
           }
           
           rs.close();
           pst.close();
       }
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading availability: " + e.getMessage());
        }
    }


    public UserCheckAvailability() {
        initComponents();
        reservation_data();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        lblcampusevent = new javax.swing.JLabel();
        lblreservesystem = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        lblsearch = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        txtend = new javax.swing.JTextField();
        lblvenue = new javax.swing.JLabel();
        txtvenue = new javax.swing.JTextField();
        searchsymbol = new javax.swing.JLabel();
        btnsearch1 = new javax.swing.JButton();
        lbldate1 = new javax.swing.JLabel();
        txtstart = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnreturn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        p1.setBackground(new java.awt.Color(31, 40, 108));
        p1.setPreferredSize(new java.awt.Dimension(1000, 750));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcampusevent.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblcampusevent.setForeground(new java.awt.Color(255, 255, 255));
        lblcampusevent.setText("CAMPUS EVENT");
        p1.add(lblcampusevent, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 190, 304, -1));

        lblreservesystem.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblreservesystem.setForeground(new java.awt.Color(255, 222, 89));
        lblreservesystem.setText("RESERVATION SYSTEM");
        p1.add(lblreservesystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 243, 290, -1));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblsearch.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lblsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/search icon 48px.png"))); // NOI18N
        lblsearch.setText("Search");

        lbldate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lbldate.setText("End");

        txtend.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendActionPerformed(evt);
            }
        });

        lblvenue.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblvenue.setText("Venue");

        txtvenue.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtvenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvenueActionPerformed(evt);
            }
        });

        btnsearch1.setBackground(new java.awt.Color(255, 222, 89));
        btnsearch1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnsearch1.setText("Search");
        btnsearch1.setPreferredSize(new java.awt.Dimension(100, 40));
        btnsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch1ActionPerformed(evt);
            }
        });

        lbldate1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lbldate1.setText("Start");

        txtstart.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstartActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(255, 222, 89));
        btnclear.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtvenue, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtend, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtstart, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p2Layout.createSequentialGroup()
                                .addComponent(btnsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchsymbol))
                            .addComponent(lblvenue, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldate1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lbldate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblvenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        p1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 300, 360));

        jTable1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "START", "END", "VENUE"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        p1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 596, 620));

        btnreturn.setBackground(new java.awt.Color(255, 222, 89));
        btnreturn.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnreturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/32 32 return png.png"))); // NOI18N
        btnreturn.setText("RETURN");
        btnreturn.setBorder(null);
        btnreturn.setBorderPainted(false);
        btnreturn.setContentAreaFilled(false);
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        p1.add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/150 51 for return button.png"))); // NOI18N
        p1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtendActionPerformed

    private void txtvenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvenueActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtvenueActionPerformed

    private void btnsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch1ActionPerformed

    String searchStart = txtstart.getText().trim();
    String searchEnd = txtend.getText().trim();
    String searchVenue = txtvenue.getText().trim();

    // DATE FORMAT VALIDATION
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy - HH:mm");
    sdf.setLenient(false);

    try {

        // validate only if textbox is not empty
        if (!searchStart.isEmpty()) {
            sdf.parse(searchStart);
        }

        if (!searchEnd.isEmpty()) {
            sdf.parse(searchEnd);
        }

    } catch (Exception e) {

        JOptionPane.showMessageDialog(
            this,
            "Invalid date and time format!\n\nUse this format:\n(dd/MMM/yyyy - HH:mm)\n\nExample:\n27/May/2026 - 14:30"
        );

        return;
    }

    try {

        Connection con = DBConnection1.getConnection();

        String sql = "SELECT start, end, venue FROM reservation_data "
                   + "WHERE start LIKE ? AND end LIKE ? AND venue LIKE ?";

        PreparedStatement pst = con.prepareStatement(sql);

        pst.setString(1, "%" + searchStart + "%");
        pst.setString(2, "%" + searchEnd + "%");
        pst.setString(3, "%" + searchVenue + "%");

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        boolean found = false;

        while (rs.next()) {

            found = true;

            model.addRow(new Object[]{
                rs.getString("start"),
                rs.getString("end"),
                rs.getString("venue")
            });
        }

        if (!found) {

            JOptionPane.showMessageDialog(
                this,
                "No events found for this date and venue!"
            );
        }
        rs.close();
        pst.close();
        con.close();

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(
            this,
            "Search Error: " + e.getMessage()
        );
    }   
    }//GEN-LAST:event_btnsearch1ActionPerformed

    private void txtstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstartActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        // TODO add your handling code here:
        ContactInfo fp = new ContactInfo();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
          txtstart.setText("");
    txtend.setText("");
    txtvenue.setText("");

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    }//GEN-LAST:event_btnclearActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserCheckAvailability().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnsearch1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcampusevent;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldate1;
    private javax.swing.JLabel lblreservesystem;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JLabel lblvenue;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JLabel searchsymbol;
    private javax.swing.JTextField txtend;
    private javax.swing.JTextField txtstart;
    private javax.swing.JTextField txtvenue;
    // End of variables declaration//GEN-END:variables
}
