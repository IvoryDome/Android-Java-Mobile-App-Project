package com.android.ryan.cardgameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BlackJackActivity extends AppCompatActivity {

    private Button stickButtonID;
    private Button twistButtonID;
    private Button playAgainButtonID;
    private TextView scoreTextViewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack);
        stickButtonID = findViewById(R.id.stickButtonID);
        twistButtonID = findViewById(R.id.twistButtonID);
        playAgainButtonID = findViewById(R.id.playAgainButtonID);
        scoreTextViewID = findViewById(R.id.scoreTextViewID);
    }










}
