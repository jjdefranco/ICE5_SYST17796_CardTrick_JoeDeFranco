
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 *
 * @author joede
 */


import  java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);            //c.setValue(insert call to random number generator here)
            
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a card!\n");
        System.out.print("Enter a value (1-13): \n");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter a suit (Hearts, Diamonds, Clubs, Spades): \n");
        String userSuit = scanner.nextLine();

   
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean cardFound = false;
        for (Card c : magicHand) {
            if (c.equals(userCard)) {
                cardFound = true;
                break;
            }
        }


        if (cardFound) {
            System.out.println("Your card was found in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }

   
        System.out.println("Magic Hand cards:");
        for (Card c : magicHand) {
            System.out.println(c);
        }
    }
  }
