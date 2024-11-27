package com.mycompany.cardtrick;
 
/* 
 * Modified by: Ujjwal Koirala (Student Number: 991738145)
 * Date: 2024-11-26
 * @author joede
 */
public class Card {
    private String suit;
    private int value;

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}