package com.example.poster.mvpdemoproject.presenter.impl;


import com.example.poster.mvpdemoproject.MainModel;
import com.example.poster.mvpdemoproject.presenter.Presenter;
import com.example.poster.mvpdemoproject.view.MainView;

/**
 * Created by POSTER on 12.07.2017.
 */

public class PresenterImpl implements Presenter{
    private MainModel mainModel;
    private MainView mainView;

    public PresenterImpl(MainView mainView) {
        this.mainModel = new MainModel();
        this.mainView = mainView;
    }

    @Override
    public void buttonPress(String s) {
        mainModel.setItem(s);
        mainView.showResult(mainModel.getItem());
    }
}
