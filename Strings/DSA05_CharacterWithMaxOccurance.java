package Strings;

import java.util.Scanner;

/*
public class DSA05_CharacterWithMaxOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            int idx = (int)c - 97;
            freq[idx]++;
        }

        int maxFreq = 0;
        for(int i=0;i<freq.length;i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        for(int i=0;i<freq.length;i++) {
            if(maxFreq == freq[i]) {
                char ch = (char)(i + 97);
                System.out.print(ch+" ");
            }
        }
    }
}
*/

/*

class DSA05_LargestNumberInAString {
    public static void main(String[] args) {
        String[] s = {"0004758" , "71856", "789278", "145283", "47692", "672850"};
        String maxS = s[0];

        for(int i=0;i<s.length;i++) {
            maxS = max(maxS, s[i]);
        }
        System.out.println(maxS);
    }

    public static String max(String a, String b) {
        String s = purify(a) , t = purify(b);
        if(s.length()>t.length()) return a;
        if(t.length()>s.length()) return b;

        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)!=t.charAt(i)) {
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return a;
    }
    public static String purify(String s) {
        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
 */
