package Conditions;

import java.util.Arrays;

public class Task2 {
    //Calculate average
    public static void main(String[] args) {
        int[] arr = {1, 4, 60};
        int suma = Arrays.stream(arr).sum();
        int average = suma / arr.length;
        System.out.println(average);
    }

}
