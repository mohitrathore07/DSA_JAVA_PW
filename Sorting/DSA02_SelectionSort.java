package Sorting;

public class DSA02_SelectionSort {
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

        for(int i=0;i<n-1;i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i;j<n;j++) {
                if(arr[j]<min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            swap(arr,mindx,i);
        }
        print(arr);
    }
}
