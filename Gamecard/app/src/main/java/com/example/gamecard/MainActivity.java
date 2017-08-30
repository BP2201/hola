package com.example.gamecard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by Bryan.Pineda01 on 8/29/2017.
 */

public class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ImageRequester imageRequester = ImageRequester.getInstance(this);

        NetworkImageView headerImage = (NetworkImageView) findViewById(R.id.networkimage);
        imageRequester.setImageFromUrl(headerImage,"https://firebasestorage.googleapis.com/v0/b/test1-5b9a7.appspot.com/o/logo.png?alt=media&token=d0c7ee80-e190-4e4a-9164-38f40e78ce0a" );

    }
}
