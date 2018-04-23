/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FIND.java
 *
 * Created on Oct 23, 2013, 10:15:46 AM
 */

package HOSPITAL_MANAGEMENT;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RMSA
 */
public class FIND extends javax.swing.JFrame {

    /** Creates new form FIND */
    public FIND() {
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
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("   SEARCH YOUR WARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 30, 270, 40);

        jLabel2.setText("PATIENT NO.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 134, 90, 20);
        getContentPane().add(tf1);
        tf1.setBounds(220, 130, 180, 30);

        jButton1.setText("SEARCH");
        jButton1.setToolTipText("search your ward\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 60, 90, 90);

        jButton2.setText("EXIT");
        jButton2.setToolTipText("end appliication");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 210, 90, 90);

        jButton3.setText("HOME");
        jButton3.setToolTipText("click to main panel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(550, 350, 90, 90);

        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient no.", "Name", "blood_group", "fathers_name", "Town/Vill"
            }
        ));
        jScrollPane1.setViewportView(jt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 480, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOSPITAL_MANAGEMENT/objects--white-background--medical-equipment--doctor_3338881.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, -60, 620, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MAIN().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm=(DefaultTableModel)jt1.getModel();
        try{
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gaurav","root","12345");
        Statement stmt= con.createStatement();
        String a;
        a=tf1.getText();
        String query="select* from kumar where patient_no="+a+"";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
        String patient_no=rs.getString("patient_no");
        String patient_name=rs.getString("patient_name");
        String blood_group=rs.getString("blood_group");
        String fathers_name=rs.getString("father_name");
        String town_vill=rs.getString("town_vill");
        tm.addRow(new Object[]{patient_no,patient_name,blood_group,fathers_name,town_vill});
            }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this,e.getMessage());
        }
      




    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FIND().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables

}
