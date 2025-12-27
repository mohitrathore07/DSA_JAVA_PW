package Strings;

import java.util.Scanner;

public class DSA04_StringBuilderReverse {
    public static void reverseString(StringBuilder str,int i , int j) {
        while(i<=j) {
            char c = str.charAt(i);
            str.setCharAt(i,  str.charAt(j));
            str.setCharAt(j , c);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0, j = 0;
        while(j<sb.length()) {
            if(sb.charAt(j)!=' ') j++;
            else {
                reverseString(sb, i, j-1);
                i = j + 1;
                j = i;
            }
        }
        reverseString(sb, i, j-1); // to reverse the last word of string
        System.out.println(sb);
    }
}

