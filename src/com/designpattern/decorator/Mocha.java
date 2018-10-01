package com.designpattern.decorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage; // The beverage we are wrapping

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * First delegate to the beverage we're decorating
     * @return the cost of the wrapped Beverage plus the cost of this decorator
     */
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
