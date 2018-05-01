package com.android.ryan.cardgameapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class BlackJackActivity extends AppCompatActivity {

    private Button stickButtonID;
    private Button twistButtonID;
    private Button playAgainButtonID;
//    private TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack);
    }
}
