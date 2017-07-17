package com.example.poster.mvpdemoproject;

/**
 * Created by POSTER on 12.07.2017.
 */

public class MainModel {
    private String item = "";

    public void setItem(String string){
        item = "Selected : " + string;
    }

    public String getItem() {
        return item;
    }
}
