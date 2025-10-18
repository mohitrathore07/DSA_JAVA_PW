package arrays;

/* way - 1
public class DSA09_SortAraayZeroAndOnes {

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0,1,0,0,0,1};
        int n = arr.length;
        int noOfZeros = 0, noOfOnes = 0;

        for(int i = 0; i < n;i++) {
            if(arr[i] == 0) {
                noOfZeros++;
            }
            else noOfOnes++;
        }

        for(int i = 0; i < n;i++) {
            if (noOfZeros > 0) {
                arr[i] = 0;
                noOfZeros--;
            } else {
                arr[i] = 1;
            }
        }

        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}
*/

/*
// way 2 of sorting 0's and 1's
public  class DSA09_SortAraayZeroAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0,1,0,0,0,1};
        int n = arr.length;
        int i = 0, j=0;

        while (j < n) {
            if(arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}

*/


// 3rd way

public class DSA09_SortAraayZeroAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0};
        int n = arr.length;
        int i = 0 , j = n-1;

        while (i < j) {
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele: arr) {
            System.out.println(ele+" ");
        }
    }
}


