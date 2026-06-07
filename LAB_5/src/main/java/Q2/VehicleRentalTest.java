/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author LENOVO
 */
public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("CAR-8921", "Toyota", 3, 5000.0);
        Vehicle vehicle2 = new Bike("BIKE-4432", "Honda", 5, 250.0);

        System.out.println("--- Car Details ---");
        vehicle1.displayVehicleInfo();
        double carCost = vehicle1.calculateRentalCost();
        System.out.println("Total Car Rental Cost: Rs. " + carCost);

        System.out.println("\n--- Bike Details ---");
        vehicle2.displayVehicleInfo();
        double bikeCost = vehicle2.calculateRentalCost();
        System.out.println("Total Bike Rental Cost: Rs. " + bikeCost);
    }
}
