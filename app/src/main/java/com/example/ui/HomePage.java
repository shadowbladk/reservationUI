package com.example.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    private CardView restCard, movCard, coworkingCard, incomingCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        getSupportActionBar().hide();
        restCard = (CardView) findViewById(R.id.restCard);
        movCard = (CardView) findViewById(R.id.movCard);
        coworkingCard = (CardView) findViewById(R.id.coworkingCard);
        incomingCard = (CardView) findViewById(R.id.incomingCard);

        restCard.setOnClickListener(this);
        movCard.setOnClickListener(this);
        coworkingCard.setOnClickListener(this);
        incomingCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}