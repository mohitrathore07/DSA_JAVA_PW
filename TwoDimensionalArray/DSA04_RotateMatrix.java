package TwoDimensionalArray;

// rotate the matrix by 90 degrees clockwise

public class DSA04_RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 9,7}, {3, 7,2}, {8, 5,3}};
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == j) continue;

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

        for (int [] ele: arr) {
            for(int element: ele) {
                System.out.print(element+" ");
            }
            System.out.println();

        }
    }
}
