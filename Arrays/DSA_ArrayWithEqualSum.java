package Arrays;

public class DSA_ArrayWithEqualSum {
    public  static  boolean arrayEqualSum(int[] arr) {
        for(int i = 0; i < arr.length;i++) {
            int j = 0, k = i, pSum = 0, lSum = 0;

            while (j < i ) pSum+=arr[j++];

            while (k < arr.length) lSum+=arr[k++];

            if(pSum == lSum) return  true;
        }
        return  false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arrayEqualSum(arr));
    }
}
