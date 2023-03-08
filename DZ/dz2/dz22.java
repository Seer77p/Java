// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.package Java.DZ.dz2;
package Java.DZ.dz2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class dz22 {
        
    //private static Object fn;


    public static int[] random_metod(int[] arr, int size_num) {

        //Random rand = new Random();
        for (int i = 0; i < size_num; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

   
    private static int[] bubble_sort(int[] arr, Logger logger) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    count++;
                    String number_string = Integer.toString(count);
                    String arr_logg = Arrays.toString(arr);
                    logger.info("операция"+"("+number_string+")"+arr_logg+" перемещение ("+arr[j]+") to ("+arr[j+1]+")");
                }
            }
        }

    return arr;
}




public static void main(String[] args) throws SecurityException, IOException {

    Logger logger = Logger.getLogger(dz22.class.getName());
    SimpleFormatter sFormat = new SimpleFormatter();
    FileHandler fn = new FileHandler("logdz22.txt");
    fn.setFormatter(sFormat);
    logger.addHandler(fn);
    logger.setUseParentHandlers(false);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество чисел: ");
    int size = scanner.nextInt();
    int[] array = new int[size];
    int []arr_new=random_metod(array, size);
    //System.out.println("\n"+Arrays.toString(arr_new));
    int[] arr_sort = bubble_sort(arr_new, logger);
    System.out.println("\n" + Arrays.toString(arr_sort));

    scanner.close();
    }
}
