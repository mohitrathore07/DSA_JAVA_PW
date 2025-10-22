package TwoDimensionalArray;

/*

public class DSA01_2DArrayBasic {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 5;
        arr[0][1] = 3;
        arr[0][2] = 2;
        arr[1][0] = 1;
        arr[1][1] = 7;
        arr[1][2] = 9;
        arr[2][0] = 4;
        arr[2][1] = 8;
        arr[2][2] = 1;

        System.out.println(arr[0][0]);
    }
}
*/

import java.util.Scanner;

public class DSA01_2DArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        int no_of_rows = arr.length;
        int no_of_columns = arr[0].length;

        for(int i = 0; i < no_of_rows;i++) {
           for (int j = 0; j < no_of_columns; j++) {
               arr[i][j] = sc.nextInt();
           }
        }

        for(int i = 0; i < no_of_rows;i++) {
           for (int j = 0; j < no_of_columns; j++) {
               System.out.println(arr[i][j]+" ");
           }
               System.out.println();
        }
    }
}
