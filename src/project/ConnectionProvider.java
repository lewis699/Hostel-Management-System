/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
 
/**
 *
 * @author lewis
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionProvider {
    public static Connection getCon()
    {
      try
      {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ hostel_db","root","Mutuma123456@");
        return con;
      }
      catch(ClassNotFoundException | SQLException e)
      {
      return null;
      }
    }
}
