package Strings;

public class DSA11_MostOccuringCharacter {
    public static void main(String[] args) {
        String str = "abaeeeeeeaacrmnrra";
        int [] freq = new int[26];

        for(int i = 0; i < str.length();i++) {
            freq[ str.charAt(i)-'a']++;
        }
        int idx = -1,  maxOcc = -1;
        for(int i = 0; i<freq.length;i++) {
            if(freq[i] > maxOcc) {
                maxOcc = freq[i];
                idx = i;
            }
        }
        System.out.println((char) (idx+'a'));
    }
}
