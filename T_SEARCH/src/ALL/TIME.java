package ALL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class TIME extends javax.swing.JFrame {

    /**
     * Creates new form frame3
     */
    public TIME() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jc2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jc3 = new javax.swing.JComboBox<>();
        jc1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jc4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("       ADD TIMINGS FOR CASSES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 650, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("I_D NO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 140, 200, 30);

        tf1.setToolTipText("I_ D NO");
        getContentPane().add(tf1);
        tf1.setBounds(320, 140, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ROOM NO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 370, 140, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SUBJECT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 450, 130, 30);

        tf2.setToolTipText("ROOM NO");
        getContentPane().add(tf2);
        tf2.setBounds(320, 360, 160, 30);

        tf3.setToolTipText("YOUR SUBJECT");
        getContentPane().add(tf3);
        tf3.setBounds(320, 450, 160, 30);

        jc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-YEAR", "8:45-9:35", "9:35-10:25", "10:25-11:15", "11:35-12:25", "12:25-1:15", "2:05-2:55", "2:55-3:45", "3:45-4:35" }));
        jc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc2ActionPerformed(evt);
            }
        });
        getContentPane().add(jc2);
        jc2.setBounds(720, 140, 230, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.setToolTipText("CLICK TO CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 360, 110, 100);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setToolTipText("CLEAR DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(830, 360, 100, 100);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("YEAR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 220, 110, 20);

        jc3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:45-9:35", "9:35-10:25", "10:45-11:35", "11:35-12:25", "1:15-2:05", "2:05-2:55", "2:55-3:45", "3:45-4:35" }));
        jc3.setToolTipText("");
        getContentPane().add(jc3);
        jc3.setBounds(720, 210, 230, 30);

        jc1.setBackground(new java.awt.Color(153, 255, 255));
        jc1.setForeground(new java.awt.Color(255, 0, 102));
        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT_YEAR", "1-YEAR", "2-YEAR", "3-YEAR", "4-YEAR" }));
        jc1.setAutoscrolls(true);
        jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc1ActionPerformed(evt);
            }
        });
        getContentPane().add(jc1);
        jc1.setBounds(320, 210, 160, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\teacher\\images.jpg")); // NOI18N
        jButton3.setText("HOME");
        jButton3.setToolTipText("GO HOME");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 20, 120, 90);

        jc4.setForeground(new java.awt.Color(255, 51, 102));
        jc4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTER DAY_NAME", "MONDAY", "TUESDAY", "WEDNESDAY", "THRUSDAY", "FRIDAY", "SATURDAY" }));
        jc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc4ActionPerformed(evt);
            }
        });
        getContentPane().add(jc4);
        jc4.setBounds(320, 290, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DAY");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 290, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PLEASE ENTER 'FREE' IF NO CLASS SCHEDULED");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 80, 360, 40);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\teacher\\maxresdefault.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 990, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc1ActionPerformed
        // TODO add your handling code here:
   String take=(String)jc1.getSelectedItem();
   if(take.equals("SELECT_YEAR")){
        jc3.setVisible(true);
         jc2.setVisible(true);
          jc2.enable(true); 
          jc3.enable(true);
         }
   if(take.equals("1-YEAR")){
       jc2.setVisible(true);
       jc3.setVisible(false);          
      }
   if(take.equals("2-YEAR")||take.equals("3-YEAR")||take.equals("4-YEAR"))
   {
         jc3.setVisible(true);
     jc2.setVisible(false);}
   
    }//GEN-LAST:event_jc1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tf1.setText(null);
        tf2.setText(null);
        tf3.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new start().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        here:  { 
        try{
Class.forName("java.sql.DriverManager");
Connection con=(Connection)DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/project","root","12345");
String id=tf1.getText().toUpperCase();
if(id.equals(null)){
    break here;
}
String day=((String) jc4.getSelectedItem()).toUpperCase();
if(day.equals("ENTER DAY_NAME")){
 JOptionPane.showMessageDialog(this,"Choose a proper day");
 break here;
        }
if(day.equals(null)){
    day="no entry";
}
String room=tf2.getText().toUpperCase();
if(room.equals(null)){
    room="NO ENTRY";
}
String subject=tf3.getText().toUpperCase();
if(subject.equals(null)){
    subject="NO ENTRY";
}
String year=((String) jc1.getSelectedItem()).toUpperCase();
if(jc1.getSelectedItem().equals("SELECT_YEAR")){
    int sure = JOptionPane.showConfirmDialog(this, "SURE NO CLASS");
    if(sure==0){
        String time="FREE";
         year="FREE";
    }
    JOptionPane.showMessageDialog(this,"ENTER CORRECT DAY");
    }
    

if(jc1.getSelectedItem().equals("1-YEAR")){
    String time=((String) jc2.getSelectedItem()).toUpperCase();
}
else
{
    String time=((String) jc3.getSelectedItem()).toUpperCase();
}

String time=(String) jc2.getSelectedItem();
String input="insert into ?(subject,room_no,year,timing,day) values(?,?,?,?,?);";
PreparedStatement stmt2=con.prepareStatement(input);
stmt2.setString(1,id);
stmt2.setString(2,subject);
stmt2.setString(3,room);
stmt2.setString(4,year);
stmt2.setString(5,time);
stmt2.setString(6,day);
int ok1=stmt2.executeUpdate();
if(ok1>=0){
    JOptionPane.showMessageDialog(this,"data entered correctly");
    
}
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e){
            JOptionPane.showMessageDialog(this,e);
        }}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc4ActionPerformed

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
            java.util.logging.Logger.getLogger(TIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JComboBox<String> jc2;
    private javax.swing.JComboBox<String> jc3;
    private javax.swing.JComboBox<String> jc4;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    // End of variables declaration//GEN-END:variables
}
