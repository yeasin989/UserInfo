package com.test.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.ads.Ads;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ads ads = new Ads();
        ads.sendValuesToServer(MainActivity.this, getPackageName(), "");

    }
}