package com.android.ryan.cardgameapp;

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

    public void dealCards(){
        for (int i = 0; i < 2 ; i++) {
            player1.storeCard(deck.getCard());
        }
        for (int i = 0; i < 2 ; i++) {
            player2.storeCard(deck.getCard());
        }

    }

    public String determineWinner(){
        if(player1.totalValue() > player2.totalValue()){
            return "You have won!";
        }
        else if(player1.totalValue() < player2.totalValue()){
            return "The computer wins!";
        }
        else {
            return "It's a draw!";
        }
    }
}

