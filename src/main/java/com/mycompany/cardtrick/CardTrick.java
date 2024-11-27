/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 *
 * @author joede
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        // TODO:
        Random rand = new Random();
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1); //random value between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); //random suit from 0 to 3
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of your card (1 to 13):");
        int userValue = scanner.nextInt();
        System.out.println("Enter the suit of your card (0 for Hearts, 1 for Diamonds, 2 for Clubs, 3 for Spades):");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
    }
}
