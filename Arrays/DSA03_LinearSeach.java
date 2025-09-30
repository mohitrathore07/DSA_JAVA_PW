/*
 package Arrays;
import java.util.Scanner;

public class DSA03_LinearSeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int target = 5;

        for(int i = 0; i < 5;i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean flag = false;
        for(int i = 0; i < 5;i++) {
            if(arr[i] == target) {
                flag = true;
                System.out.println("element found at: "+i);
                break;
            }
        }

        if(!flag) {
                System.out.println("element not found"); 
        }
    }
}

 */

  package Arrays;
import java.util.Scanner;

public class DSA03_LinearSeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {29,28,27,21,22,23};
        
        int mx = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            mx = Math.max(arr[i], mx);
        }
    
        int mx2 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] != mx) mx2 = Math.max(arr[i], mx2);
        }

        System.out.println("max is: "+mx+" ");
        System.out.println("max 2 is: "+mx2);
    }
}
