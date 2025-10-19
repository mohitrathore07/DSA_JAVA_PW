package arrays;


// Dutch flag algo

public class DSA10_SortAraayZeroAndOnesAndTwos {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int low = 0, mid = 0, high = arr.length-1;

        while (mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}
