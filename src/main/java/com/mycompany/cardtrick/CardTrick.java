/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @modifier Daniel Soesito - 991761818
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Random rand = new Random();
        
        Scanner myObj = new Scanner(System.in); 
        
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
        //insert code to ask the user for Card value and suit, create their card.
        System.out.println("Enter Card value (2-10): ");
        int value = myObj.nextInt();
        
        System.out.println("Enter Card suit (Hearts, Diamonds, Spades, Clubs): ");
        String suit = myObj.next();
        
        Card playerCard = new Card();
        playerCard.setValue(value);
        playerCard.setSuit(suit);
        
        // Search magicHand to see if they picked one of the cards from that hand
        String statement = "Card not in hand";
        
        for (Card card : magicHand) {
            if (card.getSuit().equals(playerCard.getSuit()) && card.getValue() == playerCard.getValue()) {
                statement = "Card found in hand!";
                break;
            }
        }
        
        // Report if the card was found or not.
        System.out.println(statement);
    }
}
