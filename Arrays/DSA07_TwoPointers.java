package arrays;

/*

// reversing an array
public class DSA07_TwoPointers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        
        for(int i = 0; i < arr.length/2; i++) {
            int j = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}

*/

/*
// reversing an array - using two pointer method
public class DSA07_TwoPointers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int i = 0 , j = arr.length-1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
          for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}
*/


//  using two pointer method - simplified  way

public class DSA07_TwoPointers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int i = 0, j = arr.length-1;

        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
          for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }

    public static void swap(int[] arr, int i , int j) {
           int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}

