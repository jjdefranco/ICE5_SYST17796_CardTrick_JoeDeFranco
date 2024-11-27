/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jacob Cruz
// * Student number: 991690855
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
         
        // TODO:
        // Fill in magicHand with 7 random cards
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13));
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        
        
        Scanner sc = new Scanner(System.in);
        Card userCard = new Card();
        System.out.println("Enter value");
        userCard.setValue(sc.nextInt());
        System.out.println("Enter suit");
        userCard.setSuit(sc.next());
        for (int i=0; i<magicHand.length; i++){
            if(magicHand[i].getValue()==userCard.getValue()||magicHand[i].getSuit().equals(userCard.getSuit())){System.out.println("Card found");}
            if(magicHand[i].getValue()!=userCard.getValue()&&magicHand[i].getSuit().equals(userCard.getSuit())==false){System.out.println("Card not found");}
        }
        

        
        
    }
}
