package ERS_NU;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//testesttesttest

public class UserCheckAvailability extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserCheckAvailability.class.getName());

    public UserCheckAvailability() {
        initComponents();
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
        txtdate = new javax.swing.JTextField();
        lblvenue = new javax.swing.JLabel();
        txtvenue = new javax.swing.JTextField();
        searchsymbol = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        p1.setBackground(new java.awt.Color(31, 40, 108));
        p1.setPreferredSize(new java.awt.Dimension(1000, 750));

        lblcampusevent.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblcampusevent.setForeground(new java.awt.Color(255, 255, 255));
        lblcampusevent.setText("CAMPUS EVENT");

        lblreservesystem.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lblreservesystem.setForeground(new java.awt.Color(255, 222, 89));
        lblreservesystem.setText("RESERVATION SYSTEM");

        nulogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nulogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/#1f286c.png"))); // NOI18N
        nulogo.setPreferredSize(new java.awt.Dimension(100, 100));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblsearch.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblsearch.setText("Search");

        lbldate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lbldate.setText("Date");

        txtdate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
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

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdate)
                    .addComponent(txtvenue)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblvenue)
                            .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblsearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchsymbol)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblsearch)
                    .addComponent(searchsymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblvenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        btnsearch.setBackground(new java.awt.Color(255, 222, 89));
        btnsearch.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.setPreferredSize(new java.awt.Dimension(100, 40));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "START", "END", "VENUE"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/#1f286c.png"))); // NOI18N

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblreservesystem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblcampusevent))
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcampusevent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblreservesystem)
                        .addGap(18, 18, 18)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
        btnsearchActionPerformed(evt);
    }//GEN-LAST:event_txtdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String date = txtdate.getText().trim();
    String venue = txtvenue.getText().trim();

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

    // clear old rows
    model.setRowCount(0);

    // sample schedules
    if(date.equalsIgnoreCase("June 1, 2026") 
            && venue.equalsIgnoreCase("Chapel")) {

        model.addRow(new Object[]{
            "8:00 AM - 10:00 AM",
            "June 1, 2026",
            "Chapel"
        });

        model.addRow(new Object[]{
            "1:00 PM - 3:00 PM",
            "June 1, 2026",
            "Room 501"
        });
        
        model.addRow(new Object[]{
            "4:00 PM - 5:00 PM",
            "June 1, 2026",
            "Room 502"
        });

    } 
    else if(date.equalsIgnoreCase("June 2, 2026") 
            && venue.equalsIgnoreCase("Gym")) {

        model.addRow(new Object[]{
            "10:00 AM - 12:00 PM",
            "June 2, 2026",
            "Gym"
        });
        
        model.addRow(new Object[]{
            "1:00 PM - 2:00 PM",
            "June 2, 2026",
            "Room 401"
        });
        
        model.addRow(new Object[]{
            "3:00 PM - 5:00 PM",
            "June 2, 2026",
            "Room 402"
        });


    }
    else if(date.equalsIgnoreCase("June 3, 2026")
            && venue.equalsIgnoreCase("Hallway")) {
        
        model.addRow(new Object[]{
            "10:00 AM - 11:00 AM",
            "June 3, 2026",
            "Hallway"
        });
    }
    else {

    JOptionPane.showMessageDialog(
            this,
            "No schedule available."
    );
}
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtvenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvenueActionPerformed
        // TODO add your handling code here:
        btnsearchActionPerformed(evt);
    }//GEN-LAST:event_txtvenueActionPerformed

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
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcampusevent;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblreservesystem;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JLabel lblvenue;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JLabel searchsymbol;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtvenue;
    // End of variables declaration//GEN-END:variables
}
