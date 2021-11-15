package com.example.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_location_page);
        getSupportActionBar().setTitle("Choose ***"); // change name na
    }
}
