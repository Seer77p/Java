// Реализовать алгоритм сортировки слиянием
package Java.DZ.dz3;

import java.util.Arrays;
import java.util.Scanner;

public class dz31 {
        public static int[] mergerSort(int[] sortArr) {
            int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
            int[] buffer2 = new int[sortArr.length];
            int[] result = mergeInnerArray(buffer1, buffer2, 0, sortArr.length);
            return result;
        }
    
        public static int[] mergeInnerArray(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
            if (startIndex >= endIndex - 1) {
                return buffer1;
            }
            int middle = startIndex + (endIndex - startIndex) / 2;
            int[] sorted1 = mergeInnerArray(buffer1, buffer2, startIndex, middle);
            int[] sorted2 = mergeInnerArray(buffer1, buffer2, middle, endIndex);
            int index1 = startIndex;
            int index2 = middle;
            int destIndex = startIndex;
            int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
            while (index1 < middle && index2 < endIndex) {
                result[destIndex++] = sorted1[index1] < sorted2[index2]
                        ? sorted1[index1++]
                        : sorted2[index2++];
            }
            while (index1 < middle) {
                result[destIndex++] = sorted1[index1++];
            }
            while (index2 < endIndex) {
                result[destIndex++] = sorted2[index2++];
            }
            return result;
        }


        
        public static int[] random_metod(int[] arr, int size_num) {
            for (int i = 0; i < size_num; i++) {
                arr[i] = (int) (Math.random() * 100);
                }
            return arr;
        }

            public static void main(String args[]) {
            System.out.print("Введите количество чисел для сортировки: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] inicialize=new int[size];
            int[] sortArray = random_metod(inicialize, size);
            System.out.printf("\nразмер = " + size + " элементов, Содержание массива: " + Arrays.toString(sortArray) + "\n");
            int[] result = mergerSort(sortArray);
            System.out.println("\nразмер = " + size + " элементов, Отсортированный массив: " +Arrays.toString(result)+ "\n");
            System.out.println();
            scanner.close();
        }
    }

