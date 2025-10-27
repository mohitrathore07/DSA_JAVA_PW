package TwoDimensionalArray;

/*
public class DSA05_WaveForm {
    public static void main(String[] args) {
        int[][] arr = {{1, 2,3}, {4,5,6}, {7, 8,9}};
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            if(i%2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else {
                for (int j = n-1; j >=0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
*/

// spiral form

public class DSA05_WaveForm {
    public static void main(String[] args) {
        int[][] arr = {{1, 2,3,5}, {4,5,6,7}, {7, 8,9,4}, {7, 8,9,4}};
        int m = arr.length;
        int n = arr[0].length;
        int minr = 0, maxr = m-1;
        int minc = 0, maxc = n-1;

        while (minr<=maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                System.out.println(arr[minr][j]+" ");
            } minr++;
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i <= maxr; i++) {
                System.out.println(arr[i][maxc]+" ");
            } maxc--;
            if(minr>maxr || minc>maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.println(arr[maxr][j]+" ");
            } maxr--;
            if(minr>maxr || minc>maxc) break;
            for (int i = maxr; i>= minr; i--) {
                System.out.println(arr[i][minc]+" ");
            } minc++;
        }
    }
}