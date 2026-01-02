package Sorting;
/*

class Solution {
    public static void swap(int arr[], int i , int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int majorityElement(int[] nums) {
        for(int i=1;i<nums.length;i++) {
            int j = i;
            while(j >= 1 && nums[j] < nums[j-1]) {
                swap(nums, j, j-1);
                j--;
            }
        }
    return nums[nums.length/2];
    }

}
 */

/*
not a leetcode but a good question
let say we have a array like this - 45,28,17,7,69,25,4
we have to change according to the element positon - 5 4 2 1 6 3 0

all numbers are > 0
 */

public class DSA99_Leetcode {
    public static void print(int arr[] ) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {45,28,17,7,69,25,4};
        int x = 0;

        for(int i=0;i<arr.length;i++) {
            int minEle = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] < minEle && arr[j] > 0) {
                    minEle = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        for(int i = 0; i<arr.length;i++) {
            arr[i] *= (-1);
        }
        print(arr);
    }
}
