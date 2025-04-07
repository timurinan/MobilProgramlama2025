package com.example.uygulama2;

public class Hesap {

    private String hesaptürü,hesapsahibi;
    private double bakiye;

    public Hesap(String hesaptürü, String hesapsahibi, double bakiye) {
        this.hesaptürü = hesaptürü;
        this.hesapsahibi = hesapsahibi;
        this.bakiye = bakiye;
    }

    public String getHesaptürü() {
        return hesaptürü;
    }

    public void setHesaptürü(String hesaptürü) {
        this.hesaptürü = hesaptürü;
    }

    public String getHesapsahibi() {
        return hesapsahibi;
    }

    public void setHesapsahibi(String hesapsahibi) {
        this.hesapsahibi = hesapsahibi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
