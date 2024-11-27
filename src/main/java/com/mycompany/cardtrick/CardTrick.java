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
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        final int HAND_SIZE = 7;
        Card[] magicHand = new Card[HAND_SIZE];
        Random rand = new Random();

        // Fill the magicHand with random cards
        for (int i = 0; i < HAND_SIZE; i++) {
            Card card = new Card();
            card.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            card.setValue(rand.nextInt(13) + 1); // Values 1 to 13
            magicHand[i] = card;
        }

        // Display the magic hand for debugging
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        // Ask user to pick a card
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPick a card!");
        System.out.print("Enter the value of the card (1-13): ");
        int userValue = scanner.nextInt();

        scanner.nextLine(); // Consume newline
        System.out.print("Enter the suit of the card (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine();

        // Check if the card is in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        scanner.close();
    }
}
