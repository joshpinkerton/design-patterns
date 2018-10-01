package com.designpattern;

import com.designpattern.observer.*;
import com.designpattern.strategy.duck.Duck;
import com.designpattern.strategy.behavior.fly.FlyRocketPowered;
import com.designpattern.strategy.duck.MallardDuck;
import com.designpattern.strategy.duck.ModelDuck;

public class DesignPatternsRunner {

    public static void main(String[] args) {
        // Strategy pattern
        //runDuckStrategyPattern();

        // Observer pattern
        runWeatherObserverPattern();
    }

    /**
     * Chapter 1
     */
    public static void runDuckStrategyPattern() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly(); // Can't fly here!
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // It's flying with rockets now!!!
    }

    /** Chapter 2
     *
     */
    public static void runWeatherObserverPattern() {
        // Subject
        WeatherData weatherData = new WeatherData();

        // Observers
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        /**
         * Using Java's built in Observable/Observer library
         */
        // Observable
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();

        // Observers
        CurrentConditionsDisplayObserver currentConditionsDisplayObserver = new CurrentConditionsDisplayObserver(weatherDataObservable);
        ForecastDisplayObserver forecastDisplayObserver = new ForecastDisplayObserver(weatherDataObservable);

        // Simulate new weather measurements
        weatherDataObservable.setMeasurements(80, 65, 30.4f);
        weatherDataObservable.setMeasurements(82, 70, 29.2f);
        weatherDataObservable.setMeasurements(78, 90, 29.2f);
    }
}
