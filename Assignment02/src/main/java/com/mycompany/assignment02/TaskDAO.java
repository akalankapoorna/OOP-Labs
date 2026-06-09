package com.mycompany.assignment02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class TaskDAO {

    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (task_id, title, status) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setInt(1, task.getTaskId());
            stmt.setString(2, task.getTitle());
            stmt.setString(3, task.getStatus());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Task added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); // [cite: 642]
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) { // Duplicate ID error
                JOptionPane.showMessageDialog(null, "Task ID already exists!", "Error", JOptionPane.ERROR_MESSAGE); // [cite: 637]
            } else {
                JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public Task searchTask(int taskId) {
        String sql = "SELECT * FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setInt(1, taskId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Task(rs.getInt("task_id"), rs.getString("title"), rs.getString("status"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void updateTask(Task task) {
        String sql = "UPDATE tasks SET title = ?, status = ? WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setString(1, task.getTitle());
            stmt.setString(2, task.getStatus());
            stmt.setInt(3, task.getTaskId());
            
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Task updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); // [cite: 642]
            } else {
                JOptionPane.showMessageDialog(null, "Task not found to update.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteTask(int taskId) {
        String sql = "DELETE FROM tasks WHERE task_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setInt(1, taskId);
            
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Task deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE); // [cite: 642]
            } else {
                JOptionPane.showMessageDialog(null, "Task not found to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}