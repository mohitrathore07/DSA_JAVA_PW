package Strings;
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0; i < s.length(); i++) {
            if(ch1[i]!=ch2[i]) return false;
        }
        return true;
    }
}
 */

/*
// 205. Isomorphic Strings
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] a = new char[128];
        for(int i=0; i<s.length();i++) {
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            int idx = (int)ch;
            if(a[idx]=='\0') a[idx] = ch2;
            else {
                if(a[idx]!=ch2) return false;
            }
        }

        Arrays.fill(a, '\0'); // reset the array

        for(int i=0; i<t.length();i++) {
            char ch = t.charAt(i);
            char ch2 = s.charAt(i);
            int idx = (int)ch;
            if(a[idx]=='\0') a[idx] = ch2;
            else {
                if(a[idx]!=ch2) return false;
            }
        }
        return true;
    }
}
 */

/*
class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        String ans = "";
        while(j<chars.length) {
            if(chars[i] == chars[j]) j++;
            else {
                ans += chars[i];
                int len = j-i;
                if(len>1) ans+=len;
                i = j;
            }
        }
        ans += chars[i];
        int len = j-i;
        if(len>1) ans+=len;
        for(i=0;i<ans.length();i++) {
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }
}

 */
public class DSA99_StringLeetcode {
    
}
