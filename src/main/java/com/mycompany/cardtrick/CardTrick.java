/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 * CardTrick.java
 * Author: Eric Bertero
 * Student Number: 991723977
 *
 * This program models a hand of seven random cards and allows the user
 * to pick a card, checking if it exists in the hand.
 */
import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {
        Random random = new Random();
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            int value = random.nextInt(13) + 1; // Values 1 to 13
            String suit = suits[random.nextInt(4)];
            magicHand[i] = new Card(value, suit);
        }

        // Prompt the user to pick a card
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();

        // Search the magic hand
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                cardFound = true;
                break;
            }
        }

        // Display the result
        if (cardFound) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}

class Card {
    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}

