package Java.sem.sem6.sem61.sem63;

import java.util.Arrays;
import java.util.Set;

import Java.less.less6.part1.HashSet;

public class Oop {
    public static void main(String[] args) {

        Cat c1 = new Cat(1, "Барсик", 2021, "Двортерьер", 'м');
        Cat c2 = new Cat();
        Cat c3 = new Cat(2, "Марс", 2021, "Двортерьер", 'м');
        Cat c4 = new Cat();
        Cat c5 = new Cat();

        Set<Cat> cats = new java.util.HashSet<>(Arrays.asList(c1, c2, c3, c4, c5));
        System.out.println(cats);
        // System.out.println(c1);
        // System.out.println(c2);
    }
}