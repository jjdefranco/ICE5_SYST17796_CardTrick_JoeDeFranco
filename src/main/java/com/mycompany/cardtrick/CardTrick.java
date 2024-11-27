/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Scanner;

import java.util.Random;
/**
 *
 * @author joede
 *@modified Caleb Bettencourt
 * @student_number 991719766
 * @date 2024-11-26
 */
public class CardTrick {

    public static void main(String[] args) {
        Random random = new Random();
        Card[] magicHand = new Card[7];
        
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("pick a suit (Hearts, Diamonds, Spades, or Clubs): ");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit()
                    .equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        if (found) 
        {
            System.out.println("nice work. Card is in the magic hand.");
        } else 
        {
            System.out.println("Unfortunately, card is not in the magic hand.");
        }

    }   
}
