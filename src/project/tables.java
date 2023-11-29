/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lewis
 */
public class tables {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            // Corrected SQL statement with a closing parenthesis
           st.executeUpdate("CREATE TABLE users (name varchar(200), email varchar(200), password varchar(50), securityQuestion varchar(500), answer varchar(200), address varchar(200), status varchar(20))");
           st.executeUpdate("CREATE TABLE room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
           st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar (200),pricePerDay int(10),numberofDaysStay int(10),totalAmount varchar(200),checkout varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                // Handle any exceptions here
            }
        }
    }
}

