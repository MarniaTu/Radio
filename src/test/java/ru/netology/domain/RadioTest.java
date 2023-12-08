package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(5);

        radio.switchToNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        Radio radio = new Radio();
        radio.setStationNumber(3);

        radio.switchToPreviousStation();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(57);

        int expected = 57;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(64);

        radio.increaseVolume();

        int expected = 65;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(89);

        radio.decreaseVolume();

        int expected = 88;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

