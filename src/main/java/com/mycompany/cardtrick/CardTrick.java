/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @modifier Prahalad Prasanna , Student ID : 991781145
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
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
        
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a card value (Note : 1- Ace, 11 - Jack , 12 - Queen , 13 - King): ");
        int userValue = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Enter card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine();
        
        
        // Search magicHand to see if they picked one of the cards from that hand
        
         boolean found = false; 
            for (Card card : magicHand) { 
                if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) { 
                     found = true; 
                     break; 
            }
        }
        // Report if the card was found or not.
        
         if (found) {
            System.out.println("Your card is in the magic hand!"); 
        } else { 
            System.out.println("Your card is not in the magic hand."); 
        }
    }
}
