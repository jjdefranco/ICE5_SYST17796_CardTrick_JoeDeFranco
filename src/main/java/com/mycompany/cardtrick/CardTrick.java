/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.cardtrick;
import java.util.Scanner;
/**
 *
 * @author joede
 * Modifier : Cham Kuen Chow
   Student number : 991749411
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        boolean isFound=false;
        // TODO:
        // Fill in magicHand with 7 random cards
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        
        // TODO:
        //insert code to ask the user for Card value and suit, create their card.
        // Search magicHand to see if they picked one of the cards from that hand
        // Report if the card was found or not.
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter value");
        int inputValue = myObj.nextInt();
        System.out.println("Enter suit");
        int inputSuit = myObj.nextInt();
        
        for (Card eachCard : magicHand) {
            if (eachCard.getSuit().equals(inputSuit) && eachCard.getValue() == inputValue) 
            {
                isFound=true;
            }
        }
        if (isFound) {
                System.out.println("It is found. Congraulation!");
            }else{
                System.out.println("Sorry. Try again.");
        }
        
    }
}
