

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bilca
 */

    

public class StudentDashboard extends javax.swing.JFrame {
private String username="";
    /**
     * Creates new form StudentDashboard
     */
    public StudentDashboard() {
        initComponents();
    }public StudentDashboard(String tempUsername){
       
    initComponents();
     username = tempUsername;
            setLocationRelativeTo(null);
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstPanel = new javax.swing.JPanel();
        addSUBS = new javax.swing.JButton();
        viewSubs = new javax.swing.JButton();
        stdProfile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/converted-exit-removebg-preview (1).png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(113, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 110, 30));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 50)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 255));
        jLabel10.setText("s");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("s");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 51));
        jLabel9.setText("R");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile/lagawt-removebg-preview (1).png"))); // NOI18N
        jButton5.setText("Logout");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SRS-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileIcon/local (2).jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        firstPanel.setBackground(new java.awt.Color(102, 153, 255));
        firstPanel.setPreferredSize(new java.awt.Dimension(612, 490));
        firstPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addSUBS.setBackground(new java.awt.Color(0, 153, 204));
        addSUBS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addSUBS.setForeground(new java.awt.Color(0, 0, 0));
        addSUBS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileIcon/minor-removebg-preview (1) (1).png"))); // NOI18N
        addSUBS.setText("Add Subject");
        addSUBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSUBSActionPerformed(evt);
            }
        });
        firstPanel.add(addSUBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, -1));

        viewSubs.setBackground(new java.awt.Color(0, 204, 204));
        viewSubs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewSubs.setForeground(new java.awt.Color(0, 0, 0));
        viewSubs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileIcon/ViewSub-removebg-preview (1).png"))); // NOI18N
        viewSubs.setText("View Subjects");
        viewSubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSubsActionPerformed(evt);
            }
        });
        firstPanel.add(viewSubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 110));

        stdProfile.setBackground(new java.awt.Color(204, 204, 204));
        stdProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stdProfile.setForeground(new java.awt.Color(0, 0, 0));
        stdProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileIcon/PProfile-removebg-preview (1) (1).png"))); // NOI18N
        stdProfile.setText("Student Profile");
        stdProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdProfileActionPerformed(evt);
            }
        });
        firstPanel.add(stdProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 260, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        firstPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Students !!");
        firstPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 230, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileIcon/Indian-removebg-preview.png"))); // NOI18N
        firstPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 350, 470));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile/stDb (1).jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(612, 500));
        firstPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jPanel2.add(firstPanel, "card5");

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Login().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void stdProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdProfileActionPerformed
        new StudentProfile(username).setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_stdProfileActionPerformed

    private void viewSubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSubsActionPerformed
        new ViewSubs(username).setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_viewSubsActionPerformed

    private void addSUBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSUBSActionPerformed
        new AddSubs(username).setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_addSUBSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSUBS;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton stdProfile;
    private javax.swing.JButton viewSubs;
    // End of variables declaration//GEN-END:variables

    
   
}
