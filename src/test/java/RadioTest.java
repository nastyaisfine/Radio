import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void NextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void NextAfter9StationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();

    }

    @Test
    public void PrevLess0StationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
    }

    @Test
    public void IncreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();

    }
    @Test
    public void IncreaseAfter10VolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void DecreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void DecreaseLess0VolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
    }

        @Test
        public void TooMuchStationTest() {
            Radio radio = new Radio();
            radio.setCurrentStation(10);
            radio.next();
            int expected = 9;
            int actual = radio.getCurrentStation();
    }
    @Test
    public void TooSmallStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
    }
    @Test
    public void TooMuchIncreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
    }
    @Test
    public void TooSmallDecreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
    }
}