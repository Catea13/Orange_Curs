package String;

import java.util.Scanner;

public class Task5 {
    //Write a java method to compute the sum of digits in an integer
    public static void main(String[] args) {
        suma();
    }

    public static void suma() {
        Scanner nr = new Scanner(System.in);
        System.out.println("Input an integer");
        int input = nr.nextInt();
        int lastNr = input % 10;
        int firstNr = input / 10;
        int suma = lastNr + firstNr;
        System.out.println(suma);

    }
}
