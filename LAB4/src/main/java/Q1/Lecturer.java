/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author LENOVO
 */
public class Lecturer extends StaffMember {
    private int courseCount;
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffId, String department, int courseCount, double paymentPerCourse) {
        super(fullName, staffId, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    @Override
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    public void displayLecturerDetails() {
        displayBasicDetails();
        System.out.println("Role: Lecturer");
        System.out.println("Courses Taught: " + courseCount);
        System.out.println("Payment Per Course: " + paymentPerCourse);
    }
}
