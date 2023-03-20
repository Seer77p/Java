package Java.less.less6.part1;

import java.util.*;

   // как синоним множества
        // first()
        // last()
        // headSet(E) печать до 4 элемента
        // tailSet(E) печать с 4 элемента
        // subSet(E1,E2) печать 3 и 5 элемента

public class TreeSet {
    public static void main(String[] args) {
        var a = new java.util.TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new java.util.TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));

        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
        System.out.println(a.subSet(3, 5)); // [3, 4]
    }
}
