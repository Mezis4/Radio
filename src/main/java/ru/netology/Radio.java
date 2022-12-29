package ru.netology;

public class Radio {

    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void nextStation() {
        int nextAfterMax = 0;
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = nextAfterMax;
        }
    }

    public void prevStation() {
        int nextAfterMin = 9;
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = nextAfterMin;
        }
    }

    private int soundVolume;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        int soundAfterMax = 10;
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = soundAfterMax;
        }
    }

    public void decreaseVolume() {
        int soundBeforeMin = 0;
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = soundBeforeMin;
        }
    }
}
