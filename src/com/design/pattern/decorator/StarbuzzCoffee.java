package com.design.pattern.decorator;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Make a DarkRoast with two shots of Mocha and Whip
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1); // Wrap it with Mocha
        beverage1 = new Mocha(beverage1); // Wrap it in a second Mocha
        beverage1 = new Whip(beverage1); // Wrap it in a Whip
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
