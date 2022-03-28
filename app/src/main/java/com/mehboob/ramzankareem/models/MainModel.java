package com.mehboob.ramzankareem.models;

public class MainModel {
    int images;
    String title;

    public MainModel(String title,int images){
        this.title=title;
        this.images=images;
    }
    public int getImages(){

        return images;
    }
    public void setImages(int images){
        this.images=images;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
}
