/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice_task_6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class RandomGuessWithExceptionHandling {

    public static void main(String[] args) {
         // Create Scanner and Random objects
        Scanner kb = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        // Variables
        int guess = 0;
        int attempts = 0;

        System.out.println("*".repeat(50));
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("*".repeat(50));
        System.out.println("Guess a number between 1 and 100.");
  
    }
}