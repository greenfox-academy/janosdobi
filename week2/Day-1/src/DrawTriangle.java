// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int multiplier = input.nextInt();

        for (int i = 1; i <= multiplier; i++) {
            for(int j = 1; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("*");
        }
    }
}

