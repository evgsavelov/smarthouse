package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void checkIncrease(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Hitachi");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(22);
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }
    @Test
    public void checkDecrease(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("Hitachi");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(22);
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }
}