/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raihan
 */
public class Car implements Vehicle {
    // Atribut
    String color;
    String noPlate;
    double width;
    double height;
    String brand;
    boolean isEngineOn;
    boolean isHeadLampOn;
    
// Konstruktor
    public Car(String color, String noPlate, double width, double height, String brand) {
        this.color = color;
        this.noPlate = noPlate;
        this.width = width;
        this.height = height;
        this.brand = brand;
        this.isEngineOn = false; // Default Mesin Mati
        this.isHeadLampOn = false; // Default Lampu Mati
    }
    
@Override
    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Mesin mobil " + brand + " dihidupkan.");
        } else {
            System.out.println("Mesin sudah menyala.");
        }
    }

    @Override
    public void throttle() {
        if (isEngineOn) {
            System.out.println("Mobil melaju...");
        } else {
            System.out.println("Mesin mati, tidak bisa melaju.");
        }
    }

    @Override
    public void brake() {
        if (isEngineOn) {
            System.out.println("Mobil mengerem...");
        } else {
            System.out.println("Mobil berhenti.");
        }
    }

    @Override
    public void turnOnHeadLamp() {
        if (!isHeadLampOn) {
            isHeadLampOn = true;
            System.out.println("Lampu depan dihidupkan.");
        } else {
            System.out.println("Lampu sudah menyala.");
        }
    }

    @Override
    public void turnOffHeadLamp() {
        if (isHeadLampOn) {
            isHeadLampOn = false;
            System.out.println("Lampu depan dimatikan.");
        } else {
            System.out.println("Lampu sudah mati.");
        }
    }
}