/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 */
// Name: Yao Yao
// StudentID:991673519
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
 
        // TODO:
        Random random = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1); 
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card value (1 to 13):");
            int userValue = scanner.nextInt();
        System.out.println("Pick a Suit(Hearts, Diamonds, Clubs, Spades):");
            String userSuit = scanner.next();
            
        Card userCard = new Card();
       userCard.setValue(userValue);
       userCard.setSuit(userSuit);
       
       boolean found = false;
       for(Card card:magicHand){
           if(card.getValue()==userCard.getValue()&&
                   card.getSuit().equalsIgnoreCase(userCard.getSuit())){
           found=true;
           break;
           }
       }
       
       if(found){
       System.out.println("Your card is in the magic hand!");}
       else{System.out.println("Your card is not in the magic hand.");}
        
       scanner.close();
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
    }
}
