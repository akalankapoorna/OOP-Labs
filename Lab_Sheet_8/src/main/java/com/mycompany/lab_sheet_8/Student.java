/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_sheet_8;

/**
 *
 * @author LENOVO
 */
public class Student {
    private int student_id;
    private String student_name;
    private int mark;

    // Constructor
    public Student(int student_id, String student_name, int mark) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.mark = mark;
    }

    // Getters
    public int getStudent_id() { return student_id; }
    public String getStudent_name() { return student_name; }
    public int getMark() { return mark; }
}