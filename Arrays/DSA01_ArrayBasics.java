/* 
package Arrays;
public class DSA01_ArrayBasics {
    public static void main(String[] args) {
        // Declaration and Initialization of an array
        int[] numbers = new int[5]; // Array of size 5

        // Assigning values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Accessing and printing array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using enhanced for loop to iterate through the array
        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
*/

package Arrays;
import java.util.Scanner;

public class DSA01_ArrayBasics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        
        for(int i = 0; i < 5; i++) {
            System.out.println(numbers[i]+" ");
        }
    }
}