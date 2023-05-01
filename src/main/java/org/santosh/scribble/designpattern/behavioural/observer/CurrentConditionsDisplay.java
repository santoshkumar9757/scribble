package org.santosh.scribble.designpattern.behavioural.observer;

public class CurrentConditionsDisplay implements WeatherObserver, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay (Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
        // see MVC design pattern in HeadFirst ebook for better design of the display() method
    }

    @Override
    public void display() {
        System.out.println("Current Conditions temperature => " + temperature
                + "\n humidity=> " + humidity + "\n pressure=> " + pressure);
    }



}
