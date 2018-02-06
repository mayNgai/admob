package com.example.admob.integrateadmob;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by may on 2/6/2018.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}
