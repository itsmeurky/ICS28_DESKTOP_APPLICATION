
package ics28a_midrequirement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
  
       private static final String URL = "jdbc:mysql://localhost:3306/IT26-B";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() {
        Connection conn = null;
        
     try {
}