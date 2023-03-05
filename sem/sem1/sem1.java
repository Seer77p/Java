// package Java.sem1;

// import java.time.LocalDateTime;
// import java.util.Scanner;

// public class sem1 {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//         System.out.println(LocalDateTime.now());
//         System.out.print("Enter ");
//         Scanner scanner = new Scanner(System.in);
//         int value = scanner.nextInt();
//         System.out.printf("Inputed %d", value);
//         scanner.close();
//     }
// }
// Написать программу, которая запросит пользователя 
//ввести <Имя> в консоли. 
//Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

// package Java.sem1;

// import java.util.Scanner;

// public class sem1 {

//     public static void main(String[] args) {
//         //System.out.print("\033[H\]")
//         System.out.print("Введите имя: ");
//         Scanner scanner = new Scanner(System.in);
//         String text = scanner.nextLine();
//         System.out.printf("Привет, " + text + "!");
//         scanner.close();
//     }
// }

//Дан массив двоичных чисел, например [1,1,0,1,1,1], 
//вывести максимальное количество подряд идущих 1.

package Java.sem.sem1;

public class sem1 {
    public static void main(String[] args) {
        //
        int[] array = new int[] { 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0 };
        int count = 0;
        int maxy = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (count > maxy) {
                    maxy = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxy);
    }
}


