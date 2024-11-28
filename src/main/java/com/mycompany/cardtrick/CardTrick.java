/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Modifier: Ravleen Singh
 * Student Number: 991727519
 * Date: November 27, 2024
*/

package com.mycompany.cardtrick;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
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
             c.setValue(random.nextInt(13) + 1); // Random card value (1-13)
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit (0-3)
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i] = c;
        }
         System.out.println("Magic hand of cards:");
        for (Card card : magicHand) {
            System.out.println(card);
        }
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
         Scanner scanner = new Scanner(System.in);
           System.out.print("Enter the card value (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
         System.out.print("Enter the card suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
         if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}

        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.



