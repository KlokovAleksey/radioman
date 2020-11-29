package ru.netology;

public class Radio {

    private int currentListeningStation;
    private int currentVolume;
    private int minNumberStation;
    private int maxNumberStation;
    private int minVolume;
    private int maxVolume;

    public int getCurrentListeningStation() {
        return currentListeningStation;
    }

    public void setCurrentListeningStation(int currentListeningStation) {
        if (currentListeningStation > maxNumberStation) {
            return;
        }
        if (currentListeningStation < maxNumberStation) {
            return;
        }
        this.currentListeningStation = currentListeningStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        if (currentListeningStation == minNumberStation) {
            currentListeningStation = maxNumberStation;
        }

        currentListeningStation--;

        this.minNumberStation = minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        if (currentListeningStation == maxNumberStation) {
            currentListeningStation = minNumberStation;
        }

        currentListeningStation++;

        this.maxNumberStation = maxNumberStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        if (currentVolume == minVolume) {
            return;
        }

        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        if (currentVolume == maxVolume) {
            return;
        }
        this.maxVolume = maxVolume;
    }

}
