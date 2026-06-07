/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author LENOVO
 */
public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;
    
    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + fullName);
        System.out.println("Department: " + department);
    }

    public abstract double calculateMonthlyPayment();

    public static void showSystemName() {
        System.out.println("--- Campus Staff Payment System ---");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public void changeDepartment(String newDepartment) {
        if (newDepartment != null && !newDepartment.trim().isEmpty()) {
            this.department = newDepartment;
            System.out.println("Department successfully updated to: " + newDepartment);
        } else {
            System.out.println("Update failed: Department name cannot be empty.");
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: All staff must submit their monthly reports by the 5th.");
    }
}
