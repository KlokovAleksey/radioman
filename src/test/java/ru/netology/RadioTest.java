package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentListeningStation(0);
        assertEquals(0,radio.getCurrentListeningStation());
    }
}