/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 *
 * @author joede
 */

import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
       
          Scanner scanN = new Scanner(System.in);
          Scanner scanS = new Scanner(System.in);
          int numChoice;
          String suitChoice;
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13) + 0);
            c.setSuit(Card.SUITS[(int)(Math.random()* 3) + 0]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        
        Card userCard = new Card(); 
        
        System.out.println("Enter a choice for number");
        numChoice = scanN.nextInt();
        
        System.out.println("Enter a suit");
        suitChoice = scanS.next();
        
        userCard.setSuit(suitChoice);
        userCard.setValue(numChoice);
        
        for (Card card: magicHand){
            
            if(card.equals(userCard)){
                System.out.println("Card was found!");
                break;
            }
            else{
                System.out.println("Card not found.");
            }
            
        }
    }
}
