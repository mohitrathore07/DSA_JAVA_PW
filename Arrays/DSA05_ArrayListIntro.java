package arrays;

import java.util.ArrayList;

public class DSA05_ArrayListIntro {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list); // [] - empty
        System.out.println(list[0]); // if u haven't give size and print values using index it will give error
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list); // we can direct print
        */

        ArrayList<Integer> list = new ArrayList<>(5); // size

        list.add(0,10); // add on a specific index
        list.add(1,10); 
        list.add(2,10); 
        list.add(3,10); 
        list.add(4,10); 

        System.out.println(list); 
        
        list.set(2, 200); // modify
        System.out.println(list.get(2));  // get the value

        list.remove(2);  // remove element from a specified index
        System.out.println(list); 

    }
}

