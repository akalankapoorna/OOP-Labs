/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_sheet_8;

/**
 *
 * @author LENOVO
 */
public class StudentInsertMain {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nimal Perera", 82);
        StudentDAO studentDAO = new StudentDAO();
        
        studentDAO.addStudent(student1);
    }
}
