package com.example.poster.mvpdemoproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.poster.mvpdemoproject.presenter.Presenter;
import com.example.poster.mvpdemoproject.presenter.impl.PresenterImpl;
import com.example.poster.mvpdemoproject.view.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView{
    @BindView(R.id.textResult) TextView textResult;
    @BindView(R.id.listView) ListView listView;

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (presenter == null){
            presenter = new PresenterImpl(this);
        }

        listView.setAdapter(new ListAdapter(this));
    }

    @Override
    public void showResult(String text) {
        textResult.setText(text);
    }

    @Override
    public void showAlertDialog() {
        //?
    }

    //ссилка на презентер
    public Presenter getPresenter(){
        return presenter;
    }
}
