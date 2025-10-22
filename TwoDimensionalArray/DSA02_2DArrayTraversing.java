package TwoDimensionalArray;

/*

public class DSA02_2DArrayTraversing {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] b : a) {
            for (int ele: b) {
                System.out.println(ele);
            }
        }
    }
}
 */


// question  store roll number and marks obtained by 4 students side by side in a matrix


import java.util.Scanner;

public class DSA02_2DArrayTraversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][2];

        for(int i = 0; i < 4;i++) {
            for (int j = 0; j < 2; j++) {
                students[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(students[i][j]+" -->");
            }
            System.out.println();
        }
    }
}