package com.magicsoft.wave;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by 刘少帅 on 2017/11/14
 */

public class App extends Application {

    private static Context mContext;

    /**
     * 当前Acitity个数
     */
    private int activityAount = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

        registerActivityLifecycleCallbacks(alc);

    }

    public static Context getContext(){
        return mContext;
    }

    public static boolean isForeground;
    /**
     * Activity 生命周期监听，用于监控app前后台状态切换
     */
    ActivityLifecycleCallbacks alc=new ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(Activity activity, Bundle bundle) {

        }

        @Override
        public void onActivityStarted(Activity activity) {
            if (activityAount == 0) {
                //app回到前台
                isForeground = true;
            }
            activityAount++;
        }

        @Override
        public void onActivityResumed(Activity activity) {

        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {
            activityAount--;
            if (activityAount == 0) {
                isForeground = false;
            }
        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {

        }
    };
}
