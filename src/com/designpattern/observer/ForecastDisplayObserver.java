package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplayObserver implements Observer, DisplayElement {
    private float currentPressure = 29.2f;
    private float lastPressure;

    public ForecastDisplayObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) o;
            lastPressure = currentPressure;
            currentPressure = weatherDataObservable.getPressure();
            display();
        }
    }
}
