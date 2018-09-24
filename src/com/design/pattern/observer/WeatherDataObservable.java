package com.design.pattern.observer;

import java.util.Observable;

/**
 * Uses built in {@link Observable} to implement the Observer pattern
 */
public class WeatherDataObservable extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable() {}

    /**
     * called by something when physical measurements have changed
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    // Simulate outside source updating the measurements
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
