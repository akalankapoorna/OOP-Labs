/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_sheet_8;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        try (Connection connection = StudentDatabaseConnection.getConnection()) {
            System.out.println("Database connected successfully.");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
