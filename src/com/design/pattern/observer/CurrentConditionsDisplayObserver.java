package com.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * This uses built in {@link Observer} to be an observer of {@link WeatherDataObservable}
 */
public class CurrentConditionsDisplayObserver implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataObservable) {
            WeatherDataObservable weatherData = (WeatherDataObservable) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
