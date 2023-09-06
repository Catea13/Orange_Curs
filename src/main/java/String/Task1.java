package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //reverse of the String
        Scanner word=new Scanner(System.in);
        System.out.println("Enter word");
        StringBuilder enteredWord= new StringBuilder(word.nextLine());
        enteredWord.reverse();
        System.out.println(enteredWord);

    }
}
