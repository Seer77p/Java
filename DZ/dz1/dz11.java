package Java.DZ.dz1;

import java.util.Scanner;

public class dz11 {
    public static int summ(int number) {
        int summ_number = 0;
        for (int i = 0; i < number; i++) {
            summ_number += i;
        }
        return summ_number;
    }
    public static void main(String[] args) {
        System.out.print("Введите число, до которого будет считаться сумма: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("\nСумма треугольного числа " + number + " равна: " + summ(number) + "\n");
        System.out.println();


        scanner.close();
    }
}
