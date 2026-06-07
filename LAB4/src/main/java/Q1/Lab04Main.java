/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author LENOVO
 */
public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        System.out.println();
        UniversityPolicy.showPolicyHeader();
        System.out.println();

        Lecturer lecturer1 = new Lecturer("Dr. Alice Smith", "L-101", "Computer Science", 4, 15000.0);
        Lecturer lecturer2 = new Lecturer("Dr. Bob Johnson", "L-102", "Mathematics", 3, 14000.0);
        LabAssistant assistant1 = new LabAssistant("Charlie Brown", "LA-201", "Physics", 120, 500.0);

        System.out.println("--- Department Update ---");
        lecturer2.changeDepartment("Applied Mathematics");
        System.out.println();

        System.out.println("--- Staff Details ---");
        lecturer1.displayLecturerDetails();
        System.out.println();
        lecturer2.displayLecturerDetails();
        System.out.println();
        assistant1.displayLabAssistantDetails();
        System.out.println();

        System.out.println("--- Payment Details ---");
        double lec1Payment = lecturer1.calculateMonthlyPayment();
        double lec2Payment = lecturer2.calculateMonthlyPayment();
        double ast1Payment = assistant1.calculateMonthlyPayment();

        System.out.println(lecturer1.getFullName() + " Payment: " + lec1Payment + " (Bonus: " + UniversityPolicy.calculateBonus(lec1Payment) + ")");
        System.out.println(lecturer2.getFullName() + " Payment: " + lec2Payment + " (Bonus: " + UniversityPolicy.calculateBonus(lec2Payment) + ")");
        System.out.println(assistant1.getFullName() + " Payment: " + ast1Payment + " (Bonus: " + UniversityPolicy.calculateBonus(ast1Payment) + ")");
        System.out.println();

        double totalPayment = lec1Payment + lec2Payment + ast1Payment;
        System.out.println("Total Monthly Payment for all staff: " + totalPayment);
        System.out.println();

        System.out.println("Total Staff Members Created: " + StaffMember.getStaffCount());
        System.out.println();

        System.out.println("--- Common Notices ---");
        lecturer1.showCommonNotice();
        lecturer2.showCommonNotice();
        assistant1.showCommonNotice();
    }
}
