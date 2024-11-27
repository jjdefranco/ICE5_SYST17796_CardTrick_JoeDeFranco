/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Scanner;


/**
 *Spencer Barnes
 * SID: 991728219
 * @author joede
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
    
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13));
            c.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            magicHand[i] = c;
        }
        
      
        
//     for debugging  
//        for (int i=0; i<magicHand.length; i++)
//        {
//            System.out.println("The card is " + magicHand[i].getValue()+" of "+magicHand[i].getSuit());
//        }

        Scanner input = new Scanner(System.in);
         System.out.println("Guess Value");
         Integer cValue = Integer.valueOf(input.nextLine());
         System.out.println("Guess Suit");
         String cSuit = input.nextLine();
         //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        for (int i=0; i<magicHand.length; i++)
        {
//            for debugging
//            System.out.println("The card is " + magicHand[i].getValue()+" of "+magicHand[i].getSuit());
            if (magicHand[i].getValue() == cValue && magicHand[i].getSuit().toUpperCase().equals(cSuit.toUpperCase()))
            {
                System.out.println("The card was found, it was card " + (i+1));
                break;
            }
            
        }
    }
}
