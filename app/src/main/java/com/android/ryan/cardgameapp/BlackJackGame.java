package com.android.ryan.cardgameapp;

import android.graphics.Color;

public class BlackJackGame {


    Player player;
    Deck deck;
    boolean gameFinished;

    public BlackJackGame(Player player, Deck deck) {
        this.player = player;
        this.deck = deck;
        gameFinished = false;
    }

    public void createDeck(){
        deck = new Deck();
    }

    public void dealStartCardsForBlackjack() {
        for (int i = 0; i < 2; i++) {
            player.storeCard(deck.getCard());
        }
    }

    public void dealCard() {
        if (player.totalBlackjackValue() <= 21 && !gameFinished) {
            player.storeCard(deck.getCard());
        }
    }

    public void finishGame(){
        gameFinished = true;
    }

    public String playBlackJack() {
        String showTotal;
        if (player.totalBlackjackValue() < 21 && !gameFinished) {
            showTotal = "Your current score: " + player.totalBlackjackValue();
        }
        else if(player.totalBlackjackValue() == 21){
            showTotal = "Congratulations, you scored 21!";
            finishGame();
        }
        else if(player.totalBlackjackValue() > 21){
            finishGame();
            showTotal = "Your current score: " + player.totalBlackjackValue() + ", you have busted!";
        }
        else{
            showTotal = "Your final score is " + player.totalBlackjackValue();
        }
        return showTotal;

    }


}

