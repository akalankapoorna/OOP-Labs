/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_sheet_8;

/**
 *
 * @author LENOVO
 */
public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        
        studentDAO.findStudentById(1);
        studentDAO.updateStudentMark(1, 95);
        studentDAO.findStudentById(1);
    }
}
