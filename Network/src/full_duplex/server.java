/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package full_duplex;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class server extends javax.swing.JFrame implements Runnable {

    ServerSocket server=null;
    Socket s=null;
    ObjectOutputStream out=null;
    ObjectInputStream in=null;
    String text="";
   
   
    public server() {
        initComponents();
    area.setEditable(false);
    user.setEditable(false);
    }
    
    @Override
 public void run(){
       try{
           area.append("deploying server\n");
           server=new ServerSocket(1234);
        s=server.accept();
        area.append("connected to client");
        out=new ObjectOutputStream(s.getOutputStream());
        in=new ObjectInputStream(s.getInputStream());
        area.append("\nNow chat...");
        user.setEditable(true);
        String temp="";
        do{
            temp=(String)in.readObject();
            if(temp!=null){
                area.append("\nclient : "+temp);
                }
        } while(!temp.equals("end"));
        area.append("\n"+"chat ended");
        user.setEditable(false);
       }catch(IOException | ClassNotFoundException e){
           area.append("\n"+e);
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("server");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 20, 50, 20);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(20, 250, 340, 30);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 340, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
       try{
            text=user.getText();
        if(text!=null){
            out.writeObject(text);
            out.flush();
            area.append("\n"+"me : "+text);
            if(text.equals("end")){
                    user.setEditable(false);
                      area.append("\n"+"chat ended");
                }
        }
        
        user.setText(null);
       }
       catch(IOException e){
          area.append("\n"+e); 
       }
    }//GEN-LAST:event_userActionPerformed

   
    public static void main(String args[]) {
      server s=new server();
      s.setVisible(true);
      Thread t=new Thread(s);
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
