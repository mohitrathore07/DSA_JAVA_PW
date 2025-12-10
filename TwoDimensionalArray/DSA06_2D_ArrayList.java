package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;
/*
public class DSA06_2D_ArrayList  {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4); arr.add(5); arr.add(6);

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(4); arr1.add(5);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4); arr2.add(5); arr2.add(6);

        List<Integer> arr3 = new ArrayList<>();
        arr3.add(4);

        List<Integer> arr4 = new ArrayList<>();
        arr4.add(4); arr4.add(6);

        List<List<Integer>> l = new ArrayList<>();

        l.add(arr1); l.add(arr2); l.add(arr3); l.add(arr4);
/*
        for (int i = 0; i < l.size();i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size();j++) {
                System.out.println(x.get(j)+" ");
            }
            System.out.println();
        }
 /
      // way 2 of printing
        for (int i = 0; i < l.size();i++) {

            for (int j = 0; j < l.get(i).size();j++) {
                System.out.println(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
*/

/*

leetcode 118
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows;i++) {
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                l.add(1);
            }
            ans.add(l);
        }
        for(int i = 2; i < numRows;i++) {
            for(int j = 1; j <=i-1; j++) {
                ans.get(i).set(j, ans.get(i-1).get(j)+ ans.get(i-1).get(j-1));
            }
        }
        return ans;
    }
}
 */
/*
2nd way above
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows;i++) {
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) l.add(1);
                else {
                    l.add(ans.get(i-1).get(j)+ ans.get(i-1).get(j-1));
                }
            }
            ans.add(l);
        }

        return ans;
    }
}
 */

/*

public class DSA06_2D_ArrayList {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 2, 1, 4}, {2, 1, 2, 4}, {1, 1, 1, 2}};
        if(a[0].length != b.length) {
            System.out.println("multiplication not possible");
        }
        else {
            int rows = a.length;
            int cols = b[0].length;

            int[][] c = new int[rows][cols];

            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    int ele = 0;
                    int k = 0;
                    while (k < b.length) {
                        ele += a[i][k] * b[k][j];
                        k++;
                    }
                    c[i][j] = ele;
                }
            }

            for (int[] m : c) {
                for (int element : m) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }
}

 */


/*

leetcode - 73. Set Matrix Zeroes


class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n  = matrix[0].length;
        int[][] helper = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                helper[i][j] = matrix[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(helper[i][j] == 0){
                    for(int a = 0; a < m; a++) {
                        matrix[a][j] = 0;
                    }
                    for(int b = 0; b < n; b++) {
                        matrix[i][b] = 0;
                    }
                }
            }
        }

    }
}
 */

/*

leetcode - 73. Set Matrix Zeroes = method - 2

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n  = matrix[0].length;
        boolean[] rowmat = new boolean[m];
        boolean[] colmat = new boolean[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rowmat[i] = true;
                    colmat[j] = true;
                }
            }
        }

        for(int a = 0; a < rowmat.length; a++) {
            if(rowmat[a] == true) {
                for(int j = 0;j < n;j++) {
                    matrix[a][j] = 0;
                }
            }
        }

        for(int b = 0; b < colmat.length; b++) {
            if(colmat[b] == true) {
                for(int i = 0;i < m;i++) {
                    matrix[i][b] = 0;
                }
            }
        }
    }
}
 */

/*

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length , n  = matrix[0].length;
        boolean row = false;
        boolean col = false;

        for(int j = 0; j < n; j++) {
            if(matrix[0][j] == 0) {
                row = true;
                break;
            }
        }

        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 0) {
                col = true;
                break;
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] =  0;
                    matrix[0][j] =  0;
                }
            }
        }

        for(int i = 1; i < m; i++) {
            if(matrix[i][0] == 0) {
                for(int j = 1;j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 1; j < n; j++) {
            if(matrix[0][j] == 0) {
                for(int i = 1;i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(row == true) {
            for(int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if(col == true) {
            for(int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
 */

