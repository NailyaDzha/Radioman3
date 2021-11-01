package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation (){
        if (currentStation<9){
            currentStation = currentStation +1;
        }
        else currentStation = 0;
        this.currentStation = currentStation;
    }
    public void setPreviousStation () {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;

        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setRadioVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;

    }

    public void decreaseVolume(){
        if (currentVolume > 0){
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume() {
        currentVolume = 10;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}

