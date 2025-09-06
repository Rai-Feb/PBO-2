/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raihan
 */
public class Main {
    public static void main(String[] args) {
        // New Object
        Car myCar = new Car("Merah", "B 1234 XY", 1.8, 1.5, "Honda");

        // Method
        myCar.startEngine();
        myCar.throttle();
        myCar.turnOnHeadLamp();
        myCar.brake();
        myCar.turnOffHeadLamp();
    }
}