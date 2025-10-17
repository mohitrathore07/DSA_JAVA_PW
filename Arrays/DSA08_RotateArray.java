package arrays;


/* 
public class DSA08_RotateArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int k = 2;
        int[] newArr = new int[arr.length];
        
        int i = k, j = 0;
        while (i < arr.length) {
            newArr[j] = arr[i];
            j++;
            i++;
        }
        
        while (j < arr.length) {
            newArr[j] =  arr[k-1];
            j++;
            k--;
        }
        for(int ele: newArr) {
            System.out.println(ele+" ");
        }
    }
}
*/

/*

public class DSA08_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % (arr.length);
        while (k > 0 ) {
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            k--;
        }
        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}

*/

/// optimized way

public class DSA08_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        k = k % (arr.length);
        reverseAnArray(arr, 0, n-k-1);
        reverseAnArray(arr, n-k, arr.length-1);
        reverseAnArray(arr, 0, arr.length-1);

        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }

    public static void reverseAnArray(int[] arr, int i , int j) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
