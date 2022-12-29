package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio function = new Radio();

        function.setStationNumber(7);

        int expected = 7;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber0() {
        Radio function = new Radio();

        function.setStationNumber(0);

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber1() {
        Radio function = new Radio();

        function.setStationNumber(1);

        int expected = 1;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber8() {
        Radio function = new Radio();

        function.setStationNumber(8);

        int expected = 8;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumber9() {
        Radio function = new Radio();

        function.setStationNumber(9);

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio function = new Radio();

        function.setStationNumber(-1);

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio function = new Radio();

        function.setStationNumber(10);

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio function = new Radio();
        function.setStationNumber(8);

        function.nextStation();

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTo0AfterStation9() {
        Radio function = new Radio();
        function.setStationNumber(9);

        function.nextStation();

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio function = new Radio();
        function.setStationNumber(1);

        function.prevStation();

        int expected = 0;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchTo9AfterStation0() {
        Radio function = new Radio();
        function.setStationNumber(0);

        function.prevStation();

        int expected = 9;
        int actual = function.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio function = new Radio();

        function.setSoundVolume(7);

        int expected = 7;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume0() {
        Radio function = new Radio();

        function.setSoundVolume(0);

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume1() {
        Radio function = new Radio();

        function.setSoundVolume(1);

        int expected = 1;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume9() {
        Radio function = new Radio();

        function.setSoundVolume(9);

        int expected = 9;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume10() {
        Radio function = new Radio();

        function.setSoundVolume(10);

        int expected = 10;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMin() {
        Radio function = new Radio();

        function.setSoundVolume(-1);

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio function = new Radio();

        function.setSoundVolume(11);

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnUpSoundVolume() {
        Radio function = new Radio();
        function.setSoundVolume(9);

        function.increaseVolume();

        int expected = 10;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpSoundVolumeAfter10() {
        Radio function = new Radio();
        function.setSoundVolume(10);

        function.increaseVolume();

        int expected = 10;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownSoundVolume() {
        Radio function = new Radio();
        function.setSoundVolume(1);

        function.decreaseVolume();

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownSoundVolumeAfter0() {
        Radio function = new Radio();
        function.setSoundVolume(0);

        function.decreaseVolume();

        int expected = 0;
        int actual = function.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}