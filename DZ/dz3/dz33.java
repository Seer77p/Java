package Java.DZ.dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class dz33 {
    public static List<Integer> random_metod(int size_num) {
        Random random = new Random();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < size_num; i++) {
            arr.add(random.nextInt(1, 100));
        }
        return arr;
    }

    public static void odd_numbers(List<Integer> ini) {
        int summ = 0;
        for (int i = 0; i < ini.size(); i++) {
            summ += ini.get(i);
        }
        int average_array = summ / ini.size();
        System.out.print("Сумма числел массива " + summ + " " + "/ количество элементов " + ini.size()
                + " Среднее арифметическое заданного массива = " + average_array+"\n");
    }

    public static void main(String[] args) {
        System.out.print("Введите количество чисел для операции: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> inicialized = random_metod(size);
        System.out.printf("\nразмер = " + size + " элементов, Содержание массива: " + inicialized + "\n");
        System.out.printf(
                "\nразмер = " + size + " элементов, Минимальное из них: " + Collections.min(inicialized) + "\n");
        System.out.printf(
                "\nразмер = " + size + " элементов, Минимальное из них: " + Collections.max(inicialized) + "\n\n");
        odd_numbers(inicialized);
        System.out.println();
        scanner.close();
    }
}
