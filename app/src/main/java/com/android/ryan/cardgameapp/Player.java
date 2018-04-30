package com.android.ryan.cardgameapp;

import java.util.ArrayList;

    import java.util.ArrayList;

    public class Player {

        private ArrayList<Card> hand;

        public Player(){
            hand = new ArrayList<>();
        }

        public int handCount(){
            return hand.size();
        }

        public void storeCard(Card card){
            hand.add(card);
        }

        public void dropHand(){
            hand.clear();
        }

        public int totalValue(){
            int total = 0;

            for (Card card:hand) {
                total += card.getRankValue();
            }

            return total;
        }

        public ArrayList<Card> getHand() {
            return hand;
        }

        public String showHandToString(){
            Card card1 = getHand().get(0);
            Card card2 = getHand().get(1);
            return card1.getCardToString() + ", " + card2.getCardToString();
        }

    }

