package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        double finalCost;
        double studentDiscount = 0.1;
        double seniorDiscount = 0.2;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the SandwichShop!\nWhat type Sandwich do you want?");
        System.out.println("1) Regular - $5.45\n2) Large - $8.95");
        int sandwichChoice = keyboard.nextInt();

        if (sandwichChoice == 1) {
            finalCost = regularSandwich;
            System.out.println("\nThat will be one Regular Sandwich for $" + regularSandwich + ".\n");
            System.out.print("You may qualify for a discount! Please enter your age: ");
            int userAge = keyboard.nextInt();

            if (userAge <= 17) {
                System.out.println("You are 17 years old or younger. You get a 10% discount!");
                finalCost = finalCost * (1 - studentDiscount);
                System.out.printf("\nYour total for today will be $%.2f. Cash or credit?", finalCost);
            }
            else if (userAge >= 65) {
                System.out.println("You are 65 years or older. You get a 20% discount!");
                finalCost = finalCost * (1 - seniorDiscount);
                System.out.printf("\nYour total for today will be $%.2f. Cash or credit?", finalCost);
            }
            else {
                System.out.println("No discount applicable...");
                System.out.printf("\nYour total for today will be $%.2f. Cash or credit?", finalCost);
            }
        }

        else {
            finalCost = largeSandwich;
            System.out.println("\nThat will be one Large Sandwich for $" + largeSandwich + ".\n");
            System.out.println("You may qualify for a discount! Please enter your age: ");
            int userAge = keyboard.nextInt();

            if (userAge <= 17) {
                System.out.println("You are 17 years old or younger. You get a 10% discount!");
                finalCost = finalCost * (1 - studentDiscount);
                System.out.printf("\nYour total for today will be $%.2f. Cash or credit?", finalCost);
            }
            else if (userAge >= 65) {
                System.out.println("You are 65 years or older. You get a 20% discount!");
                finalCost = finalCost * (1 - seniorDiscount);
                System.out.printf("\nYour total for today will be $%.2f. Cash or credit?", finalCost);
            }
            else {
                System.out.println("No discount applicable...");
                System.out.printf("\nYour total for today will be $%.2f. Cash or credit?", finalCost);
            }
        }

    }
}
