/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessthenumber;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class GuessTheNumber {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int numberToGuess = rand.nextInt(100) + 1;
    int guess;
    int numberOfGuesses = 0;

    System.out.println("Welcome to the number guessing game from 1 to 100.");
    System.out.print("Please enter your guess: ");

    do {
      guess = input.nextInt();
      numberOfGuesses++;

      if (guess < numberToGuess) {
        System.out.print("The number you entered is lower than the required number. Please try again: ");
      } else if (guess > numberToGuess) {
        System.out.print("The number you entered is higher than the required number. Please try again: ");
      }
    } while (guess != numberToGuess);

    System.out.println("Congratulations! You guessed the number " + numberToGuess +" after " + numberOfGuesses +  " attempts.");
  }
}