package com.design.pattern.strategy;

import com.design.pattern.strategy.duck.Duck;
import com.design.pattern.strategy.behavior.fly.FlyRocketPowered;
import com.design.pattern.strategy.duck.MallardDuck;
import com.design.pattern.strategy.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly(); // Can't fly here!
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // It's flying with rockets now!!!
    }
}
