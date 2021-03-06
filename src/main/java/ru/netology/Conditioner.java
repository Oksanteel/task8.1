package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature = 25;
    private int minTemperature = 10;
    private int currentTemperature = 15;
    private boolean on;

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature) {
            currentTemperature++;
        } else {
            return;
        }
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            currentTemperature--;
        } else {
            return;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}


