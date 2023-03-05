package Java.DZ.dz1;

import java.util.Scanner;

public class dz1 {

    public static int summ(int number) {
        int summ_number = 0;
        for (int i = 0; i < number; i++) {
            summ_number += i;
        }
        return summ_number;
    }

    public static void printing_prime_numbers() {
        int size = 1000;
        System.out.print("2 " + "3 " + "5 " + "7");
        for (int i = 7; i < size; i++) {
            if (i % 2 == 0)
                ;
            else if (i % 3 == 0)
                ;
            else if (i % 5 == 0)
                ;
            else if (i % 7 == 0)
                ;
            else
                System.out.print(" " + i);
        }
    }

    public static void calculator(int num1, int num2, char znac) {

    }

    public static void main(String[] args) {
        System.out.print("Введите число, до которого будет считаться сумма: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("\nСумма треугольного числа " + number + " равна: " + summ(number) + "\n");
        printing_prime_numbers();
        System.out.println();


        
        int num1 = 0;
        int num2 = 0;
        char znac = 0;


        calculator(num1, num2, znac);



        scanner.close();
    }
}
