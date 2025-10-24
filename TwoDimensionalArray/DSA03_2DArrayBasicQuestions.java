package TwoDimensionalArray;

/*

public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{4, 6, 78}, {8, 52, 5}, {2, 6,2}};
        int mx = Integer.MIN_VALUE;

        for (int[] b : arr) {
            for (int ele: b) {
                mx = Math.max(ele, mx);
            }
        }

        System.out.println(mx);
    }
}
 */

/*

public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{4, 6, 78}, {8, 52, 5}, {2, 6,2}};
        int sum = 0;

        for (int[] b : arr) {
            for (int ele: b) {
                sum+= ele;
            }
        }

        System.out.println(sum);
    }
}
 */

/*

public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{1, 9, 2}, {3, 7, 4}, {8, 5,6}};
        int[][] arr2 = {{9, 3, 7}, {8, 6, 5}, {2, 4,1}};
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < m;i++) {
            for(int j = 0; j < n; j++) {
                arr2[i][j] = arr2[i][j] + arr[i][j];
            }
        }

        for (int[] b: arr2) {
            for (int ele: b) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
 */

/*

// transpose of a matrix
public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{1, 9, 2}, {3, 7, 4}, {8, 5,6}};
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < n;i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
 */

/*
public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{1, 9}, {3, 7}, {8, 5}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[n][m];

        for(int i = 0; i < n;i++) {
            for(int j = 0; j < m; j++) {
                    res[i][j] = arr[j][i];
            }
        }
        for (int[] b: res) {
            for (int ele: b) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
*/

// transpose with copy
public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{1, 9,7}, {3, 7,2}, {8, 5,3}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[n][m];

        for(int i = 0; i < n;i++) {
            for(int j = 0; j < m; j++) {
                if(i == j) continue;
                if(i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for (int[] b: arr) {
            for (int ele: b) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

// transpose with copy - method 2
/*
public class DSA03_2DArrayBasicQuestions {
    public static void main(String[] args) {
        int[][] arr = {{1, 9,7}, {3, 7,2}, {8, 5,3}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[n][m];

        for(int i = 0; i < n;i++) {
            for(int j = 0; j <= i; j++) {
                if(i == j) continue;

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;

            }
        }
        for (int[] b: arr) {
            for (int ele: b) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}*/