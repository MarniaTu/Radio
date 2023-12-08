package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //@Test
    //public void shouldSetStationNumber() {
    //  Radio radio = new Radio();
    //radio.setStationNumber(8);

    //int expected = 8;
    //int actual = radio.getCurrentStation();

    //Assertions.assertEquals(expected, actual);
    //}

    @ParameterizedTest
    @CsvSource({"8, 8", "-1, 0", "10, 0", "9, 9" })
    public void shouldSetStationNumber(int newStationNumber, int expected) {
        Radio radio = new Radio();
        radio.setStationNumber(newStationNumber);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void shouldSwitchToNextStation() {
    //  Radio radio = new Radio();
    //radio.setStationNumber(5);

    //radio.switchToNextStation();

    //int expected = 6;
    //int actual = radio.getCurrentStation();

    //Assertions.assertEquals(expected, actual);
    //}

    @ParameterizedTest
    @CsvSource({"5, 6", "9, 0", "0, 1", "8, 9" })
    public void shouldSwitchToNextStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setStationNumber(currentStation);

        radio.switchToNextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void shouldSwitchToPreviousStation() {
    //  Radio radio = new Radio();
    // radio.setStationNumber(3);

    // radio.switchToPreviousStation();

    //int expected = 2;
    //int actual = radio.getCurrentStation();

    //Assertions.assertEquals(expected, actual);
    //}

    @ParameterizedTest
    @CsvSource({"3, 2", "0, 9", "9, 8", "1, 0" })
    public void shouldSwitchToPreviousStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setStationNumber(currentStation);

        radio.switchToPreviousStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void shouldSetCurrentVolume() {
    //  Radio radio = new Radio();
    // radio.setCurrentVolume(57);

    //int expected = 57;
    //int actual = radio.getCurrentVolume();

    //Assertions.assertEquals(expected, actual);

    //}

    @ParameterizedTest
    @CsvSource({"57, 57", "-1, 0", "101, 0" })
    public void shouldSetCurrentVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void shouldIncreaseVolume() {
    //  Radio radio = new Radio();
    //radio.setCurrentVolume(64);

    //radio.increaseVolume();

    //int expected = 65;
    //int actual = radio.getCurrentVolume();

    //Assertions.assertEquals(expected, actual);
    //}

    @ParameterizedTest
    @CsvSource({"64, 65", "99, 100", "100, 100", "0, 1" })
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void shouldDecreaseVolume() {
    //  Radio radio = new Radio();
    //radio.setCurrentVolume(89);

    //radio.decreaseVolume();

    //int expected = 88;
    //int actual = radio.getCurrentVolume();

    //Assertions.assertEquals(expected, actual);
    //}

    @ParameterizedTest
    @CsvSource({"89, 88", "1, 0", "0, 0", "100, 99" })
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


