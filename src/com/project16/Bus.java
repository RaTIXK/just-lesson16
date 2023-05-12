package com.project16;

public class Bus extends Vehicle{
    public Bus( int weight, int speed) {
        super(new NormalEngine(), weight, speed);
    }
}
