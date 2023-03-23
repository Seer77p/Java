// 1. Напишите метод, который заполнит массив из 1000 элементов 
//случайными цифрами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив
// и с помощью Set вычислите процент уникальных значений в данном
// массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / 
//общее количество чисел в массиве.


package Java.sem.sem6.sem61;

import java.util.Random;
import java.util.Scanner;

//import Java.less.less6.part1.HashSet;

public class sem61 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner scanner = new Scanner(System.in);
        int[] array = FillArray(scanner);
        PrintArray(array);
        System.out.println();
        java.util.HashSet <Integer> set = FillHashSet(array);
        CheckUnicNimbers(array, set);
        scanner.close();
    }

    public static int[] FillArray(Scanner scanner) {
        Random rand = new Random();
        System.out.print("Введите количество массива: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int index = 0; index < number; index++) {
            array[index] = rand.nextInt(0, 25);
        }
        return array;
    }
    public static void PrintArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf(array[index] + " ");
        }
    }
    public static java.util.HashSet<Integer> FillHashSet(int[] array) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);
        return set;
    }
    public static void CheckUnicNimbers(int[] array, java.util.HashSet<Integer> set) {
        double x = array.length;
        double y = set.size();
        double result = (y * 100) / x;
        
        System.out.print("Колличество чисел в массиве = " + x + "\nКолличество уникальных = " + y + "\nResult: " + result + " %");
    }

    }

