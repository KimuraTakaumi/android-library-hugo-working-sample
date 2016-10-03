package com.hatenablog.techium.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hatenablog.techium.samplelib.Module;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Module module = new Module();
        module.show("ログテスト");
    }
}
