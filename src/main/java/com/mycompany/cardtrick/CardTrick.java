/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @author camila esguerra 991746278 8:47:00 PM
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        // TODO:
        Scanner scanner = new Scanner(System.in);
        
        //insert code to ask the user for Card value and suit, create their card.
        System.out.println("Enter the value of your card (1 to 13):");
        int userValue = scanner.nextInt();
        System.out.println("Enter the suit of your card (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades):");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand to see if they picked one of the cards from that hand
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }
        // Report if the card was found or not
        if (cardFound) {
            System.out.println("Your card was found in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }
    }
}

