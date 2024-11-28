/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @Modifier - Awais Shahid - 991731808
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Random randNumGenerator = new Random();
        Scanner input  = new Scanner(System.in);
        
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            int randNumCard = (randNumGenerator.nextInt(13)) + 1;
            int randNumSuit = (randNumGenerator.nextInt(4));
            
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(randNumCard);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randNumSuit]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        
        System.out.println("Enter a Card Value from 1-13: ");
        int card  = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter a Suit Rank from 0-3: ");
        String suitRank = input.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(card);
        userCard.setSuit(suitRank);
        
        boolean cardIsFound = false;
        
        for (Card c : magicHand) {
        
            if (c.getValue() == userCard.getValue() && c.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardIsFound = true;
                break;
            }
        }
        
         // Now we will check if the cards matched or not after completing the loop

        if (cardIsFound == true){
            System.out.println("Card Matches!!!");
        }
        
        else {
            System.out.println("Card does not Match");
        }
        
        
    }
}
