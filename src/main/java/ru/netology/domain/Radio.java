package ru.netology.domain;

public class Radio {

    private int stationsQuantity = 10;
    private int minStationNumber;
    private int maxStationNumber = stationsQuantity - 1;

    private int currentStation;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int stationsQuantity) {

        this.stationsQuantity = stationsQuantity;
        this.maxStationNumber = stationsQuantity - 1;
    }

    public int getStationsQuantity() {
        return stationsQuantity;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationsQuantity(int stationsQuantity) {

        this.stationsQuantity = stationsQuantity;
        this.maxStationNumber = stationsQuantity - 1;

    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        currentStation = newStationNumber;
    }


    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void switchToNextStation() {
        if (currentStation < maxStationNumber) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStationNumber;
        }
        setStationNumber(currentStation);
    }

    public void switchToPreviousStation() {
        if (currentStation > minStationNumber) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStationNumber;
        }
        setStationNumber(currentStation);
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }
}
