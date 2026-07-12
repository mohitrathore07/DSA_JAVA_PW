package Strings;

import java.util.Scanner;

public class DSA08_CountVowels {

    private static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'A') return true;
        if(ch == 'e' || ch == 'E') return true;
        if(ch == 'i' || ch == 'I') return true;
        if(ch == 'o' || ch == 'O') return true;
        if(ch == 'u' || ch == 'U') return true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String: ");
        String s = sc.nextLine();

        int count = 0;
        for (int i = 0; i < s.length();i++) {
            char ch = s.charAt(i);
            if(isVowel(ch) == true) count++;
        }
        System.out.println("vowels count: "+count);
    }
}
