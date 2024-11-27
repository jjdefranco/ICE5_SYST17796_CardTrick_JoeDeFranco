/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Scanner;   // import the scanner class

/**
 *
 * @author joede
 * Modifier: Dayoung Joo
 * Student number: 991771172
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
            
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        
        // Ask the user to choose a random card and 
        // tell the user what card it is
        int userC = getUserCard();
        Card userCard = setUserCard(userC);
        
        // Check if the card the user chose 
        // is inside the magicHand
        boolean cardExists = false;
        for (int i=0; i<magicHand.length; i++){
            if (userCard.equals(magicHand[i])) {
                cardExists = true;
            }
        }
        
        if (cardExists) {
            System.out.println("Your card is in the magic hand.");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
        
        // Prompts a user to enter a random value for the card
        public static int getUserCard() {
            // Create a scanner object
            Scanner s = new Scanner(System.in);
            // Prompt the user to enter a random variable between 1 to 52, 
            // which will represent a card
            System.out.println("Enter a value between 1 to 52: ");
            int userVal = s.nextInt();
            // Check if the input is between 1 to 52
            if (userVal > 52 || userVal < 1) {
                System.out.println("Invalid value. Please try again.");
                return getUserCard();
            }
            return userVal;
        }      
        
        // Set the card value that the user entered
        public static Card setUserCard(int i) {
            Card userCard = new Card();
            
            userCard.setValue(i % 13 + 1);
            userCard.setSuit(Card.SUITS[(int)(i / 13) - 1]);
            return userCard;
        }
    }

