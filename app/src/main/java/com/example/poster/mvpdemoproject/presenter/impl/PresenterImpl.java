package com.example.poster.mvpdemoproject.presenter.impl;


import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

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

    @Override
    public void shutLoadTextInView(final String text, Context context) {
        //даємо дані для моделі(сховища)
        mainModel.setTitleToAlertDialog(text);

        //управляємо користувацьким інтерфейсом
        final AlertDialog.Builder ab = new AlertDialog.Builder(context);
        ab.setTitle("Message");
        ab.setMessage(mainModel.getTitleAlertDialog());
        ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mainView.showResult(text);
            }
        });

        ab.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ab.show();
    }
}
