package ru.netology.domain;

public class Radio {

    private int numberOfStations;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        numberOfStations = 10;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > numberOfStations) {
            currentStation = numberOfStations;
        }
        this.currentStation = currentStation;
    }

    public int nextStation() {
        if (currentStation >= numberOfStations) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int previousStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations;
        } else {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
