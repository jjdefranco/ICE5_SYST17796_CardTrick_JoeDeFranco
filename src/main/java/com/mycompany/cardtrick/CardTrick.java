/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @author claire yao 991596735 modified date: 2024-11-26
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
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
        System.out.println("Enter the value of the card (1-13): ");
        int userValue = scanner.nextInt();
        
        System.out.println("Enter the suit of the card (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // Search magicHand to see if they picked one of the cards from that hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        System.out.println("Cards in the magic hand:");
        for (Card c : magicHand) {
            System.out.println("Value: " + c.getValue() + ", Suit: " + c.getSuit());
        }
        
        // Report if the card was found or not.
        if (found) {
            System.out.println("Card was found in magic hand!");
        } else {
            System.out.println("Card was not found in magic hand.");
        }
        scanner.close();
    }
}
