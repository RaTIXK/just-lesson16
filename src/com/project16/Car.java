package com.project16;

public class Car extends Vehicle{

    public Car( int weight, int speed) {
        super(new SportEngine(), weight, speed);
    }
}
