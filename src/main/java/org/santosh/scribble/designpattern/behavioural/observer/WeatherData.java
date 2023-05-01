package org.santosh.scribble.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData () {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        int i = observers.indexOf(weatherObserver);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            WeatherObserver weatherObserver = (WeatherObserver) observers.get(i);
            weatherObserver.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
