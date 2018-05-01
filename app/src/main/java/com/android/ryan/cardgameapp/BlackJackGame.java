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
        String showTotal = null;
        if (player.totalValue() <= 21){
            showTotal = "Your current total: " + player.totalValue();
        }
        else{
            showTotal = "Your current total: " + player.totalValue() + ", you have busted!";}
        return showTotal;
    }
}
