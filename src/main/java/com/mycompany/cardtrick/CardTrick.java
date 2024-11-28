/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author joede
 * @modifier SofyaBrazhytskaya
 * ID: 991759249
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        // TODO:
        Random hand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(hand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[hand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pick any card (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Pick the suit:Hearts, Diamonds, Spades, Clubs (0-3) ");
        int userSuitIndex = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuitIndex]);
        // Search magicHand to see if they picked one of the cards from that hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        // Report if the card was found or not.
        if (found) {
            System.out.println("You picked a card!");
        } else {
            System.out.println("Unfortunately, no card for you((");
        }
    }
}