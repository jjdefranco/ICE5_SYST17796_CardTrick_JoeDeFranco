/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @contributor Steven Zhao 991745453
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random randValue = new Random();
        boolean cardThere = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randValue.nextInt(1,13));
            c.setSuit(Card.SUITS[randValue.nextInt(3)]);
            magicHand[i] = c;
            //System.out.println(c.getSuit()+ " --- " + c.getValue());
        }
        
        Scanner userIn = new Scanner(System.in);

        //insert code to ask the user for Card value and suit, create their card.
        System.out.println("Enter a card suit: ");
        String userSuit = userIn.nextLine();
        
        System.out.println("Enter a card value : ");
        int userValue = userIn.nextInt();
       
        //System.out.println(userValue + " --- " + userSuit);
        // Search magicHand to see if they picked one of the cards from that hand
        for(int i=0; i<magicHand.length; i++){
            if((magicHand[i].getSuit().compareToIgnoreCase(userSuit) == 0) && (magicHand[i].getValue() == userValue)){
                cardThere = true;
                break;
            }
        }
        
        // Report if the card was found or not.
        if(cardThere){
            System.out.println("Card is in the hand");
        }
        else{
            System.out.println("Card is not in the hand");
        }
    }
}
