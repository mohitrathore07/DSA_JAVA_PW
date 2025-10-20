package arrays;

/*

next greatest method - 1
public class DSA12_NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        for (int i = 0; i < n-1;i++) {
            int maxEle = Integer.MIN_VALUE;
            int j = i+1;
            while (j < n) {
                if(arr[j] >= maxEle) maxEle = arr[j];
                j++;
            }
            ans[i] = maxEle;
        }
        for(int ele: ans) {
            System.out.println(ele+" ");
        }
    }
}

*/

public class DSA12_NextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int[] ans = new int[n];
        int maxEle = -1;
        for(int i = n-1; i >= 0;i--) {
            ans[i] = maxEle;
            if(arr[i] > maxEle) maxEle = arr[i];
        }

        for(int ele: ans) {
            System.out.println(ele+" ");
        }
    }
}
