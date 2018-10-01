package com.designpattern.strategy.duck;

import com.designpattern.strategy.behavior.fly.FlyWithWings;
import com.designpattern.strategy.behavior.quack.Quack;

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
