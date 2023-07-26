package me.observer;

/**
 * Oywayten 23.07.2023.
 */

public class CurrentStatementDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public CurrentStatementDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.printf("Current statement: %sF degrees and %s%% humidity%n", temperature, humidity);
    }
}
