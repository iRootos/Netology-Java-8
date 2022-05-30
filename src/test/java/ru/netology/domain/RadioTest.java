package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = {"/DataTestCurrentStation.csv"})
    void setCurrentStation(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/DataTestIncreaseVolume.csv"})
    void increaseVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/DataTestDecreaseVolume.csv"})
    void decreaseVolume(int currentVolume, int expected) {
        radio.setCurrentVolume(currentVolume);
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/DataTestNextStation.csv"})
    void nextStation(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        int actual = radio.nextStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/DataTestPreviousStation.csv"})
    void previousStation(int currentStation, int expected) {
        radio.setCurrentStation(currentStation);
        int actual = radio.previousStation();
        assertEquals(expected, actual);
    }
}
