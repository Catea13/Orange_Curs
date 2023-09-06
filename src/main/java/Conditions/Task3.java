package Conditions;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Find the second largest element
        int[] arr = {1, 9, 17, 55, 69, 3, 0};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);

    }
}