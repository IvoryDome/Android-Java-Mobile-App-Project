package com.android.ryan.cardgameapp;

public class BlackJackGame {


    Player player;
    Deck deck;

    public BlackJackGame(Player player, Deck deck) {
        this.player = player;
        this.deck = deck;
    }

    public void dealStartCardsForBlackjack(){
        for (int i = 0; i < 2 ; i++) {
            player.storeCard(deck.getCard());
        }
    }

    public void dealCard(){
        player.storeCard(deck.getCard());
    }

    public String playBlackJack(){
        int total = 0;
        String showTotal = null;
        if (total <= 21){
            showTotal = "Your current total: " + total;
        }
        else{
            showTotal = "Your current total: " + total + ", you have busted!";}
        return showTotal;
    }
}
