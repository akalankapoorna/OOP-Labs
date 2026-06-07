/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author LENOVO
 */
public class Vehicle {
    private String vehicleNumber;
    protected String brand;

    public Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }

    public double calculateRentalCost() {
        System.out.println("General vehicle rental cost calculation");
        return 0.0;
    }
}
