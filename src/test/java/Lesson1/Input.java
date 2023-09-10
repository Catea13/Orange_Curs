package Lesson1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner name =new Scanner(System.in);
        System.out.println("What you name?");
        String myName=name.nextLine();
        System.out.println(myName);
    }
}
