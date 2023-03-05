package Java.DZ.dz1;

import java.util.Scanner;

public class dz13 {
    private static final char String = 0;

    public static double number(Scanner scanner, String message) {
        System.out.print(message);
        double number = scanner.nextDouble();
        return number;
    }

    private static char action_choice(Scanner scanner, String message) {
        
        System.out.println("\n+ сложение" + "\n- вычитание" + "\n* умножение"+"\n/ деление");
        System.out.print(message);
        char symbol = scanner.next().charAt(String);
        return symbol;
    }

    
   
    public static double action(double one, double two, char znak) {
        double result = 0;
        switch (znak) {
            case '*':
                result = one * two;
                break;
            case '/':
                result = one / two;
                break;
            case '+':
                result = one + two;
                break;
            case '-':
                result = one - two;
                break;
        }
        return result;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number_one = number(scanner, "Введите первое число для расчета: ");
        double number_two = number(scanner, "Введите второе число для расчета: ");
        char symbol = action_choice(scanner, "Введите знак отображающий нужную математическую операцию: ");
        System.out.println("Результат действия: "+number_one+" "+symbol+" "+number_two+" = "+action(number_one, number_two, symbol));
        scanner.close();
    }
}
