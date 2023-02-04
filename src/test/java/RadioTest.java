import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test(){
        Radio radio = new Radio(10);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
    }


    @Test
    public void NextStationTest() {
        Radio radio = new Radio(10);
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
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();

    }
    @Test
    public void IncreaseAfterMaxVolumeTest() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void DecreaseVolumeTest() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void DecreaseLess0VolumeTest() {
        Radio radio = new Radio(0);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
    }

        @Test
        public void TooMuchStationTest() {
            Radio radio = new Radio(0,10);
            radio.setCurrentStation(10);
            radio.next();
            int expected = 0;
            int actual = radio.getCurrentStation();
    }
    @Test
    public void TooSmallStationTest() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(-1);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
    }
    @Test
    public void TooMuchIncreaseVolumeTest() {
        Radio radio = new Radio(111);
        radio.setCurrentVolume(111);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
    }
    @Test
    public void TooSmallDecreaseVolumeTest() {
        Radio radio = new Radio(-1);
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
    }
}