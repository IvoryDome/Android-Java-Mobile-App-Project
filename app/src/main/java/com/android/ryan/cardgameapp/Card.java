package com.android.ryan.cardgameapp;

public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }


    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }

    public int getRankValue(){
        return rank.getValue();
    }

    public int getBlackjackValue(){
        return rank.getBlackjackValue();
    }

    public String getCardToString(){
        return getRank().toString() + " of " + getSuit().toString();
    }

}
