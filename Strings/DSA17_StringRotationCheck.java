package Strings;

import java.util.Arrays;

public class DSA17_StringRotationCheck {
    private static  boolean isRotation(String s1, String s2) {
        if(s1.length() != s2.length()) return  false;
        if(s1.equals(s2)) return  true;
        String rotate = "";
        int i = 0;
        while (i < s1.length()) {
            rotate  =   s1.substring(i+1) + s1.substring(0,i+1);
            if(rotate.equals(s2)) return true;
            i++;
        }
        return  false;
    }

    public static void main(String[] args){
        System.out.println(isRotation("abcd","bcda"));
    }
}
