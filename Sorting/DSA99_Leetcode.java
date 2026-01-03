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

/*


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int lo , hi;
        int fp = -1; lo = 0;hi = nums.length-1;

        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) {
                if(mid>0 && nums[mid] == nums[mid-1]) hi = mid - 1;
                else {
                    fp = mid;
                    break;
                }
            }
            else if(nums[mid] < target) lo = mid + 1;
            else if(nums[mid] > target) hi = mid - 1;
        }
        int lp = -1; lo = 0; hi = nums.length-1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) {
                if(mid+1<(nums.length) && nums[mid] == nums[mid+1]) lo = mid + 1;
                else {
                    lp = mid;
                    break;
                }
            }
            else if(nums[mid] < target) lo = mid + 1;
            else if(nums[mid] > target) hi = mid - 1;
        }
        ans[0] = fp; ans[1] = lp;
        return ans;
    }
}
 */

/*
search in rotated array leetcode - M - 1
class Solution {
    public static int binSearch(int[] nums, int target, int lo , int hi) {
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) {
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        if(n <= 3) {
            for(int i = 0; i<n;i++) {
                if(nums[i] == target) return i;
            }
            return -1;
        }


        int lo = 1, hi=n-2;
        int pivot = -1;
        while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                pivot=mid;
                break;
            }
            else if(nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]) {
                pivot=mid-1;
                break;
            }
            else if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) {
                if(nums[mid] > nums[n-1]) lo = mid+1;
                else hi = mid - 1;
            }
        }
        if(pivot == -1) return binSearch(nums , target, 0, n-1);
        int left = binSearch(nums,target,0,pivot);
        if(left != -1) return left;
        int right = binSearch(nums,target,pivot+1,n-1);
        return right;
    }
}
 */

//search in rotated array leetcode - M - 2
/*

class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;
       int lo = 0, hi = n-1;

       while(lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] <= nums[hi]) { // right sorterd part me hai
                if(target > nums[mid] && target <= nums[hi]) lo = mid+1;
                else hi = mid-1;
            }
            else {
                if(target >= nums[lo] && target < nums[mid]) hi = mid-1;
                else lo = mid+1;
            }
       }
       return -1;
    }
}
 */