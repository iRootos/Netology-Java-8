package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio(20);

    @Test
    void setCurrentStation() {
        radio.setCurrentStation(20);
        int expected = 19;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void increaseVolume() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        radio.setCurrentStation(19);
        int expected = 0;
        int actual = radio.nextStation();
        assertEquals(expected, actual);
    }

    @Test
    void previousStation() {
        radio.setCurrentStation(0);
        int expected = 19;
        int actual = radio.previousStation();
        assertEquals(expected, actual);
    }
}
