package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void ShouldCheckCurrentStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckCurrentStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationMoreThanNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationLessThanNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPreviousStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioStationMoreThanZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void getCurrentStation() {
    }

    @Test
    public void ShouldCheckRadioVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setRadioVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldCheckRadioVolumeLessThanTen() {
        Radio radio = new Radio();
        radio.setRadioVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckRadioVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setRadioVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldCheckVolumeMoreThanZero() {
        Radio radio = new Radio();
        radio.setRadioVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void ShouldSetRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioVolume(3);
        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetRadioVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setRadioVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetRadioVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setRadioVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }



}