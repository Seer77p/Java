package Java.sem.sem5;

import java.util.HashMap;
import java.util.Scanner;

public class sem52 {

    //метод к первому коду
    public static void checkingCount(HashMap<Integer, Integer> map1, String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            int pos = text.indexOf(text.charAt(i));
            if (pos != -1) {
                if (pos < i) {
                    map1.put(i, map1.get(pos));
                } else {
                    map1.put(i, count++);
                }
            } else {
                map1.put(i, count++);
            }

        }
        System.out.println(map1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово: ");
        String secondWord = scanner.nextLine();
        if (firstWord.length() != secondWord.length())
            System.out.println("не изоморфные");
        else {
            HashMap<Integer, Integer> map1 = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            checkingCount(map1, firstWord);
            checkingCount(map2, secondWord);

            System.out.println(map1.equals(map2));
        }
        scanner.close();
    }
}
