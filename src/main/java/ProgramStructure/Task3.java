package ProgramStructure;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /**user to enter any integer from 1 to 10 in the console, and we want the program
         to display the number that the user entered.*/
        Scanner nr = new Scanner(System.in);
        System.out.println("Enter any integer from 1 to 10");
        int number = nr.nextInt();
        if (number > 10 || number < 1) {
            System.out.println("Please enter any integer from 1 to 10");
        } else {
            System.out.println(number);

        }
    }
}

