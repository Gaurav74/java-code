/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package full_duplex;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class client extends javax.swing.JFrame implements Runnable {
Socket s=null;
ObjectOutputStream out=null;
ObjectInputStream in=null;
String input="";
  
    public client() {
        initComponents();
        area.setEditable(false);
        user.setEditable(false);
    }
    
@Override
    public void run(){
        try{
            s=new Socket(InetAddress.getLocalHost(),1234);
            area.append("Connected to server");
            out=new ObjectOutputStream(s.getOutputStream());
            in=new ObjectInputStream(s.getInputStream());
            area.append("\n"+"now chat");
            user.setEditable(true);
            String temp="";
            do{
                temp=(String)in.readObject();
                if(temp!=null){
                    area.append("\n"+"client : "+temp);
                }
            }
            while(!temp.equals("end"));
            area.append("\n"+"chat ended");
            user.setEditable(false);
        }
        catch(IOException | ClassNotFoundException e){
            area.append("\n"+"server not active");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        user = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("client");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 90, 20);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 360, 200);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(10, 280, 360, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        try{
            input=user.getText();
            if(input!=null){
                out.writeObject(input);
                out.flush();     
                area.append("\n"+"me: "+input);
                if(input.equals("end")){
                    user.setEditable(false);
                    area.append("\n"+"chat ended");
                }
            }
            user.setText(null);
        }catch(IOException e){
            area.append("\n"+e);
        }
        
    }//GEN-LAST:event_userActionPerformed

  
    public static void main(String args[]) {
       client c=new client();
       c.setVisible(true);
       Thread t=new Thread(c);
       t.setDaemon(true);
       t.start();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

}
