/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ENTRY.java
 *
 * Created on Oct 23, 2013, 10:15:30 AM
 */

package HOSPITAL_MANAGEMENT;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author RMSA
 */
public class ENTRY extends javax.swing.JFrame {

    /** Creates new form ENTRY */
    public ENTRY() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("ENTER YOUR DETAILS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 30, 320, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("PATIENT NO.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 130, 100, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("PATIENT NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 210, 130, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("BLOOD GROUP");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 290, 140, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("FATHER'S NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 380, 130, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("TOWN/VILL");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 490, 100, 17);
        getContentPane().add(tf1);
        tf1.setBounds(240, 120, 210, 30);
        getContentPane().add(tf2);
        tf2.setBounds(240, 210, 210, 30);
        getContentPane().add(tf3);
        tf3.setBounds(250, 280, 190, 30);
        getContentPane().add(tf4);
        tf4.setBounds(250, 370, 180, 30);
        getContentPane().add(tf5);
        tf5.setBounds(250, 480, 190, 30);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.setToolTipText("enter your data\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 80, 90, 90);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.setToolTipText("end application");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 220, 90, 90);

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton3.setText("HOME");
        jButton3.setToolTipText("move main panel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(540, 380, 90, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOSPITAL_MANAGEMENT/lt_medical_doctor_co_40_powerpoint_templates_title_slide.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -20, 730, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       this.dispose();
       new MAIN().setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("java.sql.DriverManager");
        Connection con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","12345");
        String a,b,c,d,f;
        a=tf1.getText();
        b=tf2.getText();
        b="'"+b+"'";
        c=tf3.getText();
        c="'"+c+"'";
        d=tf4.getText();
        d="'"+d+"'";
        f=tf5.getText();
        f="'"+f+"'";
        String e="insert into kumar values("+a+","+b+","+c+","+d+","+f+")";
        Statement st=con.createStatement();
        st.executeUpdate(e);
        JOptionPane.showMessageDialog(null,"RECORD IS SAVED");
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e.getMessage());
        }

        

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ENTRY().setVisible(true);
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
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables

}