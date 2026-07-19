package Arrays;

public class DSA14_KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        while(k > 0) {
            int idx = -1;
            int currMax = Integer.MIN_VALUE;

            for(int i = 0; i < nums.length;i++) {
                if(nums[i] > currMax) {
                    currMax = nums[i];
                    idx = i;
                }
            }
            nums[idx] = Integer.MIN_VALUE;
            max = currMax;
            k--;
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums  = {3,2,1,5,6,4};
        int k = 2;
        int ans = findKthLargest(nums, k);
        System.out.println(ans);
    }
}
