package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();
        int number = 5;
        radio.setCurrentListeningStation(number);
        assertEquals(number, radio.getCurrentListeningStation());
    }

}