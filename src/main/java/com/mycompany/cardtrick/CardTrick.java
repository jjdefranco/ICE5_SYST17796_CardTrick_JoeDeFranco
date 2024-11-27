/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MohamedAlYAfei
 * 991755932
 * 
 * 
 * @author joede
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
            int value = rand.nextInt(13)+1;
            String suit = Card.SUITS[rand.nextInt(4)];
            c.setValue(value);
            c.setSuit(suit);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter a suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.next();
        
          Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        
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
            System.out.println("Your card was in the magic hand!");
        } else {
            System.out.println("Your card was NOT in the magic hand.");
        }
    }
}