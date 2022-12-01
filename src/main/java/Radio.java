public class Radio {


    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = minStation;

    public Radio(int minStation, int maxStation) {
        {
            this.minStation = minStation;
            this.maxStation = maxStation;
            this.currentStation = minStation;
        }

    }

    private int maxVolume = 100;
    private int minVolume = 0;

    private int currentVolume = minVolume;

    public Radio(int volume) {
        {
            int maxVolume = minVolume + volume;
        }
    }


    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation - 1) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = minStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}