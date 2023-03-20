package Java.less.less6.part1;

import java.util.*;
import java.util.HashSet;

public class MathSet {
    public static void main(String[] args) {
        var a = new java.util.HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new java.util.HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new java.util.HashSet<Integer>(a); u.addAll(b);
        var r = new java.util.HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]

        System.out.println(a.addAll(b));
    }
}
