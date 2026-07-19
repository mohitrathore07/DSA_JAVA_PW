package Strings;

public class DSA16_SecondMostOccCharacter {
    public static void main(String[] args) {
/*
        String str = "abbcccdddd";

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        int firstMax = 0;
        int secondMax = 0;

        char firstChar = ' ';
        char secondChar = ' ';

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > firstMax) {

                secondMax = firstMax;
                secondChar = firstChar;

                firstMax = freq[i];
                firstChar = (char) (i + 'a');
            }
            else if (freq[i] > secondMax && freq[i] != firstMax) {

                secondMax = freq[i];
                secondChar = (char) (i + 'a');
            }
        }

        if (secondMax == 0)
            System.out.println("No Second Most Repeated Character");
        else {
            System.out.println("First Most Repeated Character : " + firstChar + " -> " + firstMax);
            System.out.println("Second Most Repeated Character : " + secondChar + " -> " + secondMax);
        }*/

    }
}