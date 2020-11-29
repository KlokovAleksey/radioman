package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentListeningStation(0);
        assertEquals(0, radio.getCurrentListeningStation());
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinNumberStation() {
        Radio radio = new Radio();
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    public void shouldSetMaxNumberStation() {
        Radio radio = new Radio();
        radio.setMaxNumberStation(0);
        assertEquals(0, radio.getMaxNumberStation());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(0);
        assertEquals(0, radio.getMaxVolume());
    }

}