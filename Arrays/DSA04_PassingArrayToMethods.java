package Arrays;


/*

public class DSA04_PassingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }    
    public static void change(int[] arr) {
        arr[0] = 4;  // original value will get modified
        }
        }

*/

/*
 
// sort the array
import java.util.Arrays;

public class DSA04_PassingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = {22,1,7,4,5};
        Arrays.sort(arr);

        for(int ele: arr) {
            System.out.println(ele + " ");
        }
    }    
    
}

*/
 
// shallow copy 
public class DSA04_PassingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = {22,1,7,4,5};
        for(int ele: arr) {
            System.out.println(ele + " ");
        }
        System.out.println();
        
        int[] nums = arr;  // it will create shallow copy means - iske changes original me bhi reflect hoge
        nums[0] = 4;
        System.out.println(arr[0]);
        
        arr[1] = 55;
        System.out.println(nums[1]);

    }    
}


/*
 
// deep copy 
import java.util.Arrays;

public class DSA04_PassingArrayToMethods {
    public static void main(String[] args) {
        int arr[] = {22,1,7,4,5};
        
        /*
        
        int brr[] = Arrays.copyOf(arr,arr.length); // it will create deep copy
        brr[0] = 4;
        System.out.println(arr[0]);
        /
        
        // way - 2 - creating deep copy
        int brr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        
        brr[0] = 4;
        System.out.println(arr[0]);
    }    
    
}
*/