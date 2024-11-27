/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 *
 * @author jean h
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            int value = rand.nextInt(13) + 2;  
            String suit = Card.SUITS[rand.nextInt(Card.SUITS.length)];
            magicHand[i] = new Card(value, suit);
        }
        
        System.out.println("The magic hand consists of the following cards:");
        for (Card card : magicHand) {
            System.out.println(card);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card value (2-10, Jack=11, Queen=12, King=13, Ace=14): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter the card suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();
        
        Card userCard = new Card(userValue, userSuit);

        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }
        
        if (cardFound) {
            System.out.println("Congratulations! The card was found in the magic hand.");
        } else {
            System.out.println("Sorry, the card was not found in the magic hand.");
        }

        scanner.close();
    }
}
}
