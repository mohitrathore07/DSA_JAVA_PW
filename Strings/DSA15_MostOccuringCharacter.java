package Strings;

public class DSA15_MostOccuringCharacter {
    public static void main(String[] args) {
        String str = "aaaabbbbccde";
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++) {
            freq[str.charAt(i)-'a']++;
        }
        char ch = ' ';
        int currOcc = 0;
        for(int i=0; i<freq.length; i++) {
            if(currOcc < freq[i] ) {
                currOcc = freq[i];
                ch = (char) (i + 'a');
            }

        }
        System.out.println(ch);
    }
}
