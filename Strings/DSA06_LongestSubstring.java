package Strings;

public class DSA06_LongestSubstring {
    public static void main(String[] args) {
        String str="dudf";
        String s = "";
        if(str.length() == 0) System.out.println("left");
        String longestStr = "" + str.charAt(0);

        for(int i = 0; i < str.length(); i++ ) {
            int j = i+1;
            s = "" + str.charAt(i);
            while ( j<str.length() && s.indexOf( str.charAt(j) ) == -1  ) s+= str.charAt(j++);
            if(s.length() > longestStr.length() ) longestStr = s;
        }
        if(s.length() > longestStr.length()) {
         System.out.println(s);
        }
        else {
            System.out.println(longestStr);
        }

    }
}
