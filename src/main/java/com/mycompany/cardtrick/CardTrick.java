/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @author Sienna Truong - 991735541
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(12) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        System.out.print("Enter your card value: ");
        String value = scanner.nextLine();
        System.out.print("Enter your card suit: ");
        String suit = scanner.nextLine();
        System.out.println();

        boolean cardFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == Integer.parseInt(value) && c.getSuit().equals(suit)) {
                System.out.println("Found your card! " + c.getValue() + " of " + c.getSuit());
                cardFound = true;
                break;
            }
        }

        if (!cardFound) {
            String cardList = "";
            for (Card c : magicHand) {
                cardList += (c.getValue() + " of " + c.getSuit() + " | ");
            }
            System.out.println("Your card cannot be found. Good luck next time!");
            System.out.println("The shuffled cards were: " + cardList);
        }
    }
}
