/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 */
//Name: Hoang Ngoc Tram Nguyen- StudentID: 991695204
public class CardTrick {

    public static void main(String[] args) {
       // Array to hold 7 cards
        Card[] magicHand = new Card[7];
        Random random = new Random();

        // Define suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Fill the magicHand array with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Values from 1 to 13
            c.setSuit(suits[random.nextInt(4)]); // Random suit from the suits array
            magicHand[i] = c;
        }

        // Prompt user for card value and suit
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a card value (1 to 13): ");
        int userValue = scanner.nextInt();

        System.out.println("Pick a suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search for the user's card in the magicHand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report if the card was found or not
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

        scanner.close();
    }
}