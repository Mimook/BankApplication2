/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapplication2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BankConnection {
    
    public static Connection connect(){ 
        String URL = "jdbc:mysql://localhost:3306/bank";
        String username = "root"; //in sql
        String password = "mookizs2004";
        Connection con = null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            con = DriverManager.getConnection(URL, username, password);  
   
                    } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BankConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}