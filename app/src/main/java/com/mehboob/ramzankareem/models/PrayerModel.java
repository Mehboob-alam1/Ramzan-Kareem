package com.mehboob.ramzankareem.models;

public class PrayerModel {
    String prayer,sunat1,farz,sunat2,nafal1,viter,nafal2;

    public PrayerModel(String prayer, String sunat1, String farz, String sunat2, String nafal1, String viter, String nafal2) {
        this.prayer = prayer;
        this.sunat1 = sunat1;
        this.farz = farz;
        this.sunat2 = sunat2;
        this.nafal1 = nafal1;
        this.viter = viter;
        this.nafal2 = nafal2;
    }

    public String getPrayer() {
        return prayer;
    }

    public void setPrayer(String prayer) {
        this.prayer = prayer;
    }

    public String getSunat1() {
        return sunat1;
    }

    public void setSunat1(String sunat1) {
        this.sunat1 = sunat1;
    }

    public String getFarz() {
        return farz;
    }

    public void setFarz(String farz) {
        this.farz = farz;
    }

    public String getSunat2() {
        return sunat2;
    }

    public void setSunat2(String sunat2) {
        this.sunat2 = sunat2;
    }

    public String getNafal1() {
        return nafal1;
    }

    public void setNafal1(String nafal1) {
        this.nafal1 = nafal1;
    }

    public String getViter() {
        return viter;
    }

    public void setViter(String viter) {
        this.viter = viter;
    }

    public String getNafal2() {
        return nafal2;
    }

    public void setNafal2(String nafal2) {
        this.nafal2 = nafal2;
    }
}
