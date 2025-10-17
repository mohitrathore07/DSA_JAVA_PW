package arrays;

public class DSA06_QuestionsOnArrays {
    public static void main(String[] args) {
        int[] arr = {1,5,-6,5,8};
        int target = 6;

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target) {
                    System.out.println("i got it: "+arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }   
}
