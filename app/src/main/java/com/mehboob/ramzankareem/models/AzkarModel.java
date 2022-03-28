package com.mehboob.ramzankareem.models;

public class AzkarModel {
    String duaEngTitle,duaUrduTitle,dua,duaTranslation;

    public AzkarModel(String duaEngTitle, String duaUrduTitle, String dua, String duaTranslation) {
        this.duaEngTitle = duaEngTitle;
        this.duaUrduTitle = duaUrduTitle;
        this.dua = dua;
        this.duaTranslation = duaTranslation;
    }

    public String getDuaEngTitle() {
        return duaEngTitle;
    }

    public void setDuaEngTitle(String duaEngTitle) {
        this.duaEngTitle = duaEngTitle;
    }

    public String getDuaUrduTitle() {
        return duaUrduTitle;
    }

    public void setDuaUrduTitle(String duaUrduTitle) {
        this.duaUrduTitle = duaUrduTitle;
    }

    public String getDua() {
        return dua;
    }

    public void setDua(String dua) {
        this.dua = dua;
    }

    public String getDuaTranslation() {
        return duaTranslation;
    }

    public void setDuaTranslation(String duaTranslation) {
        this.duaTranslation = duaTranslation;
    }
}
