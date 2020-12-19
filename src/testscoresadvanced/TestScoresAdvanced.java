/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscoresadvanced;

import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 4
 * Date:  10/16/2020
 * Description: Create a program that calculates the average of user input test scores. 
 * Purpose: Practice using classes, getters/setters, and instantiating objects.
 */
public class TestScoresAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TestScores t = new TestScores();
        
        double userScore1;
        double userScore2;
        double userScore3;
        
        System.out.println("Please enter score #1: ");
        userScore1 = keyboard.nextDouble();
        
        System.out.println("Please enter score #2: ");
        userScore2 = keyboard.nextDouble();
        
        System.out.println("Please enter score #3: ");
        userScore3 = keyboard.nextDouble();
        
        t.setScore1(userScore1);
        t.setScore2(userScore2);
        t.setScore3(userScore3);
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.2f", t.getScore1(), t.getScore2(), t.getScore3(), t.calculateAverage());
        
    }   
}
