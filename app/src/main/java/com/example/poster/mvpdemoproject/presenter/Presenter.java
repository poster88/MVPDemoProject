package com.example.poster.mvpdemoproject.presenter;

import android.content.Context;

/**
 * Created by POSTER on 12.07.2017.
 */

public interface Presenter {
    void buttonPress(String s);
    void shutLoadTextInView(String text, Context context);
}
