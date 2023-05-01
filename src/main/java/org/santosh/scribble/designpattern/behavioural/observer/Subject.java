package org.santosh.scribble.designpattern.behavioural.observer;

public interface Subject {
    void registerObserver(WeatherObserver weatherObserver);
    void removeObserver(WeatherObserver weatherObserver);
    void notifyObservers();
}
