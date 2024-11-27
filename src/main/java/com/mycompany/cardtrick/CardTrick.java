/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @modifier Anita Kashani (991751686) - November 26, 2024

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
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Select a Card value between 1 to 13.");
        int cardNumber=scanner.nextInt();
        System.out.println("Select a Card suit of Hearts, Spades, Clubs, or Diamonds.");
        String cardSuit=scanner.next().trim();
        // Search magicHand to see if they picked one of the cards from that hand
        boolean cardFromDeck=false;
        for (Card card : magicHand){
            if (card.getValue() == cardNumber && card.getSuit().equalsIgnoreCase(cardSuit)){
        cardFromDeck=true;
        break;
        }
        }
        // Report if the card was found or not.
        if (cardFromDeck){
        System.out.println("Card in Deck");}
                else {
                        System.out.println("Card not in deck ");}}
    }

