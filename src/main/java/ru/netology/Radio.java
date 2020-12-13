package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;
    private int maxStation;
    private int minStation;

    public void nextStation() {
        currentStation++;

        if (currentStation >= maxStation) {
            currentStation = minStation;
        }
    }

    public void pervStation() {
        currentStation--;

        if (currentStation <= minStation) {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        currentVolume++;
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void pervVolume() {
        currentVolume--;
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}
