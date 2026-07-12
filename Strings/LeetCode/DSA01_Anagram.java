package Strings.LeetCode;

public class DSA01_Anagram {
    private  static  boolean isAnagram(String s,String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length() ) return false;
        int[] freq = new int[26];

        int i = 0;
        while (i < s.length()) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
            i++;
        }

        for(int val : freq) if(val != 0) return  false;

        return true;
    }

    public static void main(String[] args) {
        boolean res = isAnagram("Anagam","nagaram");
        System.out.println(res);
    }
}
