/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author joede
 * @author DrooAC
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        Card userCard = new Card();
        
        boolean found = false;
        int cardValue = 0;
        int cardSuit = 0;
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        System.out.println("Enter a Card Value (numeric 1-13 please I have no error checking)!!");
        cardValue = input.nextInt();
        System.out.println("Enter a Card Suit (numeric 0-3 please I have no error checking)!!");
        cardSuit = input.nextInt();
        
        userCard.setValue(cardValue);
        userCard.setSuit(Card.SUITS[cardSuit]);
        
        System.out.printf("Your Card: %s of %s.\n", userCard.getValue(), userCard.getSuit());
        System.out.println();
        
        for (int i = 0; i < magicHand.length; i++) {
            System.out.printf("Card %d: %s of %s.\n", i + 1, magicHand[i].getValue(), magicHand[i].getSuit());
            System.out.println();
            if (userCard.getValue() == magicHand[i].getValue() && 
                userCard.getSuit().equals(magicHand[i].getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulation! You found a matching card!");
        } else {
            System.out.println("Not congratulation! You did not find a matching card!");
        }
    }
}
