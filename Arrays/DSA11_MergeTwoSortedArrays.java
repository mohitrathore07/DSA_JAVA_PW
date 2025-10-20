package arrays;

/*
public class DSA11_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,4,7};
        int[] b = {2,5,6,8,9,10};
        int n = a.length + b.length;
        int[] c = new int[n];
        int i = 0, j = 0, k = 0;

        while(i <= a.length-1 && j <=  b.length-1) {
            if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (i <= a.length-1) {
            c[k++] = a[i++];
        }

        while (j <= b.length-1) {
            c[k++] = b[j++];
        }

        for(int ele: c) {
            System.out.println(ele +"");
        }
    }
}
*/


public class DSA11_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,3,4,7};
        int[] b = {2,5,6,8,9,10};
        int n = a.length + b.length;
        int[] c = new int[n];
        int i = a.length-1, j = b.length-1, k = n-1;

        while(i >= 0 && j >=  0) {
            if(a[i] >= b[j]) c[k--] = a[i--];
            else c[k--] = b[j--];
        }

        while (i >= 0) {
            c[k--] = a[i--];
        }

        while (j >= 0) {
            c[k--] = b[j--];
        }

        for(int ele: c) {
            System.out.println(ele +"");
        }
    }
}