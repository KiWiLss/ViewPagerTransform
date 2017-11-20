package com.magicsoft.wave;

import android.app.Application;
import android.content.Context;

/**
 * Created by 刘少帅 on 2017/11/14
 */

public class App extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext(){
        return mContext;
    }
}
