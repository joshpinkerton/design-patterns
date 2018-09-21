package com.design.pattern.strategy.duck;

import com.design.pattern.strategy.behavior.fly.FlyWithWings;
import com.design.pattern.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
