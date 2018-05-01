package com.android.ryan.cardgameapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HigherLowerActivity extends AppCompatActivity {

    private Button startGameButtonID;
    private TextView instructionsTextViewID;
    private TextView resultTextViewID;
    private TextView handShowerTextViewID;
    private Game game;
    private Player player;
    private Player computer;
    private Deck deck;
    private ConstraintLayout constraintLayoutID;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higher_lower);
        startGameButtonID = findViewById(R.id.startGameButtonID);
        handShowerTextViewID = findViewById(R.id.handShowerTextViewID);
        resultTextViewID = findViewById(R.id.resultTextViewID);
        instructionsTextViewID = findViewById(R.id.instructionsTextViewID);
        constraintLayoutID = findViewById(R.id.constraintLayoutID);
    }


    public void onPlayButtonClicked(View button){
        int color = 0;
        player = new Player();
        computer = new Player();
        deck = new Deck();
        game = new Game(player, computer, deck);
        game.createDeck();
        game.dealCardsForHigherLower();
        String result = game.determineWinnerHL();
        handShowerTextViewID.setText("Player hand: " + player.showHandToString() + "\nComputer hand: " + computer.showHandToString());
        resultTextViewID.setText(result);
        startGameButtonID.setText("Play again");
        if (result == "You have won!") {
             color = Color.parseColor("#009102");
        }
        else if(result == "The computer wins!"){
             color = Color.parseColor("#ff0000");
        }
        else{
             color = Color.parseColor("#0217ff");
        }
        constraintLayoutID.setBackgroundColor(color);
    }











}
