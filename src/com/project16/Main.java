package com.project16;

public class Main {
    public static void main(String[] args) {
        Vehicle car, bus;
        car = new Car(2 * 1000, 0);
        bus = new Bus(4 * 1000, 0);

        System.out.println("Car test result: " + car.testAccelerationToHoundred());

        System.out.println("Bus test result: " + bus.testAccelerationToHoundred());
    }
}