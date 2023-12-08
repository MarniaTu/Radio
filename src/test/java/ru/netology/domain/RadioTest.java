package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();

        assertEquals(10, radio.getStationsQuantity());
        assertEquals(0, radio.getMinStationNumber());
        assertEquals(9, radio.getMaxStationNumber());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testStationsQuantity() {
        Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getStationsQuantity());
        assertEquals(14, radio.getMaxStationNumber());
    }


    // @Test
    //public void shouldSetStationNumber() {
    //  Radio radio = new Radio();
    //radio.setStationNumber(8);

    //int expected = 8;
    //int actual = radio.getCurrentStation();

    //Assertions.assertEquals(expected, actual);
    //}
    @ParameterizedTest
    @CsvSource({"-1, 10, 0", "0, 10, 0", "10, 10, 0", "9, 10, 9", "15, 15, 0", "14, 15, 14" })
    public void shouldSetStationNumber(int newStationNumber, int stationsQuantity, int expected) {
        Radio radio = new Radio();
        radio.setStationsQuantity(stationsQuantity);

        radio.setStationNumber(newStationNumber);

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    //@Test
    //public void shouldSwitchToNextStation() {
    //  Radio radio = new Radio();
    // radio.setStationNumber(5);

    // radio.switchToNextStation();

    // int expected = 6;
    // int actual = radio.getCurrentStation();

    // Assertions.assertEquals(expected, actual);
    // }

    @ParameterizedTest
    @CsvSource({"5, 10, 6", "8, 10, 9", "9, 10, 0", "14, 15, 0", "13, 15, 14" })
    public void shouldSwitchToNextStation(int currentStation, int stationsQuantity, int expected) {
        Radio radio = new Radio();
        radio.setStationsQuantity(stationsQuantity);
        radio.setStationNumber(currentStation);

        radio.switchToNextStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    // @Test
    //   public void shouldSwitchToPreviousStation() {
    //    Radio radio = new Radio();
    //    radio.setStationNumber(3);

    //    radio.switchToPreviousStation();

    //    int expected = 2;
    //
    //    Assertions.assertEquals(expected, actual);
    //  }

    @ParameterizedTest
    @CsvSource({"3, 10, 2", "0, 10, 9", "9, 10, 8", "1, 10, 0", "14, 15, 13", "0, 15, 14" })
    public void shouldSwitchToPreviousStation(int currentStation, int stationsQuantity, int expected) {
        Radio radio = new Radio();
        radio.setStationsQuantity(stationsQuantity);
        radio.setStationNumber(currentStation);

        radio.switchToPreviousStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


    // @Test
    // public void shouldSetCurrentVolume() {
    //     Radio radio = new Radio();
    //     radio.setCurrentVolume(57);

    //    int expected = 57;
    //  int actual = radio.getCurrentVolume();

    //  Assertions.assertEquals(expected, actual);

    //  }

    @ParameterizedTest
    @CsvSource({"57, 57", "-1, 0", "101, 0" })
    public void shouldSetCurrentVolume(int newCurrentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newCurrentVolume);

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    // @Test
    // public void shouldIncreaseVolume() {
    //     Radio radio = new Radio();
    //     radio.setCurrentVolume(64);

    //     radio.increaseVolume();

    //     int expected = 65;
    //     int actual = radio.getCurrentVolume();

    //     Assertions.assertEquals(expected, actual);
    // }


    @ParameterizedTest
    @CsvSource({"64, 65", "99, 100", "100, 100", "0, 1" })
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // @Test
    // public void shouldDecreaseVolume() {
    //     Radio radio = new Radio();
    //     radio.setCurrentVolume(89);

    //     radio.decreaseVolume();

    //    int expected = 88;
    //    int actual = radio.getCurrentVolume();

    //  Assertions.assertEquals(expected, actual);
    //  }

    @ParameterizedTest
    @CsvSource({"89, 88", "1, 0", "0, 0", "100, 99" })
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}


