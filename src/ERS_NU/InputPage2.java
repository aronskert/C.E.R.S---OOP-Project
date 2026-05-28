

package ERS_NU;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class InputPage2 extends javax.swing.JFrame {
    
    // variables galing sa ContactInfo
    private String name;
    private String studentid;
    private String phone;
    private String email;
    private String employeeid;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InputPage2.class.getName());


    public InputPage2() {
        initComponents();
        
    }
        
        public InputPage2(String name, String studentid, String phone, String email) {

            initComponents();
        
            // save sa variables
            this.name = name;
            this.studentid = studentid;
            this.phone = phone;
            this.email = email;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        VenuePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jcbVenue = new javax.swing.JComboBox<>();
        jcbSmonth = new javax.swing.JComboBox<>();
        jcbSday = new javax.swing.JComboBox<>();
        jcbSyear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbShour = new javax.swing.JComboBox<>();
        jcbSmins = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbSampm = new javax.swing.JComboBox<>();
        txtEventType = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcbEampm = new javax.swing.JComboBox<>();
        jcbEmins = new javax.swing.JComboBox<>();
        jcbEhour = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbEyear = new javax.swing.JComboBox<>();
        jcbEday = new javax.swing.JComboBox<>();
        jcbEmonth = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(31, 40, 108));
        jPanel2.setForeground(new java.awt.Color(31, 40, 108));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reservation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 324, 84));

        btnReturn.setBackground(new java.awt.Color(255, 222, 89));
        btnReturn.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/32 32 return png.png"))); // NOI18N
        btnReturn.setText("Return");
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(this::btnReturnActionPerformed);
        jPanel2.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 150, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/buldgo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 347, 259));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Form");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 159, 84));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VenuePanel.setBackground(new java.awt.Color(255, 255, 255));
        VenuePanel.setOpaque(false);
        VenuePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(31, 40, 108));
        jLabel4.setText("Venue Option ");
        VenuePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 270, 40));

        jcbVenue.setBackground(new java.awt.Color(255, 222, 89));
        jcbVenue.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jcbVenue.setForeground(new java.awt.Color(31, 40, 108));
        jcbVenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Function Hall", "Gym", "3rd Floor", "AVR Room" }));
        jcbVenue.setSelectedIndex(-1);
        jcbVenue.addActionListener(this::jcbVenueActionPerformed);
        VenuePanel.add(jcbVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 40));

        jcbSmonth.setForeground(new java.awt.Color(31, 40, 108));
        jcbSmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "" }));
        jcbSmonth.setSelectedIndex(-1);
        jcbSmonth.addActionListener(this::jcbSmonthActionPerformed);
        VenuePanel.add(jcbSmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jcbSday.setForeground(new java.awt.Color(31, 40, 108));
        jcbSday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jcbSday.setSelectedIndex(-1);
        VenuePanel.add(jcbSday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jcbSyear.setForeground(new java.awt.Color(31, 40, 108));
        jcbSyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2026", "2027", " " }));
        jcbSyear.setSelectedIndex(-1);
        VenuePanel.add(jcbSyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(31, 40, 108));
        jLabel5.setText("Time");
        VenuePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 55, 24));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(31, 40, 108));
        jLabel6.setText("Start of the Event");
        VenuePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, -1));

        jcbShour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jcbShour.setForeground(new java.awt.Color(31, 40, 108));
        jcbShour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jcbShour.setSelectedIndex(-1);
        jcbShour.addActionListener(this::jcbShourActionPerformed);
        VenuePanel.add(jcbShour, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jcbSmins.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jcbSmins.setForeground(new java.awt.Color(31, 40, 108));
        jcbSmins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));
        jcbSmins.setSelectedIndex(-1);
        VenuePanel.add(jcbSmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(31, 40, 108));
        jLabel8.setText("Type of Event");
        VenuePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, -1));

        jcbSampm.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jcbSampm.setForeground(new java.awt.Color(31, 40, 108));
        jcbSampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        jcbSampm.setSelectedIndex(-1);
        jcbSampm.addActionListener(this::jcbSampmActionPerformed);
        VenuePanel.add(jcbSampm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));

        txtEventType.addActionListener(this::txtEventTypeActionPerformed);
        VenuePanel.add(txtEventType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 450, 40));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(31, 40, 108));
        jLabel9.setText("Date");
        VenuePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 55, 24));

        jcbEampm.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jcbEampm.setForeground(new java.awt.Color(31, 40, 108));
        jcbEampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        jcbEampm.setSelectedIndex(-1);
        jcbEampm.addActionListener(this::jcbEampmActionPerformed);
        VenuePanel.add(jcbEampm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 30));

        jcbEmins.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jcbEmins.setForeground(new java.awt.Color(31, 40, 108));
        jcbEmins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));
        jcbEmins.setSelectedIndex(-1);
        VenuePanel.add(jcbEmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jcbEhour.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jcbEhour.setForeground(new java.awt.Color(31, 40, 108));
        jcbEhour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jcbEhour.setSelectedIndex(-1);
        jcbEhour.addActionListener(this::jcbEhourActionPerformed);
        VenuePanel.add(jcbEhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(31, 40, 108));
        jLabel10.setText("Time");
        VenuePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 55, 24));

        jcbEyear.setForeground(new java.awt.Color(31, 40, 108));
        jcbEyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2026", "2027", "" }));
        jcbEyear.setSelectedIndex(-1);
        VenuePanel.add(jcbEyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jcbEday.setForeground(new java.awt.Color(31, 40, 108));
        jcbEday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jcbEday.setSelectedIndex(-1);
        VenuePanel.add(jcbEday, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jcbEmonth.setForeground(new java.awt.Color(31, 40, 108));
        jcbEmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "" }));
        jcbEmonth.setSelectedIndex(-1);
        jcbEmonth.addActionListener(this::jcbEmonthActionPerformed);
        VenuePanel.add(jcbEmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(31, 40, 108));
        jLabel11.setText("Date");
        VenuePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 55, 24));

        jLabel12.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(31, 40, 108));
        jLabel12.setText("End of the Event");
        VenuePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, -1));

        jPanel1.add(VenuePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 502, 400));

        btnSubmit.setBackground(new java.awt.Color(255, 222, 89));
        btnSubmit.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(31, 40, 108));
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(null);
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.addActionListener(this::btnSubmitActionPerformed);
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 450, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/this is it.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 530, 510));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/150 51 for return button.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 260, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1074, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        ContactInfo CI = new ContactInfo();
        CI.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         String venue = jcbVenue.getSelectedItem() != null ? jcbVenue.getSelectedItem().toString().trim() : "";

        String startMonth = jcbSmonth.getSelectedItem() != null ? jcbSmonth.getSelectedItem().toString().trim() : "";
        String startDay = jcbSday.getSelectedItem() != null ? jcbSday.getSelectedItem().toString().trim() : "";
        String startYear = jcbSyear.getSelectedItem() != null ? jcbSyear.getSelectedItem().toString().trim() : "";
        String startHr = jcbShour.getSelectedItem() != null ? jcbShour.getSelectedItem().toString().trim() : "";
        String startMin = jcbSmins.getSelectedItem() != null ? jcbSmins.getSelectedItem().toString().trim() : "";
        String startAmPm = jcbSampm.getSelectedItem() != null ? jcbSampm.getSelectedItem().toString().trim() : "";

        String endMonth = jcbEmonth.getSelectedItem() != null ? jcbEmonth.getSelectedItem().toString().trim() : "";
        String endDay = jcbEday.getSelectedItem() != null ? jcbEday.getSelectedItem().toString().trim() : "";
        String endYear = jcbEyear.getSelectedItem() != null ? jcbEyear.getSelectedItem().toString().trim() : "";
        String endHr = jcbEhour.getSelectedItem() != null ? jcbEhour.getSelectedItem().toString().trim() : "";
        String endMin = jcbEmins.getSelectedItem() != null ? jcbEmins.getSelectedItem().toString().trim() : "";
        String endAmPm = jcbEampm.getSelectedItem() != null ? jcbEampm.getSelectedItem().toString().trim() : "";
        String eventType = txtEventType.getText().trim();
        
        if (venue.isEmpty() || 
            startMonth.isEmpty() || startDay.isEmpty() || startYear.isEmpty() || 
            startHr.isEmpty() || startMin.isEmpty() || startAmPm.isEmpty() || 
            endMonth.isEmpty() || endDay.isEmpty() || endYear.isEmpty() || 
            endHr.isEmpty() || endMin.isEmpty() || endAmPm.isEmpty() || 
            eventType.isEmpty()) {
            
         javax.swing.JOptionPane.showMessageDialog(this, 
        "Please fill in all fields before submitting!", 
        "Input Error", 
        javax.swing.JOptionPane.ERROR_MESSAGE);
        
        }else{    

   try {

    String rawStart = startMonth + " " + startDay + " " + startYear + " " + startHr + ":" + startMin + " " + startAmPm;
    String rawEnd = endMonth + " " + endDay + " " + endYear + " " + endHr + ":" + endMin + " " + endAmPm;

    SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy hh:mm a");
    java.util.Date parsedStart = formatter.parse(rawStart);
    java.sql.Timestamp sqlStart = new java.sql.Timestamp(parsedStart.getTime());
    
    java.util.Date parsedEnd = formatter.parse(rawEnd);
    java.sql.Timestamp sqlEnd = new java.sql.Timestamp(parsedEnd.getTime());
    
    java.util.Date currentDateTime = new java.util.Date();
    
    if(parsedStart.before(currentDateTime)) {
    JOptionPane.showMessageDialog(this,
            "You cannot select a past date and time!",
            "Invalid Date",
            JOptionPane.ERROR_MESSAGE);

    return; // stops the submit process
}

// Check if end time is before start time
if(parsedEnd.before(parsedStart)) {
    JOptionPane.showMessageDialog(this,
            "End of event cannot be earlier than start of event!",
            "Invalid Time",
            JOptionPane.ERROR_MESSAGE);

    return;
}

    Connection conn = DBConnection1.getConnection(); 

    String query = "INSERT INTO reservation_data (student_name, student_id, Student_number, Student_Email, venue, Start, End, event_type, Employee_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement pst = conn.prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS);


    pst.setString(1, this.name);         // student_name
    pst.setString(2, this.studentid);    //  student_id
    pst.setString(3, this.phone);        //  Student_number
    pst.setString(4, this.email);        //  Student_Email
    pst.setString(5, venue);             //  venue
    pst.setTimestamp(6, sqlStart);       //  Start
    pst.setTimestamp(7, sqlEnd);         //  End
    pst.setString(8, eventType);         //  event_type
    pst.setString(9, LOGIN.loggedInEmpID); // Employee_ID

    int rowsInserted = pst.executeUpdate();

    if (rowsInserted > 0) {
        ResultSet rsKeys = pst.getGeneratedKeys();
        String newEventCode = "N/A";
        if (rsKeys.next()) {
            newEventCode = rsKeys.getString(1); 
        }

        JOptionPane.showMessageDialog(this, "Reservation Saved Successfully!");
        
        String receiptDates = startMonth + " " + startDay + ", " + startYear + " @ " + startHr + ":" + startMin + " " + startAmPm + " TO " + endMonth + " " + endDay + ", " + endYear + " @ " + endHr + ":" + endMin + " " + endAmPm;

        output out = new output(newEventCode, this.studentid, this.email, this.phone, LOGIN.loggedInEmpID, venue, receiptDates);
        out.setVisible(true);

        this.dispose();
    }
    
    pst.close();
    conn.close();

} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jcbEhourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEhourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEhourActionPerformed

    private void jcbEampmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEampmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEampmActionPerformed

    private void txtEventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventTypeActionPerformed

    private void jcbSampmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSampmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSampmActionPerformed

    private void jcbShourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbShourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbShourActionPerformed

    private void jcbEmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEmonthActionPerformed

    private void jcbVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVenueActionPerformed

    private void jcbSmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSmonthActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new InputPage2().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VenuePanel;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbEampm;
    private javax.swing.JComboBox<String> jcbEday;
    private javax.swing.JComboBox<String> jcbEhour;
    private javax.swing.JComboBox<String> jcbEmins;
    private javax.swing.JComboBox<String> jcbEmonth;
    private javax.swing.JComboBox<String> jcbEyear;
    private javax.swing.JComboBox<String> jcbSampm;
    private javax.swing.JComboBox<String> jcbSday;
    private javax.swing.JComboBox<String> jcbShour;
    private javax.swing.JComboBox<String> jcbSmins;
    private javax.swing.JComboBox<String> jcbSmonth;
    private javax.swing.JComboBox<String> jcbSyear;
    private javax.swing.JComboBox<String> jcbVenue;
    private javax.swing.JTextField txtEventType;
    // End of variables declaration//GEN-END:variables
}
