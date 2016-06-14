package com.example.beginnerprogrammersslowmotion;

import com.firebase.client.Firebase;

/**
 * Created by Philip on 6/12/2016.
 */
public class BeginnerProgrammersSlowMotion2 extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
