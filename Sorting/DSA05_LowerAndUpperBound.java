package Sorting;
/*

public class DSA05_LowerAndUpperBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int lb = arr.length;
        int target = 40;
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if(arr[mid] >= target) {
                lb = Math.min(mid , lb);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(lb);
    }
}

*/

public class DSA05_LowerAndUpperBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int ub = arr.length;
        int target = 40;

        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if(arr[mid] > target) {
                ub = Math.min(mid , ub);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(ub);
    }
}
