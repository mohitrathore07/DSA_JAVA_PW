package Strings;

import java.util.Scanner;

/*
public class DSA01_StringBasics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        String a;
//        a = s.next(); // space na do tb tk means 1  word input pura
//        a = s.nextLine(); // ek line puri input
//        System.out.println(a);

//          String x = "this is java";
//          System.out.println(x.charAt(2)); // 2nd idx ka character print
//          System.out.println(x.length()); // length print

            /*
            String x = "this";
            System.out.println(x.indexOf('s')); // 1st occuring character ki index return karke dega

            System.out.println(x.lastIndexOf('s')); // last occuring character ki index return karke dega


        ///  Contains and Starts with

//        String a = "java and Python ARe ProgRaMMING languages";
//          System.out.println(a.contains("java"));   contains or not - true | false

//          System.out.println(a.startsWith("phy")); /// start with or not?

//          System.out.println(a.endsWith("ges")); /// ends with or not?

//        System.out.println(a.toLowerCase());
//        System.out.println(a.toUpperCase());

        // substring(i) and substring(i,j)

//        String a = "java and Python ARe ProgRaMMING languages";
//        System.out.println(a.substring(2)); // starting index (including) to end tk print

//        System.out.println(a.substring(2,4)); // starting index (including) to end (excluding)
    }
}
*/

// print substrings
public class DSA01_StringBasics {
    public static void main(String[] args) {
        String s = "abc";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) System.out.print(s.substring(i,j) +" "); // since end idx excluding hota h that's why
            System.out.println();
        }
    }
}