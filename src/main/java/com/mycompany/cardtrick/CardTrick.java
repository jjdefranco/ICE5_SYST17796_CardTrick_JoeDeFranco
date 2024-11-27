package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 * CardTrick.java Author: Joe Defranco Modified by: Ben Mathies, 991728151 Date:
 * 2024-11-26
 */
/**
 *
 * @author joede
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        // TODO:
        // Fill in magicHand with 7 random cards
        Random random = new Random();
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from SUITS array
            magicHand[i] = c;
        }

        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the card (1 to 13): ");
        int userValue = scanner.nextInt();

        System.out.println("Enter the suit of the card (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;

        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue()
                    && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }

    }
}
