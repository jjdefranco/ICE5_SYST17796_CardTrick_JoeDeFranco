/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardtrick;

/**
 *
 * @author joede
 */
import java.util.Scanner;
import java.util.Random;
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(Card.SUITS.length)]);
            magicHand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the value of your card (1-13: ");
        int userValue = scanner.nextInt();

        System.out.println("Enter suit: ");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        if (cardFound) {
            System.out.println("\nYour card is in the magic hand!");
        } else {
            System.out.println("\nYour card is not in the magic hand.");
        }
        scanner.close();
    }
}
