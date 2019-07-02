package de.hsReutlingen.Kafka.models;

public class Thermometer {
    private String day;
    private int time;
    private int temperature;

    public Thermometer(String day, int time, int temperature) {
        this.day = day;
        this.time = time;
        this.temperature = temperature;
    }

    public Thermometer() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
