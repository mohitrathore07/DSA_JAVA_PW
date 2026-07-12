package Arrays;

public class Java09 {
    public static void main(String[] args) {
        int[][] a = { {1,2,3},{4,5,6},{7,8,9}};
        int j = a.length-1;
        int psum = 0, ssum = 0;
        for(int i = 0; i < a.length;i++) {
            psum += a[i][i];
            ssum += a[i][j--];
        }

        System.out.println("primary diagonal sum: "+psum);
        System.out.println("secondry diagonal sum: "+ssum);
    }
}

