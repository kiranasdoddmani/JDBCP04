package org.example;

import org.example.App;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Id:-");
        int id = sc.nextInt();
        sc.nextLine();  // consume leftover \n

        System.out.println("Enter Name:-");
        String name = sc.nextLine();

        System.out.println("Enter Age:-");
        int age = sc.nextInt();
        sc.nextLine();  // consume leftover \n

        System.out.println("Enter a Department:-");
        String course = sc.nextLine();

        System.out.println("Enter Marks:-");
        int marks = sc.nextInt();

        String sql = "INSERT INTO Students (id, name, age, course, marks) VALUES ("
                + id + ", '"
                + name + "', "
                + age + ", '"
                + course + "', "
                + marks + ")";

        System.out.println(sql);

        try{
            Statement statement=App.getInstance();
             int row = statement.executeUpdate(sql);
             System.out.println(row +"Row Inserted");
             System.out.println("DataBase is SuccessFully Inserted");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
