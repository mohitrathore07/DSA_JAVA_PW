package Arrays;

import java.util.Arrays;

public class DSA16_MaxMinArrangee {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = new int[arr.length];

        int i = 0, j = arr.length-1, k = 0;
        while (i < j) {
            newArr[k++]= arr[j--];
            newArr[k++]= arr[i++];
        }

        System.out.println(Arrays.toString(newArr));
    }
}
