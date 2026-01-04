package Sorting;

public class DSA06_Questions {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,40,30,20,10};
        int n = arr.length;
        int lo = 1, hi = n - 2;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                System.out.println(mid);
                break;


            } else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                lo = mid+1;
            } else{
                hi = mid  - 1;
            }
        }
    }
}
