package Strings;

public class DSA07_CountCharacter {
    public static void main(String[] args) {
        String str= "aaabbbccddee";
        String ans = "";
        int currLength = 1;
        for (int i = 1; i < str.length();i++) {
            if(str.charAt(i-1) == str.charAt(i) ) currLength++;
            else{
                ans =( ans + str.charAt(i-1)) + currLength;
                currLength = 1;

            }
        }
        System.out.println(ans);
    }
}
