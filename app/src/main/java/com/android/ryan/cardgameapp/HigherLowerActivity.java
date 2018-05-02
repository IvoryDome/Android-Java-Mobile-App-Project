package com.android.ryan.cardgameapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
    private ImageView playerCard1ImageViewID;
    private ImageView playerCard2ImageViewID;
    private ImageView computersCard1ImageViewID;
    private ImageView computersCard2ImageViewID;
    private CardImageShower cardImageShower;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higher_lower);
        startGameButtonID = findViewById(R.id.startGameButtonID);
        handShowerTextViewID = findViewById(R.id.handShowerTextViewID);
        resultTextViewID = findViewById(R.id.resultTextViewID);
        instructionsTextViewID = findViewById(R.id.instructionsTextViewID);
        constraintLayoutID = findViewById(R.id.constraintLayoutID);
        playerCard1ImageViewID = findViewById(R.id.playerCard1ImageViewID);
        playerCard2ImageViewID = findViewById(R.id.playerCard2ImageViewID);
        computersCard1ImageViewID = findViewById(R.id.computersCard1ImageViewID);
        computersCard2ImageViewID = findViewById(R.id.computersCard2ImageViewID);

    }


    public void onPlayButtonClicked(View button) {
        int color = 0;
        cardImageShower = new CardImageShower();
        player = new Player();
        computer = new Player();
        deck = new Deck();
        game = new Game(player, computer, deck);
        game.createDeck();
        game.dealCardsForHigherLower();
        String playerCard1 = player.showCardToString(0);
        String playerCard2 = player.showCardToString(1);
        cardImageShower.assignCardImage(playerCard1, playerCard1ImageViewID);
        cardImageShower.assignCardImage(playerCard2, playerCard2ImageViewID);
        String computerCard1 = computer.showCardToString(0);
        String computerCard2 = computer.showCardToString(1);
        cardImageShower.assignCardImage(computerCard1, computersCard1ImageViewID);
        cardImageShower.assignCardImage(computerCard2, computersCard2ImageViewID);
        String result = game.determineWinnerHL();
        handShowerTextViewID.setText("Player hand: " + player.showHandToString() + "\nComputer hand: " + computer.showHandToString());
        resultTextViewID.setText(result);
        startGameButtonID.setText("Play again");
        if (result == "You have won!") {
            color = Color.parseColor("#009102");
        } else if (result == "The computer wins!") {
            color = Color.parseColor("#ff0000");
        } else {
            color = Color.parseColor("#0217ff");
        }
        constraintLayoutID.setBackgroundColor(color);
    }

}
