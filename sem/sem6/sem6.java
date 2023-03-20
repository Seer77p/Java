package Java.sem.sem6;

import java.util.LinkedHashSet;
import java.util.TreeSet;

//import java.util.*;


public class sem6 {


    
    public static void main(String[] args) {
        java.util.HashSet<Integer> hash = new java.util.HashSet<>();
        hash.add(1);
        hash.add(8);
        hash.add(3);
        hash.add(2);
        hash.add(4);
        hash.add(3);
        hash.add(9);
        hash.add(2);
        System.out.println("HashSet");
        System.out.println(hash);
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(7);
        set.add(2);
        set.add(5);
        set.add(6);
        set.add(8);
        set.add(7);
        set.add(9);
        set.add(2);
        System.out.println("TreeSet");
        System.out.println(set);
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        link.add(8);
        link.add(3);
        link.add(2);
        link.add(2);
        System.out.println("LinkSet");
        System.out.println(link);
    }
}
