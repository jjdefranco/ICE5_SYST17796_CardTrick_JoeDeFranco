/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Random;
import java.util.Scanner;

/**
 * CardTrick Class
 * Models a hand of seven cards with random values and suits, allows the user to guess a card,
 * and checks if the guessed card is in the "magic hand."
 * 
 * @author Author: Carlos Rebelo
 * Student Number: 991729616
 */

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        // Fill in magicHand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit (0 to 3 mapped to SUITS array)
            magicHand[i] = c;
        }
        
        // Display the randomly generated cards (for debugging or fun)
        System.out.println("The Magic Hand contains:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        // Ask the user for their card's value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPick a card! Enter the card value (1 to 13):");
        int userValue = scanner.nextInt();

        System.out.println("Enter the suit (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades):");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for the user's card in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report whether the user's card was found or not
        if (found) {
            System.out.println("\nYour card (" + userCard.getValue() + " of " + userCard.getSuit() + ") was found in the Magic Hand!");
        } else {
            System.out.println("\nSorry, your card (" + userCard.getValue() + " of " + userCard.getSuit() + ") was not found in the Magic Hand.");
        }
        
    }
}
