package Conditions;

import java.util.Arrays;

public class Task1 {
    //Sum values of an array
    public static void main(String[] args) {
        int[]arr={1,38,70};
        System.out.println( Arrays.stream(arr).sum());
    }
}
