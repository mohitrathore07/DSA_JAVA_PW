package Sorting;

/*
public class DSA03_InsertionSort {
    public static void swap(int arr[], int i , int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int arr[] ) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,2,8,6,4,1};
        int n = arr.length;

        for(int i=1;i<arr.length;i++) { // n-1 passes
            for (int j=i;j>=1;j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j-1 , j);
                }
            }
        }

        print(arr);
    }
}

 */

public class DSA03_InsertionSort {
    public static void swap(int arr[], int i , int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int arr[] ) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,2,8,6,4,1};
        int n = arr.length;

        for(int i=1;i<arr.length;i++) { // n-1 passes
            int j = i;
            while (j>=1 && arr[j] < arr[j-1]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
        print(arr);
    }
}
