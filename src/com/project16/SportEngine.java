package com.project16;

public class SportEngine implements Engine {
    @Override
    public int accelerate(int weight, int oldSpeed) {
        return oldSpeed + (10000 / weight) * 10;
    }
}
