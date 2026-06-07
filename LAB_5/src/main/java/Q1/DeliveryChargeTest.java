/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author LENOVO
 */
public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double base = 150.0;

        System.out.println("Standard Delivery: Rs. " + calculator.calculateCharge(base));
        System.out.println("Distance Delivery: Rs. " + calculator.calculateCharge(base, 5.0));
        System.out.println("Heavy Distance Delivery: Rs. " + calculator.calculateCharge(base, 5.0, 3.0));
        System.out.println("Express Delivery: Rs. " + calculator.calculateCharge(base, true));
    }
}
