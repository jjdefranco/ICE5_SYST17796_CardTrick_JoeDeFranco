/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @author Jeff Pollock / pollocje
 * 991440611
 */

public class CardTrick {
    public static void main(String[] args) {
        // Create an array to hold 7 cards
        Card[] magicHand = new Card[7];
        
        // Random number generator
        Random random = new Random();
        
        // Fill magicHand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            // Create a new card with random value (1-13) and suit
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from the SUITS array
            magicHand[i] = c;
        }
        
        // Ask user to pick a card
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick any card (value 1-13, suit: Hearts, Diamonds, Spades, Clubs)");
        System.out.println("Enter card value (1-13):");
        int userValue = scanner.nextInt();
        
        System.out.println("Enter card suit:");
        String userSuit = scanner.next();
        
        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // Search for the card in magicHand
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && 
                card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }
        
        // Report result
        if (cardFound) {
            System.out.println("Wow, your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        
        // Close scanner to prevent resource leak
        scanner.close();
    }
}

