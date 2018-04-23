/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author HP
 */
public class dsn {
    

  public static void main(String[] args) {
    Connection con = null;
    try {
      Class.forName("sun.jdbc.odbc.Mysqldriver") ;

// Connect with a url string
      con = DriverManager.getConnection("jdbc:odbc:mysql_con");
      System.out.println("DSN Connection ok.");
      con.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

