package ru.netology.services;

public class Radio {
    private int MaxVol = 100;
    private int MinVol = 0;
    private int MaxRF = 9;
    private int MinRF = 0;
    private int CurrectVol;
    private int CurrectRF;

    // Прибавление громкости
    public void NextUpVol() {
        if (CurrectVol < MaxVol) {
            CurrectVol++;
        } else {
            CurrectVol = MaxVol;
        }
    }

    // Убавление громкости
    public void NextDownVol() {
        if (CurrectVol > MinVol) {
            CurrectVol--;
        } else {
            CurrectVol = MinVol;
        }

    }

    // Выставление громкости
    public int getCurrectVol() {
        return CurrectVol;
    }

    public void setCurrectVol(int newCurrectVol) {
        if (newCurrectVol > MaxVol) {
            return;
        }
        if (newCurrectVol < MinVol) {
            return;
        }
        CurrectVol = newCurrectVol;

    }

    // Прибавление частоты (канала)
    public void NextUpRF() {
        if (CurrectRF < MaxRF) {
            CurrectRF++;
        } else {
            CurrectRF = MaxRF;
        }
    }

    // Убавление частоты (канала)
    public void NextDownRF() {
        if (CurrectRF > MinRF) {
            CurrectRF--;
        } else {
            CurrectRF = MinRF;
        }

    }

    //Изменение частоты(канала)
    public int getCurrectRF() {
        return CurrectRF;
    }

    public void setCurrectRF(int newCurrectRF) {
        if (newCurrectRF > MaxRF) {
            return;
        }
        if (newCurrectRF < MinRF) {
            return;
        }
        CurrectRF = newCurrectRF;
    }
}