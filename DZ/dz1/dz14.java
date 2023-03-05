package Java.DZ.dz1;

import java.util.Scanner;

public class dz14 {
    public static int number(Scanner scanner, String message) {
        System.out.print(message);
        int number = scanner.nextInt();
        return number;
    }


    public static int equality_true(int summ) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + j * 10 + 5 == summ) {
                    count++;
                    System.out.println("Выражение верно: " + " 2" + i + " + " + j + "5 " + " = " + summ);
                }
            }
        }
        
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = number(scanner, "Введите сумму для выражения: ");
        int equality = equality_true(number);
        System.out.println("Количество решений: "+equality);
        scanner.close();
    }
}
