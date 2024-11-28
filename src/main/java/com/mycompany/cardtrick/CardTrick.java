/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joede
 * @author jareb mathew
 * @author jarmath
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the suit of your card (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        int cardMatch = 0;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardMatch++;
            }
        }
       String magicCards = "";
        for (Card c: magicHand) {
            magicCards += (c.getValue() + " of " + c.getSuit() + " | ");
        }
        if (cardMatch > 0) {
            System.out.println("Your card was found " + cardMatch + " time(s) in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }
        System.out.println("The cards were " + magicCards);
        
    }
}
