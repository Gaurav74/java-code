/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class jdbc1 {
    public static void main(String args[]) throws Exception{
        try{
        Class.forName("java.sql.DriverManager");
        Connection con=DriverManager.getConnection("jdbc:Mysql://localhost:3306/gaurav","root","12345");
        System.out.println(con.getMetaData());
        Statement st=con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                                      ResultSet.CONCUR_UPDATABLE);
        String qr="show databases;";
       System.out.println(st.getClass());
        ResultSet rs=st.executeQuery(qr);
        while(rs.next()){
            System.out.println(rs.toString());
            String nm=rs.getString("Database");
        }
    }
      catch(Exception e){
          
            System.err.println(e);
        }
}}
