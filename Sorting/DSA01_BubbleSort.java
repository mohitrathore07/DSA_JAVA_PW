package Sorting;

// bubble sort - 1
/*
public class DSA01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,8,6,4,1};
        int n = arr.length;

        for(int x=0; x<n-1;x++) {
            for (int i=0;i<n-1;i++) {
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}
*/

/*
// Bubble Sort - 2
public class DSA01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,8,6,4,1};
        int n = arr.length;

        for(int x=0; x<n-1;x++) {
            for (int i=0;i<n-1-x;i++) {
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}
*/

/*

// Bubble Sort - 3
public class DSA01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,8,6,4,1};
        int n = arr.length;

        for(int x=0; x<n-1;x++) {
            boolean flag = true;
            for (int i=0;i<n-1-x;i++) {
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;
        }

        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}
*/

// Bubble sort questions
//Modify the Bubble Sort program to sort the array in descending order.


public class DSA01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,8,6,4,1};
        int n = arr.length;
        int swaps = 0;
        for(int x=0;x<n-1;x++) {
            for(int i=0;i<n-1-x;i++) {
                if(arr[i] < arr[i+1]) {
                    swaps++;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
