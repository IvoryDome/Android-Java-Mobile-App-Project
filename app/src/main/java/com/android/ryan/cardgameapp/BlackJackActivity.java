package com.android.ryan.cardgameapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BlackJackActivity extends AppCompatActivity {


    private Player player;
    private Deck deck;
    private BlackJackGame blackjackGame;
    private Button stickButtonID;
    private Button twistButtonID;
    private Button playAgainButtonID;
    private TextView scoreTextViewID;
    private ImageView card1ImageViewID;
    private ImageView card2ImageViewID;
    private ImageView card3ImageViewID;
    private ImageView card4ImageViewID;
    private ImageView card5ImageViewID;
    private ImageView card6ImageViewID;
    private ImageView card7ImageViewID;
    private CardImageShower cardImageShower;
    private int currentCard;
    private ConstraintLayout constraintLayoutID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_black_jack);
        player = new Player();
        deck = new Deck();
        blackjackGame = new BlackJackGame(player, deck);
        cardImageShower = new CardImageShower();
        blackjackGame.createDeck();
        blackjackGame.dealStartCardsForBlackjack();
        stickButtonID = findViewById(R.id.stickButtonID);
        twistButtonID = findViewById(R.id.twistButtonID);
        playAgainButtonID = findViewById(R.id.playAgainButtonID);
        scoreTextViewID = findViewById(R.id.scoreTextViewID);
        card1ImageViewID = findViewById(R.id.card1ImageViewID);
        card2ImageViewID = findViewById(R.id.card2ImageViewID);
        card3ImageViewID = findViewById(R.id.card3ImageViewID);
        card4ImageViewID = findViewById(R.id.card4ImageViewID);
        card5ImageViewID = findViewById(R.id.card5ImageViewID);
        card6ImageViewID = findViewById(R.id.card6ImageViewID);
        card7ImageViewID = findViewById(R.id.card7ImageViewID);
        String playerCard1 = player.showCardToString(0);
        String playerCard2 = player.showCardToString(1);
        cardImageShower.assignCardImage(playerCard1, card1ImageViewID);
        cardImageShower.assignCardImage(playerCard2, card2ImageViewID);
        scoreTextViewID.setText("Your current score: " + player.totalBlackjackValue());
        currentCard = 1;
        constraintLayoutID = findViewById(R.id.constraintLayoutID);
    }


    public void onTwistButtonClicked(View button){
        currentCard++;
        blackjackGame.dealCard();
        String result = blackjackGame.playBlackJack();
        scoreTextViewID.setText(result);
        if(blackjackGame.gameFinished == true){
            playAgainButtonID.setVisibility(View.VISIBLE);
        }
        if(currentCard == 2){
            String playerCard3 = player.showCardToString(2);
            cardImageShower.assignCardImage(playerCard3, card3ImageViewID);
        }
        else if(currentCard == 3){
            String playerCard4 = player.showCardToString(3);
            cardImageShower.assignCardImage(playerCard4, card3ImageViewID);
        }
        else if(currentCard == 4){
            String playerCard5 = player.showCardToString(4);
            cardImageShower.assignCardImage(playerCard5, card5ImageViewID);
        }        if(currentCard == 5){
            String playerCard6 = player.showCardToString(5);
            cardImageShower.assignCardImage(playerCard6, card6ImageViewID);
        }
        if (player.totalBlackjackValue() > 21) {
            int color = Color.parseColor("#ff0000");
            constraintLayoutID.setBackgroundColor(color);
        }
    }

    public void onStickButtonClicked(View button){
        blackjackGame.finishGame();
        String result = blackjackGame.playBlackJack();
        scoreTextViewID.setText(result);
        playAgainButtonID.setVisibility(View.VISIBLE);
    }

    public void onPlayAgainButtonClicked(View button){
        this.recreate();
    }







}
