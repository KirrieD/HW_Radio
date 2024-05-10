package ru.netology.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.Radio;

public class RadioTest {

    //Тесты на прибавление звука
    @Test
    void ExhibUpVol1(){
        Radio radio = new Radio();
        radio.setCurrectVol (0);
        radio.NextUpVol();

        int expected = 1;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpVol50(){
        Radio radio = new Radio();
        radio.setCurrectVol (49);
        radio.NextUpVol();

        int expected = 50;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpVol100(){
        Radio radio = new Radio();
        radio.setCurrectVol (99);
        radio.NextUpVol();

        int expected = 100;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpVolEqually100(){
        Radio radio = new Radio();
        radio.setCurrectVol (100);
        radio.NextUpVol();

        int expected = 100;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpVolNan(){
        Radio radio = new Radio();
        radio.setCurrectVol (-1);
        radio.NextUpVol();

        int expected = 1;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpVolNan1(){
        Radio radio = new Radio();
        radio.setCurrectVol (101);
        radio.NextUpVol();

        int expected = 1;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты на убаление звука
    @Test
    void ExhibDownVol0(){
        Radio radio = new Radio();
        radio.setCurrectVol (0);
        radio.NextDownVol();

        int expected = 0;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownVol50(){
        Radio radio = new Radio();
        radio.setCurrectVol (51);
        radio.NextDownVol();

        int expected = 50;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownVol99(){
        Radio radio = new Radio();
        radio.setCurrectVol (100);
        radio.NextDownVol();

        int expected = 99;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownVolNan(){
        Radio radio = new Radio();
        radio.setCurrectVol (-1);
        radio.NextDownVol();

        int expected = 0;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownVolNan1(){
        Radio radio = new Radio();
        radio.setCurrectVol (101);
        radio.NextDownVol();

        int expected = 0;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты на прибавление Канала
    @Test
    void ExhibUpRF1(){
        Radio radio = new Radio();
        radio.setCurrectRF (0);
        radio.NextUpRF();

        int expected = 1;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpRF5(){
        Radio radio = new Radio();
        radio.setCurrectRF (4);
        radio.NextUpRF();

        int expected = 5;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpRFEqually9(){
        Radio radio = new Radio();
        radio.setCurrectRF (9);
        radio.NextUpRF();

        int expected = 9;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpRF11(){
        Radio radio = new Radio();
        radio.setCurrectRF (8);
        radio.NextUpRF();

        int expected = 9;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpRFNan(){
        Radio radio = new Radio();
        radio.setCurrectRF (-1);
        radio.NextUpRF();

        int expected = 1;
        int actual = radio.getCurrectRF ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibUpRFNan1(){
        Radio radio = new Radio();
        radio.setCurrectRF (10);
        radio.NextUpRF();

        int expected = 1;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    //Тесты на убаление Канала
    @Test
    void ExhibDownRF0(){
        Radio radio = new Radio();
        radio.setCurrectRF (1);
        radio.NextDownRF();

        int expected = 0;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownRF5(){
        Radio radio = new Radio();
        radio.setCurrectRF (6);
        radio.NextDownRF();

        int expected = 5;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownRF8(){
        Radio radio = new Radio();
        radio.setCurrectRF (9);
        radio.NextDownRF();

        int expected = 8;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownRFNan(){
        Radio radio = new Radio();
        radio.setCurrectRF (-1);
        radio.NextDownRF();

        int expected = 0;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ExhibDownRFNan1(){
        Radio radio = new Radio();
        radio.setCurrectRF (10);
        radio.NextDownRF();

        int expected = 0;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    //Поедвыставление звука
    @Test
    void RepresVol0(){
        Radio radio = new Radio();
        radio.setCurrectVol(0);

        int expected = 0;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresVol50(){
        Radio radio = new Radio();
        radio.setCurrectVol(50);

        int expected = 50;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresVol100(){
        Radio radio = new Radio();
        radio.setCurrectVol(100);

        int expected = 100;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresVolNan(){
        Radio radio = new Radio();
        radio.setCurrectVol(-1);

        int expected = 0;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresVolNan1(){
        Radio radio = new Radio();
        radio.setCurrectVol(101);

        int expected = 0;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    //Поедвыставление канала
    @Test
    void RepresRF0(){
        Radio radio = new Radio();
        radio.setCurrectRF(0);

        int expected = 0;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresRF5(){
        Radio radio = new Radio();
        radio.setCurrectRF(5);

        int expected = 5;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresRF9(){
        Radio radio = new Radio();
        radio.setCurrectVol(9);

        int expected = 9;
        int actual = radio.getCurrectVol();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresRFNan(){
        Radio radio = new Radio();
        radio.setCurrectRF(-1);

        int expected = 0;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void RepresRFNan1(){
        Radio radio = new Radio();
        radio.setCurrectRF(10);

        int expected = 0;
        int actual = radio.getCurrectRF();

        Assertions.assertEquals(expected, actual);
    }
}
