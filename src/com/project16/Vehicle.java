package com.project16;

import java.util.Objects;

public abstract class Vehicle {

    protected Engine engine;
    protected int weight;
    protected int speed;

    public Vehicle(Engine engine, int weight, int speed) {
        this.engine = engine;
        this.weight = weight;
        this.speed = speed;
    }

    public int testAccelerationToHoundred() {
        return testAccelerationTo(100);
    }

    public int testAccelerationTo(int upperSpeed) {
        int time = 0;
        int currentSpeed = 0;
        while (currentSpeed < 100){
            currentSpeed = engine.accelerate(weight, currentSpeed);
            time += 1;
        };
     return time;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return weight == vehicle.weight && speed == vehicle.speed && Objects.equals(engine, vehicle.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, weight, speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine=" + engine +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
