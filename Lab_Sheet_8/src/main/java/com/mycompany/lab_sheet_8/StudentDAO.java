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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    // 1. Method to add a new student (Question 2)
    public void addStudent(Student student) {
        // The SQL command to insert data. '?' marks the empty spots for our data.
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        
        // Connect to the database
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            // Put the student's ID, name, and mark into the '?' spots
            statement.setInt(1, student.getStudent_id());
            statement.setString(2, student.getStudent_name());
            statement.setInt(3, student.getMark());
            
            // Run the command to save the data
            statement.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            // Show an error if something goes wrong
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // 2. Method to show all students (Question 3)
    public void displayAllStudents() {
        // The SQL command to get all data from the table
        String sql = "SELECT student_id, student_name, mark FROM students";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             // Run the command and keep the result
             ResultSet resultSet = statement.executeQuery()) {
             
            // Read and print each student's data one by one
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("student_id") + " - " +
                                   resultSet.getString("student_name") + " - " +
                                   resultSet.getInt("mark"));
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // 3. Method to find one student using their ID (Question 4)
    public void findStudentById(int studentId) {
        // The SQL command to search for a specific ID
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            // Put the ID we are looking for into the '?' spot
            statement.setInt(1, studentId);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                // If the student is found, print their details
                if (resultSet.next()) {
                    System.out.println("Student Details: " + resultSet.getInt("student_id") + " - " +
                                       resultSet.getString("student_name") + " - " +
                                       resultSet.getInt("mark"));
                } else {
                    // If the student is not found, print a message
                    System.out.println("Student not found.");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // 4. Method to change a student's mark (Question 4)
    public void updateStudentMark(int studentId, int newMark) {
        // The SQL command to change the mark
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        
        try (Connection connection = StudentDatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            // Put the new mark into the first '?' spot
            statement.setInt(1, newMark);
            // Put the student ID into the second '?' spot
            statement.setInt(2, studentId);
            
            // Run the command and check how many rows were changed
            int rowsUpdated = statement.executeUpdate();
            
            // If at least one row changed, it was successful
            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                // If no rows changed, the student wasn't found
                System.out.println("Student not found. Mark not updated.");
            }
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}