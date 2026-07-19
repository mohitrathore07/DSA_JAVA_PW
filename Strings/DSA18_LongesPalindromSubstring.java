package Strings;

public class DSA18_LongesPalindromSubstring {
    public static boolean palindrom(String str) {
        int i = 0, j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";
        int i = 0, j=0;

        while(i < s.length()) {
            j = i+1;
            while(j < s.length()) {
                if( palindrom(s.substring(i,j)) && s.substring(i,j).length() > ans.length() ) ans = s.substring(i,j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
