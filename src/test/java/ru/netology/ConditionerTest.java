package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int temperatureBeforeIncrease = conditioner.getCurrentTemperature();
        conditioner.increaseCurrentTemperature();
        assertEquals(temperatureBeforeIncrease+1, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        int temperatureBeforeDecrease = conditioner.getCurrentTemperature();
        conditioner.decreaseCurrentTemperature();
        assertEquals(temperatureBeforeDecrease-1, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldIncreaseCurrentMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(conditioner.getMaxTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(conditioner.getMaxTemperature(), conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(conditioner.getMinTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(conditioner.getMinTemperature(), conditioner.getCurrentTemperature());
    }
}
