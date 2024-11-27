/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 *
 * @author MarioLjoljic
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        // TODO:

        //insert code to ask the user for Card value and suit, create their card.       DONE
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        for (Card card:magicHand){
            System.out.println(card);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter card value(1 to 13):");
        int userValue=scanner.nextInt();
        System.out.println("enter card suit(0=hearts,1=diamonds,2=clubs,3=spades): ");
        int suitIndex=scanner.nextInt();
        String userSuit=Card.SUITS[suitIndex];
        Card userCard=new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        //search magic hand to see if they picked the card
        boolean found = false;
        for (Card card:magicHand){
            if(card.getValue()==userCard.getValue() &&card.getSuit().equals(userCard.getSuit())){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("your card was in the hand");
        }
        else{
            System.out.println("your card was not in the hand");
        }
    }
}
