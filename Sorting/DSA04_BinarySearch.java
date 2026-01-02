package Sorting;

public class DSA04_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {4,7,2,14,1,71,8,5};
        int target = 751;

        int lo = 0, hi = arr.length - 1;
        boolean flag  = false;
        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target) {
                flag = true;
                break;
            }
            else if(arr[mid] > target) {
                hi = mid - 1;
            }
            else if(arr[mid] < target) {
                lo = mid+1;
            }
        }
        if (flag) {
            System.out.println("element exists");
        }else {
            System.out.println("element doesn't exists");
        }
    }
}
