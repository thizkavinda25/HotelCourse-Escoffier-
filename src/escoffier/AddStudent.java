
package escoffier;
import java.sql.*;
import javax.swing.JOptionPane;
import connection.ConnectionProvider;


public class AddStudent extends javax.swing.JFrame {

  
    public AddStudent() {
        initComponents();
        
        try{
            
            int id = 1;
            String str1 = String.valueOf(id);
            idLabel.setText(str1);
            Connection conn = ConnectionProvider.getCon();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select max(id) from chef");
            
            while(rs.next()){
                
                id = rs.getInt(1);
                id = id+1;
                String str = String.valueOf(id);
                idLabel.setText(str);
            }
                    
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        timeCmb = new javax.swing.JComboBox<>();
        feeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        idLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        idLabel.setText("00");
        jPanel2.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 30));

        nameTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, 30));

        ageTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Age");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 50));

        addressTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 250, 30));

        mobileTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(mobileTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 180, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Mobile");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, 30));

        emailTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 250, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Time ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, 30));

        timeCmb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Time", "Part Time" }));
        timeCmb.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        timeCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCmbActionPerformed(evt);
            }
        });
        jPanel2.add(timeCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 120, 30));

        feeTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.add(feeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 690, 130, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Fee:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 40, 30));

        saveBtn.setBackground(new java.awt.Color(51, 204, 0));
        saveBtn.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Student imgs/mark_4476628 (1).png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(null);
        saveBtn.setBorderPainted(false);
        saveBtn.setContentAreaFilled(false);
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 760, 130, 70));

        resetBtn.setBackground(new java.awt.Color(255, 153, 0));
        resetBtn.setFont(new java.awt.Font("Arial", 3, 20)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Student imgs/restart_13077073.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setBorder(null);
        resetBtn.setBorderPainted(false);
        resetBtn.setContentAreaFilled(false);
        resetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        jPanel2.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 760, 120, 70));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 70)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Student imgs/16679320054873726951593471357235.jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 400, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Student imgs/left_9247575.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 50, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 530, 850));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Add Student imgs/Ausbildung-Culinary-Arts-in-Germany.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1520, 870));

        jLabel11.setBackground(new java.awt.Color(204, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("START YOUR CULINARY JOURNEY WITH US..!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1530, 840));

        setSize(new java.awt.Dimension(1528, 832));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void timeCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeCmbActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        String id = idLabel.getText();
        String name = nameTxt.getText();
        String age = ageTxt.getText();
        String address = addressTxt.getText();
        String mobile = mobileTxt.getText();
        String email = emailTxt.getText();
        String time = (String)timeCmb.getSelectedItem();
        String fee = feeTxt.getText();

        try{
            
            Connection conn = ConnectionProvider.getCon();
            PreparedStatement ps = conn.prepareStatement("insert into chef values (?,?,?,?,?,?,?,?)");

            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, age);
            ps.setString(4, address);
            ps.setString(5, mobile);
            ps.setString(6, email);
            ps.setString(7, time);
            ps.setString(8, fee);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Saved");
            setVisible(false);
            new AddStudent().setVisible(true);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        

    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField feeTxt;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> timeCmb;
    // End of variables declaration//GEN-END:variables
}
