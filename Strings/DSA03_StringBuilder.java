package Strings;

import java.util.Scanner;
// toggle character small -> capital and capital -> small
public class DSA03_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                int ascii = sb.charAt(i);
                ascii -= 32;
                sb.setCharAt(i, (char) ascii);
            }
            else {
                int ascii = sb.charAt(i);
                ascii += 32;
                sb.setCharAt(i, (char) ascii);
            }
        }
        System.out.println(sb);
    }
}
