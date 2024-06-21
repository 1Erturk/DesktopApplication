/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritesites;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author enese
 */
public class DBConnection {
    public Connection dbConnection() {
        Connection connection = null;
        //Statement statement = null;
        //ResultSet resultSet = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/favoritesites";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, "root", "12345678");
            
        } catch(Exception e) {
            System.out.println("Error! " + e.getMessage());
        }
        
        return connection;
    }
}
