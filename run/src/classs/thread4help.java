/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs;

import java.sql.*;

/**
 *
 * @author HP
 */
public class thread4help extends Thread{
    
    public void run(){
         try{
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/thread","root","12345"); 
        String sql="select *from thread1";
        String sql1="use thread;";
        Statement st=con.createStatement();
        ResultSet rs=st.getResultSet();
        int e=st.executeUpdate(sql1);
        if(e<0){
        System.out.println("database error");
              }
        rs=st.executeQuery(sql);
        while(rs.next()){
        int  id=rs.getInt("id");
        String name=rs.getString("name");
        int marks=rs.getInt("marks"); 
        System.out.println("id="+id+"\tname="+name+"\tmarks="+marks);
        }      }
        catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
        }
        }
        public static void main(String args[]) throws InterruptedException{
        thread4help hp=new thread4help();
        Thread t=new Thread(hp);
        t.start();
        t.join();
        System.out.printf("Program is over\n");
        }
        }
