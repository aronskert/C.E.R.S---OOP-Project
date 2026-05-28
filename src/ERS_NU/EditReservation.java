package ERS_NU;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.swing.JOptionPane;

public class EditReservation extends javax.swing.JFrame {

   
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EditReservation.class.getName());

    
    Database mainDatabasePage;
    String targetEventCode;

    public EditReservation(Database mainPage, String evCode, String name, String id, String num, String email, String venue, String start, String end, String type, String empId) {
        initComponents();
        
        this.mainDatabasePage = mainPage;
        this.targetEventCode = evCode;

        txtName.setText(name);
        txtStudentID.setText(id);
        txtPhone.setText(num);
        txtEmail.setText(email);
        txtVenue.setText(venue);
        txtStart.setText(start);
        txtEnd.setText(end);
        txtType.setText(type);
        txtEmpId.setText(empId);
        txtCode.setText(evCode);
    }

    public EditReservation() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        lblstudentidno = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblphoneno = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblemail1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblname1 = new javax.swing.JLabel();
        txtVenue = new javax.swing.JTextField();
        lblname2 = new javax.swing.JLabel();
        txtStart = new javax.swing.JTextField();
        lblname3 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        lblname4 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        lblname5 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(31, 40, 108));
        p1.setToolTipText("");
        p1.setPreferredSize(new java.awt.Dimension(1000, 750));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Serif", 0, 64)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Edit ");
        p1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 67));

        p2.setOpaque(false);
        p2.setPreferredSize(new java.awt.Dimension(400, 450));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblname.setText("Employee ID");
        p2.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

        txtEmpId.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });
        p2.add(txtEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 350, 50));

        lblstudentidno.setBackground(new java.awt.Color(255, 255, 255));
        lblstudentidno.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblstudentidno.setText("Student Full Name");
        p2.add(lblstudentidno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        txtName.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        p2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 350, 50));

        lblphoneno.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblphoneno.setText("Student ID");
        p2.add(lblphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, -1));

        txtStudentID.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        p2.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 350, 55));

        lblemail.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblemail.setText("Student Number");
        p2.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));

        txtPhone.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        p2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 350, 55));

        lblemail1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblemail1.setText("Student Email");
        p2.add(lblemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, -1));

        txtEmail.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        p2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 350, 55));

        lblname1.setBackground(new java.awt.Color(255, 255, 255));
        lblname1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblname1.setText("Venue");
        p2.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 180, -1));

        txtVenue.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueActionPerformed(evt);
            }
        });
        p2.add(txtVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 360, 50));

        lblname2.setBackground(new java.awt.Color(255, 255, 255));
        lblname2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblname2.setText("Start");
        p2.add(lblname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 180, -1));

        txtStart.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartActionPerformed(evt);
            }
        });
        p2.add(txtStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 360, 50));

        lblname3.setBackground(new java.awt.Color(255, 255, 255));
        lblname3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblname3.setText("End");
        p2.add(lblname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 180, -1));

        txtEnd.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });
        p2.add(txtEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 360, 50));

        lblname4.setBackground(new java.awt.Color(255, 255, 255));
        lblname4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblname4.setText("Event Type");
        p2.add(lblname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 180, -1));

        txtType.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });
        p2.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 360, 50));

        lblname5.setBackground(new java.awt.Color(255, 255, 255));
        lblname5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lblname5.setText("Event Code");
        p2.add(lblname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 150, -1));

        txtCode.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        p2.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 360, 50));

        p1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 900, 500));

        lbl2.setFont(new java.awt.Font("Serif", 0, 64)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("Reservation");
        p1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, 58));

        btnlogout.setBackground(new java.awt.Color(255, 222, 89));
        btnlogout.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/32 32 return png.png"))); // NOI18N
        btnlogout.setText("Return");
        btnlogout.setBorder(null);
        btnlogout.setContentAreaFilled(false);
        btnlogout.setPreferredSize(new java.awt.Dimension(170, 55));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        p1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/900 500 for edit reservation.png"))); // NOI18N
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 1070, 570));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/150 51 for return button.png"))); // NOI18N
        p1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnnext.setBackground(new java.awt.Color(255, 222, 89));
        btnnext.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/confirm 48px.png"))); // NOI18N
        btnnext.setText("Confirm");
        btnnext.setBorder(null);
        btnnext.setContentAreaFilled(false);
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        p1.add(btnnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 230, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/2nd biggest 231 70 btn.png"))); // NOI18N
        p1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 250, 90));

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
        txtStudentID.getText();
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
    
        Database Db = new Database();
        Db.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
        // TODO add your handling code here:
        txtEmpId.getText();
    }//GEN-LAST:event_txtEmpIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        txtName.getText();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
        txtPhone.getText();
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        try {
        java.sql.Connection con = DBConnection1.getConnection();
        
       
        String sql = "UPDATE reservation_data SET student_name=?, student_id=?, Student_number=?, Student_Email=?, venue=?, Start=?, End=?, event_type=?, Employee_ID=? WHERE Event_id=?";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        
        pst.setString(1, txtName.getText().trim());
        pst.setString(2, txtStudentID.getText().trim());
        pst.setString(3, txtPhone.getText().trim());
        pst.setString(4, txtEmail.getText().trim());
        pst.setString(5, txtVenue.getText().trim());
        pst.setString(6, txtStart.getText().trim());
        pst.setString(7, txtEnd.getText().trim());
        pst.setString(8, txtType.getText().trim());
        pst.setString(9, txtEmpId.getText().trim());
        
        pst.setString(10, this.targetEventCode);
        
        int updated = pst.executeUpdate();
        
        if (updated > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Reservation Updated Successfully!");
            
            if (this.mainDatabasePage != null) {
                this.mainDatabasePage.reservation_data();
            }

            this.dispose(); 
        }
        
        pst.close();
        con.close();
        
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Update Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnnextActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueActionPerformed

    private void txtStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartActionPerformed

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EditReservation().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemail1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblname3;
    private javax.swing.JLabel lblname4;
    private javax.swing.JLabel lblname5;
    private javax.swing.JLabel lblphoneno;
    private javax.swing.JLabel lblstudentidno;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStart;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables

    }

