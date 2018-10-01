package com.designpattern.strategy.behavior.fly;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
