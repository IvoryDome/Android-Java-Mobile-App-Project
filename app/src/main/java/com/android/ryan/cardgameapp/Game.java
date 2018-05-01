package com.android.ryan.cardgameapp;

import android.graphics.Color;

import java.util.ArrayList;

public class Game {

    Player player1;
    Player player2;
    Deck deck;

    public Game(Player player1, Player player2, Deck deck){
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
    }

    public void createDeck(){
        deck = new Deck();
    }

    public void dealCardsForHigherLower(){
        for (int i = 0; i < 2 ; i++) {
            player1.storeCard(deck.getCard());
        }
        for (int i = 0; i < 2 ; i++) {
            player2.storeCard(deck.getCard());
        }

    }

    public String determineWinnerHL(){
        if(player1.totalValue() > player2.totalValue()){
            return "You have won!";
        }
        else if(player1.totalValue() < player2.totalValue()){
            int color = Color.parseColor("#06990f");
            return "The computer wins!";
        }
        else {
            int color = Color.parseColor("#0217ff");
            return "It's a draw!";
        }
    }






}

