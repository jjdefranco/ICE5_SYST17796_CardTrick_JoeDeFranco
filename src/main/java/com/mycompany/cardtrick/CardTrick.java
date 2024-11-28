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
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);

            magicHand[i] = c;
        }

        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        System.out.print("enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("enter the suit of your card (hearts, diamonds, spades, clubs): ");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand to see if they picked one of the cards from that hand
        boolean Found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userCard.getValue() && c.getSuit().equals(userCard.getSuit())) {
                Found = true;
                break;
            }
        }

    // Report if the card was found or not.
        if(Found){
            System.out.println("the card was in hand");
        }else{
            System.out.println("inccorrect, the selected card was not in hand");
        }
    }
}
