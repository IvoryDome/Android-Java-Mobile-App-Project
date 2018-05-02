package com.android.ryan.cardgameapp;

public enum RankType {

    ACE(1, 11),
    TWO(2, 2),
    THREE(3, 3),
    FOUR(4, 4),
    FIVE(5, 5),
    SIX(6, 6),
    SEVEN(7, 7),
    EIGHT(8, 8),
    NINE(9, 9),
    TEN(10, 10),
    JACK(11, 10),
    QUEEN(12, 10),
    KING(13, 10);

    private final int value;
    private final int blackjackValue;

    RankType(int value, int blackjackValue){
        this.value = value;
        this.blackjackValue = blackjackValue;
    }

    public int getValue(){
        return value;
    }

    public int getBlackjackValue(){
        return blackjackValue;
    }
}
