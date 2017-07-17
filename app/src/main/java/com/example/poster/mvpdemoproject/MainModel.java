package com.example.poster.mvpdemoproject;

/**
 * Created by POSTER on 12.07.2017.
 */

public class MainModel {
    private String item = "";
    private String title = "";

    public void setItem(String string){
        item = "Selected : " + string;
    }

    public String getItem() {
        return item;
    }

    public void setTitleToAlertDialog(String message){
        title = "Set title for item " + message + "?";
    }

    public String getTitleAlertDialog(){
        return title;
    }
}
