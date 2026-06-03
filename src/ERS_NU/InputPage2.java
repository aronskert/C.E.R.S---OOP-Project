

package ERS_NU;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


/*ABSTRACTIONNN: instead of resetting this page it holds the input details by showing the page while hiding the implementation*/  
interface NavigablePage {
    void showPage();
    void hidePage();
}
/*POLYMORPSISIM: by implementing the interface tihs becomes polymorps */
public class InputPage2 extends javax.swing.JFrame implements NavigablePage {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InputPage2.class.getName());


    public InputPage2() {
        initComponents();
        jPanel3.setVisible(false);
        
    }
/*POLUMORPSIMSIMM: We use Method overriding and runtime poly*/
    @Override
    public void showPage() {
        this.setVisible(true);
    }

    @Override
    public void hidePage() {
        this.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        lblGuide = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btncheckevents = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
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
        jcbType = new javax.swing.JComboBox<>();
        btnguide = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGuide.setFont(new java.awt.Font("Serif", 3, 30)); // NOI18N
        lblGuide.setText("Reservation Form Guide");
        lblGuide.setToolTipText("");
        jPanel3.add(lblGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 340, 40));

        jLabel15.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Facility Management Office or FMO.");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 40));

        jLabel16.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("3 months in advance.");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 40));

        jLabel18.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("2. All reservation must be approved by first by the ");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        jLabel20.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("limits to ensure fair access.");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 40));

        jLabel22.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("for students.");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 40));

        jLabel23.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("students (8-hour limit for non-students).");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        jLabel24.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Funciton hall - Maximum 3-day reservation limit.");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 40));

        jLabel25.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(" daily limit for students.");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 40));

        jLabel26.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("1. Reservations can only be booked a maximum of ");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        jLabel27.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Gym - Available from 8:00 AM onwards. 4-hour limit for");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 40));

        jLabel21.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("3.Venue Restrictions: Student reservations have strict time");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        jLabel28.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("3rd floor /U2F - Available for full-week reservations. 5-hour");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 40));

        jLabel29.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("AVR - Maximum 3-day reservation limit. 5-hour daily limit");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 440, 450));

        jPanel2.setBackground(new java.awt.Color(31, 40, 108));
        jPanel2.setForeground(new java.awt.Color(31, 40, 108));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 750));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reservation");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 324, 84));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/buldgo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 347, 259));

        btnLogout.setBackground(new java.awt.Color(255, 222, 89));
        btnLogout.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/32 32 return png.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(this::btnLogoutActionPerformed);
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 160, 60));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Form");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 50));

        btncheckevents.setBackground(new java.awt.Color(255, 222, 89));
        btncheckevents.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btncheckevents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/Manage.png"))); // NOI18N
        btncheckevents.setText("CHECK AVAILABLE EVENTS");
        btncheckevents.setBorder(null);
        btncheckevents.setContentAreaFilled(false);
        btncheckevents.setPreferredSize(new java.awt.Dimension(170, 55));
        btncheckevents.addActionListener(this::btncheckeventsActionPerformed);
        jPanel2.add(btncheckevents, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 350, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/350 70 rectangle with curved sides.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

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
        jcbVenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Function Hall", "Gym", "3rd Floor", "AVR ROOM" }));
        jcbVenue.addActionListener(this::jcbVenueActionPerformed);
        VenuePanel.add(jcbVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 40));

        jcbSmonth.setForeground(new java.awt.Color(31, 40, 108));
        jcbSmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
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
        VenuePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, -1));

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
        jLabel8.setText("Type of Event ");
        VenuePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 320, -1));

        jcbSampm.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jcbSampm.setForeground(new java.awt.Color(31, 40, 108));
        jcbSampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        jcbSampm.setSelectedIndex(-1);
        jcbSampm.addActionListener(this::jcbSampmActionPerformed);
        VenuePanel.add(jcbSampm, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, 30));

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

        jcbType.setBackground(new java.awt.Color(255, 222, 89));
        jcbType.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jcbType.setForeground(new java.awt.Color(31, 40, 108));
        jcbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Organizational Event", "Student Event", "Outside Organizational Event", "National University Dasmarinas event", "Outside School Event" }));
        jcbType.addActionListener(this::jcbTypeActionPerformed);
        VenuePanel.add(jcbType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 290, 40));

        btnguide.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnguide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/20 20 info logo.png"))); // NOI18N
        btnguide.setText("GUIDE");
        btnguide.setToolTipText("\"Please select your Venue and Date first!\"");
        btnguide.setBorder(null);
        btnguide.setBorderPainted(false);
        btnguide.setContentAreaFilled(false);
        btnguide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnguideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnguideMouseExited(evt);
            }
        });
        btnguide.addActionListener(this::btnguideActionPerformed);
        VenuePanel.add(btnguide, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jPanel1.add(VenuePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 502, 400));

        btnSubmit.setBackground(new java.awt.Color(255, 222, 89));
        btnSubmit.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(31, 40, 108));
        btnSubmit.setText("NEXT");
        btnSubmit.setToolTipText("\"Please select your Venue and Date first!\"");
        btnSubmit.setBorder(null);
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.addActionListener(this::btnSubmitActionPerformed);
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 450, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/this is it.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 530, 510));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e/r/s/nu/Pictures and icons/figma_pics/150 51 for return button.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 41, 160, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1074, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       
        LOGIN.loggedInEmpID = ""; 
        ContactInfo.savedName = "";
        ContactInfo.savedStudentId = "";
        ContactInfo.savedPhone = "";
        ContactInfo.savedEmail = "";
        
        Dashboard db = new Dashboard(); 
        db.setVisible(true);
        this.dispose();

 
    }//GEN-LAST:event_btnLogoutActionPerformed

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
    String eventType = jcbType.getSelectedItem() != null ? jcbType.getSelectedItem().toString().trim() : "";
    
    // 1. Validation Check
    if (venue.isEmpty() || startMonth.isEmpty() || startDay.isEmpty() || startYear.isEmpty() || 
        startHr.isEmpty() || startMin.isEmpty() || startAmPm.isEmpty() || 
        endMonth.isEmpty() || endDay.isEmpty() || endYear.isEmpty() || 
        endHr.isEmpty() || endMin.isEmpty() || endAmPm.isEmpty() || eventType.isEmpty()) {
        
        JOptionPane.showMessageDialog(this, "Please fill in all fields before proceeding!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
    // 1. Glue your combo boxes together with clear spaces in between
    String rawStart = startMonth + " " + startDay + " " + startYear + " " + startHr + ":" + startMin + " " + startAmPm;
    String rawEnd = endMonth + " " + endDay + " " + endYear + " " + endHr + ":" + endMin + " " + endAmPm;

    // 2. THE EYE-OPENER: Print these out to your NetBeans Output window below!
    System.out.println("--- DEBUGGING DATE STRINGS ---");
    System.out.println("What Java sees for Start Date: [" + rawStart + "]");
    System.out.println("What Java sees for End Date:   [" + rawEnd + "]");
    System.out.println("------------------------------");

    // 3. Match your pattern EXACTLY to what prints out.
    // MMMM = Full month name (e.g., "January"). If your combo box uses "Jan", change MMMM to MMM.
    // dd = Day, yyyy = Year, hh = 12-hour digit, mm = minutes, a = AM/PM marker.
    SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy hh:mm a");
    
    java.util.Date parsedStart = formatter.parse(rawStart);
    java.util.Date parsedEnd = formatter.parse(rawEnd);
    java.util.Date currentDateTime = new java.util.Date();
    
    // Check if it's actually reading the dates right now
    System.out.println("Successfully parsed Start: " + parsedStart);

    if (parsedStart.before(currentDateTime)) {
        JOptionPane.showMessageDialog(this, "You cannot select a past date and time!", "Invalid Date", JOptionPane.ERROR_MESSAGE);
        return;
    }
    LocalDate today = LocalDate.now();
    LocalDate reservationDate = parsedStart.toInstant()
        .atZone(java.time.ZoneId.systemDefault())
        .toLocalDate();

    if (reservationDate.isAfter(today.plusMonths(3))) {
    JOptionPane.showMessageDialog(this,
        "Reservations can only be booked up to 3 months in advance!",
        "Reservation Limit",
        JOptionPane.ERROR_MESSAGE);
    return;
}
    

       // Convert to SQL Timestamps
        java.sql.Timestamp sqlStart = new java.sql.Timestamp(parsedStart.getTime());
        java.sql.Timestamp sqlEnd = new java.sql.Timestamp(parsedEnd.getTime());

        
        if (parsedEnd.before(parsedStart)) {
            JOptionPane.showMessageDialog(this, "End time cannot be earlier than Start time!", "Invalid Time", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //venue rules
        long durationHours =(parsedEnd.getTime() - parsedStart.getTime()) / (1000 * 60 * 60);

          long durationDays = (parsedEnd.getTime() - parsedStart.getTime()) / (1000 * 60 * 60 * 24);

    // Function Hall
    if (venue.equals("Function Hall") && durationDays > 3) {
    JOptionPane.showMessageDialog(this,
        "Function Hall can only be reserved for up to 3 days.");
    return;
}

    // Gym
    if (venue.equals("Gym")) {

        int startHour24 = parsedStart.getHours();

    if (startHour24 < 8) {
        JOptionPane.showMessageDialog(this,
            "Gym reservations must start at 8:00 AM or later.");
        return;
    }

    if (eventType.equals("Student Event")) {

        if (durationHours > 4) {
            JOptionPane.showMessageDialog(this,
                "Students may reserve the Gym for only 4 hours.");
            return;
        }

        } else if (!eventType.equals("National University Dasmarinas event")) {

            if (durationHours > 10) {
              JOptionPane.showMessageDialog(this,
                "Gym reservations are limited to 10 hours.");
            return;
        }
    }
}

    // 3rd Floor
    if (venue.equals("3rd Floor")) {

        if (eventType.equals("Student Event")) {

            if (durationHours > 5) {
                JOptionPane.showMessageDialog(this,
                  "Students may reserve the 3rd Floor for only 5 hours.");
            return;
        }

         } else {

              if (durationDays > 7) {
            JOptionPane.showMessageDialog(this,
                "3rd Floor can only be reserved for up to 1 week.");
            return;
        }
    }
}

    // AVR
if (venue.equals("AVR ROOM")) {

    if (durationDays > 3) {
        JOptionPane.showMessageDialog(this,
            "AVR can only be reserved for up to 3 days.");
        return;
    }

    if (eventType.equals("Student Event") && durationHours > 5) {
        JOptionPane.showMessageDialog(this,
            "Students may reserve the AVR for only 5 hours.");
        return;
    }
}
        
        // THE DOUBLE-BOOKING CHECK
        
        Connection con = DBConnection.getConnection();
        
        // This query checks for overlapping times in the exact same venue
        String checkSql = "SELECT * FROM reservation_data WHERE venue = ? AND (Start < ?) AND (End > ?)";
        PreparedStatement pst = con.prepareStatement(checkSql);
        
        pst.setString(1, venue);
        pst.setTimestamp(2, sqlEnd);   // Existing event starts before NEW event ends
        pst.setTimestamp(3, sqlStart); // Existing event ends after NEW event starts
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            // If rs.next() is true, it means it found an overlapping event!
            JOptionPane.showMessageDialog(this, 
                "Double Booking Alert!\nThis venue is already booked during your selected time.\nPlease click 'Check Available Events' to find a free slot.", 
                "Venue Unavailable", 
                JOptionPane.ERROR_MESSAGE);
            
            rs.close();
            pst.close();
            con.close();
            return; // Stop them from going to the next page!
        // ==========================================
        
        }
      ContactInfo CI = new ContactInfo(venue, sqlStart, sqlEnd, eventType);
      CI.setPreviousPage(this); 
      CI.setVisible(true);
      
this.setVisible(false); // Hide this page instead of disposing so it keeps its selections 
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error processing date selection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
  
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jcbEhourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEhourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEhourActionPerformed

    private void jcbEampmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEampmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEampmActionPerformed

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

    private void jcbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTypeActionPerformed

    private void btnguideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguideMouseEntered
        jPanel3.setVisible(true);
    }//GEN-LAST:event_btnguideMouseEntered

    private void btnguideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguideMouseExited
        jPanel3.setVisible(false);
    }//GEN-LAST:event_btnguideMouseExited

    private void btncheckeventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckeventsActionPerformed
        // TODO add your handling code here:
        UserCheckAvailability UCA = new UserCheckAvailability();
        UCA.setVisible(true);
    }//GEN-LAST:event_btncheckeventsActionPerformed

    private void btnguideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguideActionPerformed

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
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btncheckevents;
    private javax.swing.JButton btnguide;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JComboBox<String> jcbType;
    private javax.swing.JComboBox<String> jcbVenue;
    private javax.swing.JLabel lblGuide;
    // End of variables declaration//GEN-END:variables
}
