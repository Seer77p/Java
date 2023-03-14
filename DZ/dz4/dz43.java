// В калькулятор добавьте возможность отменить последнюю операцию.
package Java.DZ.dz4;

import java.util.LinkedList;
import java.util.Scanner;

public class dz43 {
    private static final char String = 0;
    public static double number(Scanner scanner, String message) {
        System.out.print(message);
        double number = scanner.nextDouble();
        return number;
    }

    private static char action_choice(Scanner scanner, String message) {
        System.out.println("\n+ сложение" + "\n- вычитание" + "\n* умножение" + "\n/ деление");
        System.out.print(message);
        char symbol = scanner.next().charAt(String);
        return symbol;
    }

    public static double action(double number_one, double two, char znak) {
        double result = 0;
        switch (znak) {
            case '*':
                result = number_one * two;
                break;
            case '/':
                result = number_one / two;
                break;
            case '+':
                result = number_one + two;
                break;
            case '-':
                result = number_one - two;
                break;
        }
        return result;
    }

    public static int menu(Scanner scanner, String message) {
        System.out.println("\nДля окончания работы введите                  1: "
                + "\nДля выполнения одиночной операции введите     2: "
                + "\nДля выполнения многострочной операции введите 3: ");
        int working_mode = scanner.nextInt();
        return working_mode;
    }

    public static Double calculation(Scanner scanner) {
        Double rez;
        double number_one = number(scanner, "Введите первое число для расчета: ");
        double number_two = number(scanner, "Введите второе число для расчета: ");
        char symbol = action_choice(scanner, "\nВведите знак отображающий нужную математическую операцию: ");
        System.out.println("\nРезультат действия: " + number_one + " " + symbol + " "
                + number_two + " = "
                + action(number_one, number_two, symbol) + "\n");
        rez = action(number_one, number_two, symbol);
        return rez;
    }

    public static Double is_Null_temp(LinkedList<Double> multi_num,double temp, Scanner scanner) {
        if (temp == 0) {
            temp = calculation(scanner);
            is_Null_libk(multi_num, temp);
        }
        return temp;
    }
    
    public static LinkedList<Double> is_Null_libk(LinkedList<Double> multi_num, double temp) {
        multi_num.add(temp);
        return multi_num;
    }

    public static LinkedList<Double> new_link(LinkedList<Double> multi_num, double temp) {
        multi_num.add(temp);
        System.out.println("История сумм по операциям" + multi_num);
        return multi_num;
    }
    
    public static double new_temp(double temp, Scanner scanner) {
        double new_temp;
        char symbol = action_choice(scanner, "\nВыберите знак для операции: ");
        Double number_add = number(scanner, "Введите число для расчета: ");
        System.out.println("\nРезультат действия: " + temp + " " + symbol + " "
                + number_add + " = "
                + action(temp, number_add, symbol) + "\n");
        new_temp = action(temp, number_add, symbol);
        return new_temp;
    }

    public static LinkedList<Double> poll_link(LinkedList<Double> multi_num) {
        multi_num.pollLast();
        System.out.println("История сумм по операциям: " + multi_num);
        return multi_num;
}

public static LinkedList<Double> manual(LinkedList<Double> multi_num, double temp, int menu, Scanner scanner) {
    switch (menu) {
        case 1:
            System.out.println("\n До встречи!\n");
            break;
        case 2:
            calculation(scanner);
            break;
        case 3:
            int step = 0;
            while (step != 2) {
                temp = is_Null_temp(multi_num, temp, scanner);
                System.out.print("История по операциям: "+multi_num+"\n");
                temp = new_temp(temp, scanner);
                multi_num = new_link(multi_num, temp);
                System.out.print("\n1: Продолжить\n2: Прервать\n3: Отменить последнюю операцию\n : ");
                step = (scanner.nextInt());
                if (step == 3) {
                    multi_num = poll_link(multi_num);
                    System.out.print("История по операциям: " + multi_num + "\n");
                    System.out.print("\n1: Продолжить\n2: Прервать\n3: Отменить последнюю операцию\n : ");
                    step = (scanner.nextInt());
                }
                else if (step == 1) {
                    continue;
                }
            } 
            System.out.println("\nИстория результатов по операциям : "+multi_num+"\n\nДо встречи!\n");
            break;
    }
    return multi_num;
}
           
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu=0;
        double temp = 0;
        LinkedList<Double> multi_num = new LinkedList<Double>();
        menu = menu(scanner, "Выберете режим работы: ");
        manual(multi_num, temp, menu, scanner);
        scanner.close();
    }
}
