package Arrays;

public class DSA18_FirstSecondMaxOneTraversal {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,7,7};
        int fMax = 0, sMax = 0;
        for (int i = 0; i < arr.length;i++) {
            if(arr[i] > fMax) {
                sMax = fMax;
                fMax = arr[i];
            }
            else if(arr[i] > sMax && arr[i] != fMax) {
                sMax = arr[i];
            }
        }

        System.out.println("first max: "+fMax);
        System.out.println("second max: "+sMax);
    }
}
