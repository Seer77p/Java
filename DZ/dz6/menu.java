package Java.DZ.dz6;

import java.util.ArrayList;
import java.util.Scanner;


public class menu {

    public static void menu(ArrayList<noutbook> nouts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЧастота процессора                 1: \n" + "Размер жесткого диска              2:\n"
                + "Установленная операционная система 3: \n" + "Цвет ноутбука                      4: \n" + "Цена компьютера                    5:\n"+"Завершить выбор фильтров           6:\n");
        while (true) {
            System.out.print("Выберете интересующий фильтр: ");
            int filtr = scanner.nextInt();
            if (filtr == 6) {
                break;
            }
            else {
                switch (filtr) {
                    case 1:
                        System.out.print("\nВведите минимальную частоту процессора: ");
                        int us_cpu = scanner.nextInt();
                        semple.us_cpu_filter(nouts, us_cpu);
                        break;

                    case 2:
                        System.out.print("\nВведите минимальный размер жесткого диска: ");
                        int us_hdd = scanner.nextInt();
                        semple.us_hdd_filter(nouts, us_hdd);
                        break;

                    case 3:
                        System.out.print("\nВведите Необходимую операционную среду: ");
                        scanner.nextLine();
                        String us_system = scanner.nextLine();
                        semple.us_system_filter(nouts, us_system);
                        break;

                    case 4:
                        System.out.print("\nВведите желаемый цвет: ");
                        scanner.nextLine();
                        String us_color = scanner.nextLine();
                        semple.us_color_filter(nouts, us_color);
                        break;

                    case 5:
                        System.out.print("\nВведите минимальную рассматриваемую цену: ");
                        int us_prise = scanner.nextInt();
                        semple.us_prise_filter(nouts, us_prise);
                        break;
                }
            }
        }
        scanner.close();
    }
}
