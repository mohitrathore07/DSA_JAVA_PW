/*
package Arrays;

import java.util.Scanner;

public class DSA02_ArrayBasicQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter marks of students: ");
        for(int i = 0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("____________________________________ ");
        for(int i = 0; i < 5; i++) {
            if(arr[i] < 35) System.out.println(i+" ");
        }
    }
}
 */

// calculate the sum of all the elements
package Arrays;

import java.util.Scanner;

public class DSA02_ArrayBasicQuestions {
    public static void main(String[] args) {
        int[] arr = {14,12,4,6,3};
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("sum of the array is: "+sum);
    }
}
