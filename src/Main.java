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
        Car myCar = new Car("Hitam", "T 6666 RF", 1.8, 1.5, "Toyota");

        // Method
        myCar.startEngine();
        myCar.throttle();
        myCar.turnOnHeadLamp();
        myCar.brake();
        myCar.turnOffHeadLamp();
    }

}
