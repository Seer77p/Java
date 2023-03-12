// Пусть дан произвольный список целых чисел, 
// удалить из него чётные числа

package Java.DZ.dz3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class dz32 {

    public static List<Integer> random_metod(int size_num) {
        Random random = new Random();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < size_num; i++) {
            arr.add(random.nextInt(1, 100));
        }
        return arr;
    }

    public static List<Integer> odd_numbers(List<Integer> ini) {
        for (int i = 0; i < ini.size(); i++) {
            if (ini.get(i) % 2 == 0) {
                ini.remove(i);
                i--;
            }
        }
        return ini;
    }

    public static void main(String[] args) {
        System.out.print("Введите количество чисел для операции: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> inicialized = random_metod(size);
        System.out.printf("\nразмер = " + size + " элементов, Содержание массива: " + inicialized + "\n");
        ArrayList<Integer> odd_numbers_List = (ArrayList<Integer>) odd_numbers(inicialized);
        System.out.println("\nразмер = " + size + " элементов, Массив нечетных чисел: " + odd_numbers_List + "\n");
        System.out.println();
        scanner.close();
    }
}
