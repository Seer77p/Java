// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернёет «перевёрнутый» список.

package Java.DZ.dz4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class dz41 {
    public static LinkedList<Integer> iniciazator(int size1) {
        Random random = new Random();
        LinkedList<Integer> link = new LinkedList<Integer>();
        for (int i = 0; i < size1; i++) {
            link.add(random.nextInt(1, 100));
        }
        return link;
    }

    public static LinkedList<Integer> revers(LinkedList<Integer> ini) {
        LinkedList<Integer> revlink = new LinkedList<Integer>();
        for (int i = ini.size()-1; i >=0; i--) {
            revlink.add(ini.get(i));
        }
        return revlink;
}

    public static void main(String[] args) {
        System.out.print("Введите количество чисел для операции: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        LinkedList<Integer> inicial = iniciazator(size);
        System.out.printf("\nразмер = " + size + " элементов, Содержание массива: " + inicial + "\n");
        inicial = revers(inicial);
        System.out.printf("\nразмер = " + size + " элементов, Развернутый массив: " + inicial + "\n");
        System.out.println();
        scanner.close();
    }

       
}

