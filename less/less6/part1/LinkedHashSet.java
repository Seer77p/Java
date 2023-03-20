package Java.less.less6.part1;

import java.util.*;

public class LinkedHashSet {
    public static void main(String[] args) {
        var a = new java.util.LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new java.util.LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        a.add(28);
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
    }
}
