package com.designpattern.factory.factorymethod;

/**
 * This has the abstract factory method createPizza() which forces subclasses to determine
 * what kind of Pizza to create. This gives them flexibility in what they can create while
 * and isolates the client (code in this superclass PizzaStore) from knowing what kind of Pizza it is
 * actually operating on (loosely coupled!)
 */
public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
