/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.*; 
import java.util.Scanner;
/**
 *
 * @author joede
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int num = (int) (Math.random() * 13) + 1;  // random number 1-13 
            c.setValue(num);
            //System.out.println(num);
            
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);  // random number 0 - 3 
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + magicHand[i].getValue());
        }
        
       
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        Scanner scanner = new Scanner(System.in); 
          
        System.out.println("Enter the suit (Hearts, Diamonds, Spades, Clubs):");
        String userSuit = scanner.nextLine();
        System.out.println("Enter the value (1-13):");
        int userValue = scanner.nextInt();

        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);

        
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getSuit().equals(userCard.getSuit()) && c.getValue() == userCard.getValue()) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Yes you have the card");
        } else {
            System.out.println("No, the card is not found. ");
        }

        scanner.close();
        
        
    }
}
