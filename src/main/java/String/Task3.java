package String;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {
    //Find the smallest number among three numbers
    public static void main(String[] args) {
        /**First way**/
//        Integer[] arr = {25, 37, 29};
//        int minValue = Collections.min(Arrays.asList(arr));
//        System.out.println(minValue);
        /** Second way**/
        Scanner nr1 = new Scanner(System.in);
        System.out.println("Number1");
        int number1 = nr1.nextInt();
        Scanner nr2 = new Scanner(System.in);
        System.out.println("Number2");
        int number2 = nr2.nextInt();
        Scanner nr3 = new Scanner(System.in);
        System.out.println("Number3");
        int number3 = nr3.nextInt();
        int array[] = {number1, number2, number3};
        System.out.println(Arrays.stream(array).min());


    }
}
