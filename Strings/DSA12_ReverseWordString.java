package Strings;

public class DSA12_ReverseWordString {
    public static void main(String[] args) {
        String s = "Love is me";
        int i = 0, j = 0;
        String str = "";
        while (j < s.length()) {

            if (s.charAt(j) != ' ') j++;
            else {
                str = (s.substring(i, j))+ " " + str;
                i = j+1;
                j++;
            }
        }
        str = (s.substring(i, j))+ " " + str;

        System.out.println(str);

    }
}

