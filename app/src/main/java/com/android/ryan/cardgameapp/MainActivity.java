package com.android.ryan.cardgameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button highLowSelectButtonID;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        highLowSelectButtonID = findViewById(R.id.highLowSelectButtonID);
    }


    public void onHighLowSelectButtonClicked(View button){
        Intent intent = new Intent(this, HigherLowerActivity.class);
        startActivity(intent);
    }


}
