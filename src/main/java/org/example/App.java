/*
  In Previous JDBC-Project We See Static Means Fixed-Input
    In This Project We See a Dynamic Insertion-Input
         Scanner sc=new Scacnner(System.in);
 */

package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    private static String url = "jdbc:mysql://localhost:3306/college";
    private static String username="root";
    private static String password="..........";

    public static Statement getInstance(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
             Statement statement=connection.createStatement();
             return statement;
           } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
          } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
