package Java.DZ.dz5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz53 {
    public static int[] filling_array(int size_arr, int max_value) {
        Random random = new Random();
        int[] fill_arr = new int[size_arr];
        for (int i = 0; i < fill_arr.length; i++) {
            fill_arr[i] = random.nextInt(max_value);
        }
        return fill_arr;
    }

    public static void heapSort(int[] fill_array, int size_new) {
        int temp;
        int size = size_new-1;
        for (int i = (size_new / 2); i >= 0; i--) {
           heapify(fill_array, i, size);
        }
        for(int i= size; i>=0; i--) {
           temp = fill_array[0];
           fill_array[0] = fill_array[size];
           fill_array[size] = temp;
           size--;
           heapify(fill_array, 0, size);
        }
        System.out.println(Arrays.toString(fill_array));
     }

    public static void heapify(int[] arr, int i, int new_size) {
        int left = 2 * i;
        int rigth = 2 * i + 1;
        int largest;
        if (left <= new_size && arr[left] > arr[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (rigth <= new_size && arr[rigth] > arr[largest]) {
            largest = rigth;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, new_size);
        }
    }
     
    private static void print_array(int[] arr_print) {
        String conclusion = "";
        for (int i = 0; i < arr_print.length; i++) {
            if (i == arr_print.length - 1)
                conclusion += arr_print[i];
            else
                conclusion += arr_print[i] + "  ";
        }
        System.out.println(conclusion);
    }
    
     public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = scanner.nextInt();
        int[] filling_array = filling_array(size, 100);
        print_array(filling_array);
        heapSort(filling_array, size);
        scanner.close();
    }
}
