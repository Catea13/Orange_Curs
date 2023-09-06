package String;

import java.util.Arrays;

public class Task4 {
    //average of the 3 nr
    public static void main(String[] args) {
        int[] arr = {71, 89, 60};
        average(arr);
    }

    public static void average(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
