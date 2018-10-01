package com.designpattern.strategy.duck;

import com.designpattern.strategy.behavior.fly.FlyNoWay;
import com.designpattern.strategy.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
