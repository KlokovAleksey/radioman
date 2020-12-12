package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldNextOnMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPervStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.pervStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldPervOnMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.pervStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldNextMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldPervVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.pervVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldPervMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        radio.pervVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldAllArguments() {
        Radio radio = new Radio(5,10,0,100,10,0);
        assertEquals(0,radio.getMinVolume());
        assertEquals(100,radio.getMaxVolume());
        assertEquals(10,radio.getMaxStation());
        assertEquals(0,radio.getMinStation());
        assertEquals(5,radio.getCurrentStation());
        assertEquals(10,radio.getCurrentVolume());
    }
}
