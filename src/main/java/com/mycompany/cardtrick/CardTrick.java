/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;


/**
 *
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
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
    }
}
