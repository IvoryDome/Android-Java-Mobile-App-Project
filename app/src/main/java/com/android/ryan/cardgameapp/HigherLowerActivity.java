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
        player = new Player();
        computer = new Player();
        deck = new Deck();
        game = new Game(player, computer, deck);
        game.createDeck();
        game.dealCardsForHigherLower();
        String playerCard1 = player.showCard1ToString();
        String playerCard2 = player.showCard2ToString();
        assignPlayerCard1Image(playerCard1);
        assignPlayerCard2Image(playerCard2);
        String computerCard1 = computer.showCard1ToString();
        String computerCard2 = computer.showCard2ToString();
        assignComputerCard1Image(computerCard1);
        assignComputerCard2Image(computerCard2);
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

    public void assignPlayerCard1Image(String card) {
        switch (card) {
            case "ACE of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.sa);
                break;
            case "TWO of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s2);
                break;
            case "THREE of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s3);
                break;
            case "FOUR of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s4);
                break;
            case "FIVE of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s5);
                break;
            case "SIX of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s6);
                break;
            case "SEVEN of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s7);
                break;
            case "EIGHT of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s8);
                break;
            case "NINE of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s9);
                break;
            case "TEN of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.s10);
                break;
            case "JACK of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.sj);
                break;
            case "QUEEN of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.sq);
                break;
            case "KING of SPADES":
                playerCard1ImageViewID.setImageResource(R.drawable.sk);
                break;
            case "ACE of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.da);
                break;
            case "TWO of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d2);
                break;
            case "THREE of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d3);
                break;
            case "FOUR of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d4);
                break;
            case "FIVE of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d5);
                break;
            case "SIX of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d6);
                break;
            case "SEVEN of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d7);
                break;
            case "EIGHT of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d8);
                break;
            case "NINE of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d9);
                break;
            case "TEN of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.d10);
                break;
            case "JACK of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.dj);
                break;
            case "QUEEN of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.dq);
                break;
            case "KING of DIAMONDS":
                playerCard1ImageViewID.setImageResource(R.drawable.dk);
                break;
            case "ACE of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.ca);
                break;
            case "TWO of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c2);
                break;
            case "THREE of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c3);
                break;
            case "FOUR of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c4);
                break;
            case "FIVE of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c5);
                break;
            case "SIX of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c6);
                break;
            case "SEVEN of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c7);
                break;
            case "EIGHT of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c8);
                break;
            case "NINE of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c9);
                break;
            case "TEN of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.c10);
                break;
            case "JACK of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.cj);
                break;
            case "QUEEN of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.cq);
                break;
            case "KING of CLUBS":
                playerCard1ImageViewID.setImageResource(R.drawable.ck);
                break;
            case "ACE of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.ha);
                break;
            case "TWO of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h2);
                break;
            case "THREE of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h3);
                break;
            case "FOUR of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h4);
                break;
            case "FIVE of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h5);
                break;
            case "SIX of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h6);
                break;
            case "SEVEN of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h7);
                break;
            case "EIGHT of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h8);
                break;
            case "NINE of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h9);
                break;
            case "TEN of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.h10);
                break;
            case "JACK of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.hj);
                break;
            case "QUEEN of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.hq);
                break;
            case "KING of HEARTS":
                playerCard1ImageViewID.setImageResource(R.drawable.hk);
                break;
        }
    }

    public void assignPlayerCard2Image(String card) {
        switch (card) {
            case "ACE of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.sa);
                break;
            case "TWO of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s2);
                break;
            case "THREE of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s3);
                break;
            case "FOUR of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s4);
                break;
            case "FIVE of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s5);
                break;
            case "SIX of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s6);
                break;
            case "SEVEN of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s7);
                break;
            case "EIGHT of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s8);
                break;
            case "NINE of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s9);
                break;
            case "TEN of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.s10);
                break;
            case "JACK of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.sj);
                break;
            case "QUEEN of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.sq);
                break;
            case "KING of SPADES":
                playerCard2ImageViewID.setImageResource(R.drawable.sk);
                break;
            case "ACE of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.da);
                break;
            case "TWO of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d2);
                break;
            case "THREE of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d3);
                break;
            case "FOUR of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d4);
                break;
            case "FIVE of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d5);
                break;
            case "SIX of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d6);
                break;
            case "SEVEN of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d7);
                break;
            case "EIGHT of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d8);
                break;
            case "NINE of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d9);
                break;
            case "TEN of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.d10);
                break;
            case "JACK of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.dj);
                break;
            case "QUEEN of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.dq);
                break;
            case "KING of DIAMONDS":
                playerCard2ImageViewID.setImageResource(R.drawable.dk);
                break;
            case "ACE of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.ca);
                break;
            case "TWO of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c2);
                break;
            case "THREE of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c3);
                break;
            case "FOUR of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c4);
                break;
            case "FIVE of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c5);
                break;
            case "SIX of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c6);
                break;
            case "SEVEN of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c7);
                break;
            case "EIGHT of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c8);
                break;
            case "NINE of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c9);
                break;
            case "TEN of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.c10);
                break;
            case "JACK of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.cj);
                break;
            case "QUEEN of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.cq);
                break;
            case "KING of CLUBS":
                playerCard2ImageViewID.setImageResource(R.drawable.ck);
                break;
            case "ACE of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.ha);
                break;
            case "TWO of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h2);
                break;
            case "THREE of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h3);
                break;
            case "FOUR of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h4);
                break;
            case "FIVE of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h5);
                break;
            case "SIX of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h6);
                break;
            case "SEVEN of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h7);
                break;
            case "EIGHT of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h8);
                break;
            case "NINE of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h9);
                break;
            case "TEN of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.h10);
                break;
            case "JACK of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.hj);
                break;
            case "QUEEN of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.hq);
                break;
            case "KING of HEARTS":
                playerCard2ImageViewID.setImageResource(R.drawable.hk);
                break;
        }
    }

    public void assignComputerCard1Image(String card) {
        switch (card) {
            case "ACE of SPADES":
               computersCard1ImageViewID.setImageResource(R.drawable.sa);
                break;
            case "TWO of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s2);
                break;
            case "THREE of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s3);
                break;
            case "FOUR of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s4);
                break;
            case "FIVE of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s5);
                break;
            case "SIX of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s6);
                break;
            case "SEVEN of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s7);
                break;
            case "EIGHT of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s8);
                break;
            case "NINE of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s9);
                break;
            case "TEN of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.s10);
                break;
            case "JACK of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.sj);
                break;
            case "QUEEN of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.sq);
                break;
            case "KING of SPADES":
                computersCard1ImageViewID.setImageResource(R.drawable.sk);
                break;
            case "ACE of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.da);
                break;
            case "TWO of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d2);
                break;
            case "THREE of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d3);
                break;
            case "FOUR of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d4);
                break;
            case "FIVE of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d5);
                break;
            case "SIX of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d6);
                break;
            case "SEVEN of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d7);
                break;
            case "EIGHT of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d8);
                break;
            case "NINE of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d9);
                break;
            case "TEN of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.d10);
                break;
            case "JACK of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.dj);
                break;
            case "QUEEN of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.dq);
                break;
            case "KING of DIAMONDS":
                computersCard1ImageViewID.setImageResource(R.drawable.dk);
                break;
            case "ACE of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.ca);
                break;
            case "TWO of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c2);
                break;
            case "THREE of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c3);
                break;
            case "FOUR of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c4);
                break;
            case "FIVE of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c5);
                break;
            case "SIX of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c6);
                break;
            case "SEVEN of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c7);
                break;
            case "EIGHT of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c8);
                break;
            case "NINE of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c9);
                break;
            case "TEN of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.c10);
                break;
            case "JACK of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.cj);
                break;
            case "QUEEN of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.cq);
                break;
            case "KING of CLUBS":
                computersCard1ImageViewID.setImageResource(R.drawable.ck);
                break;
            case "ACE of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.ha);
                break;
            case "TWO of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h2);
                break;
            case "THREE of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h3);
                break;
            case "FOUR of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h4);
                break;
            case "FIVE of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h5);
                break;
            case "SIX of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h6);
                break;
            case "SEVEN of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h7);
                break;
            case "EIGHT of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h8);
                break;
            case "NINE of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h9);
                break;
            case "TEN of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.h10);
                break;
            case "JACK of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.hj);
                break;
            case "QUEEN of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.hq);
                break;
            case "KING of HEARTS":
                computersCard1ImageViewID.setImageResource(R.drawable.hk);
                break;
        }
    }

    public void assignComputerCard2Image(String card) {
        switch (card) {
            case "ACE of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.sa);
                break;
            case "TWO of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s2);
                break;
            case "THREE of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s3);
                break;
            case "FOUR of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s4);
                break;
            case "FIVE of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s5);
                break;
            case "SIX of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s6);
                break;
            case "SEVEN of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s7);
                break;
            case "EIGHT of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s8);
                break;
            case "NINE of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s9);
                break;
            case "TEN of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.s10);
                break;
            case "JACK of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.sj);
                break;
            case "QUEEN of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.sq);
                break;
            case "KING of SPADES":
                computersCard2ImageViewID.setImageResource(R.drawable.sk);
                break;
            case "ACE of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.da);
                break;
            case "TWO of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d2);
                break;
            case "THREE of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d3);
                break;
            case "FOUR of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d4);
                break;
            case "FIVE of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d5);
                break;
            case "SIX of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d6);
                break;
            case "SEVEN of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d7);
                break;
            case "EIGHT of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d8);
                break;
            case "NINE of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d9);
                break;
            case "TEN of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.d10);
                break;
            case "JACK of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.dj);
                break;
            case "QUEEN of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.dq);
                break;
            case "KING of DIAMONDS":
                computersCard2ImageViewID.setImageResource(R.drawable.dk);
                break;
            case "ACE of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.ca);
                break;
            case "TWO of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c2);
                break;
            case "THREE of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c3);
                break;
            case "FOUR of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c4);
                break;
            case "FIVE of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c5);
                break;
            case "SIX of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c6);
                break;
            case "SEVEN of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c7);
                break;
            case "EIGHT of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c8);
                break;
            case "NINE of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c9);
                break;
            case "TEN of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.c10);
                break;
            case "JACK of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.cj);
                break;
            case "QUEEN of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.cq);
                break;
            case "KING of CLUBS":
                computersCard2ImageViewID.setImageResource(R.drawable.ck);
                break;
            case "ACE of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.ha);
                break;
            case "TWO of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h2);
                break;
            case "THREE of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h3);
                break;
            case "FOUR of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h4);
                break;
            case "FIVE of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h5);
                break;
            case "SIX of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h6);
                break;
            case "SEVEN of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h7);
                break;
            case "EIGHT of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h8);
                break;
            case "NINE of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h9);
                break;
            case "TEN of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.h10);
                break;
            case "JACK of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.hj);
                break;
            case "QUEEN of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.hq);
                break;
            case "KING of HEARTS":
                computersCard2ImageViewID.setImageResource(R.drawable.hk);
                break;
        }
    }


}
