package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        double regularSandwich = 5.45;
        double largeSandwich = 8.95;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the SandwichShop!\n What type Sandwich do you want?");
        System.out.println("1) Regular - $5.45\n2) Large - $8.95");
        int sandwichChoice = keyboard.nextInt();
        if (sandwichChoice == 1) {
            System.out.println("That will be one Regular Sandwich! for $" + regularSandwich + ".");
            System.out.println("You may qualify for a discount!\n");
        }

    }
}
