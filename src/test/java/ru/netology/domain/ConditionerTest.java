package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetandSet() {
        Conditioner conditioner = new Conditioner();
        String expectedName = "Tatyana_sv69";

        assertNull(conditioner.getName());
        conditioner.setName(expectedName);
        assertEquals(expectedName,conditioner.getName());
    }
    @Test
    public void checkIncrease(){
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(22);
        conditioner.setMaxTemperature(23);
        //conditioner.increaseCurrentTemperature();
        int expectedTemp = 23;
        //conditioner.increaseCurrentTemperature();
        assertEquals(expectedTemp, conditioner.increaseCurrentTemperature());
    }
}