package com.example.gamecard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by Bryan.Pineda01 on 8/29/2017.
 */

public class LoadingActivity extends AppCompatActivity{

    public static FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(LoadingActivity.this);
        Bundle bundle = new Bundle();
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, bundle);

        Intent intent = new Intent(LoadingActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
