package TwoDimensionalArray;

// rotate the matrix by 90 degrees clockwise

public class DSA04_RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2,3,3}, {4,5,6,6}, {7, 8,9,9}, {7, 8,9,9}};
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


        for (int i = 0; i < m; i++ ) {
            int a = 0 , b = m-1;
            while (a < b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
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
