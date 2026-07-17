package Strings;
public class DSA13_SubstringMaxOddElement {
    public static void main(String[] args) {
        String str = "0774";
        int maxNum = 1;
        if(str.length()==1 && (str.charAt(0)-'0'%2)!=0) System.out.println(str);
        else if(str.length()==1 && (str.charAt(0)-'0'%2)==0) System.out.println("");
        else {
            for (int i = 0; i < str.length(); i++) {
                int currNum = str.charAt(i) - '0';
                for (int j = i + 1; j < str.length(); j++) {
                    currNum = currNum * 10 + (str.charAt(j) - '0');
                    if (currNum % 2 != 0)
                        maxNum = Math.max(currNum, maxNum);
                }
            }
            System.out.println(maxNum);
        }
    }
}
