package com.project16;

public class NormalEngine implements Engine {




    @Override
    public int accelerate(int weight, int oldSpeed) {
        return oldSpeed + (10000 / weight) * 5;
    }
}
