package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {

    private int stationsQuantity = 10;
    private int minStationNumber;
    private int maxStationNumber = stationsQuantity - 1;

    private int currentStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;


}
