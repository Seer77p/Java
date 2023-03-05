package Java.sem.sem2;

import java.io.FileWriter;
import java.io.IOException;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
//которая состоит из чередующихся символов c1 и c2, начиная с c1.

// import java.util.Scanner;

// /**
//  * Program
//  */
// public class sem2 {
//     private static char getChar(Scanner scanner, String message){
//         System.out.print(message);
//         char symbol = scanner.nextLine().charAt(0);
//         return symbol;
//     }
//     private static String generateString(int length, char symbol1, char symbol2){
//         StringBuilder builder = new StringBuilder();
//         for(int i=0;i<length/2;i++)
//             builder.append(new char[]{symbol1,symbol2});
//         return builder.toString();
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter length of string: ");
//         int length = scanner.nextInt();
//         scanner.nextLine(); //пропускаем разделитель, оставшийся в потоке после ввода числа
//         char symbol1 = getChar(scanner, "Enter first symbol of string: ");
//         char symbol2 = getChar(scanner, "Enter last symbol of string: ");
//         System.out.printf("Your result string: %s", generateString(length, symbol1, symbol2));
//         scanner.close();
//     }
// }

//Напишите метод, который сжимает строку. 
//Пример: вход aaaabbbcdd

// public class sem2 {
//     private static String mkString(String s) {
//         StringBuilder sB = new StringBuilder();
//         s = s + ' ';
//         int count = 1;
//         for (int i = 0; i < s.length() - 1; i++) {
//             if (s.charAt(i) == s.charAt(i + 1))
//                 count++;
//             else {
//                 if (count == 1) {
//                     sB.append(s.charAt(i));
//                 } else {
//                     sB.append(s.charAt(i)).append(count);
//                 }
//                 count = 1;
//             }
//         }
//         return sB.toString();
//     }

//     public static void main(String[] args) {
//         String text = "jjjjjfffffffkkkkkkktkkdddddddddddd";
//         System.out.println(mkString(text));

//     }
//}

// Напишите метод, который принимает на вход строку
// (String) и определяет является ли строка палиндромом 
//(возвращает boolean значение).
// public class sem2 {
//     public static boolean polindrom(String intext) {
//         StringBuilder textout = new StringBuilder();
//         String text1 = intext.replaceAll("\\s", "").toLowerCase();
//         System.out.println(text1);
//         for (int i = 0; i < text1.length(); i++) {
//             textout.append(text1.charAt(text1.length() - i - 1));
//         }
//         System.out.println(textout);
//         if (text1.equals(textout.toString())) {
//             return true;
//         }
//         return false;
//     }

//     static boolean Polindrom(String str){
//         int len = str.length();
//         for (int i =0; i < len/2; i++)
//             if (str.charAt(i) != str.charAt(len - i - 1))
//                 return false;
//         return true;
//     }

//     public static void main(String[] args) {
//         String text = "осело колесо";
//         System.out.println(polindrom(text));
//         System.out.println(Polindrom(text));
//     }
// }
///*
//  * Напишите метод, который составит строку, 
//  * состоящую из 100 повторений слова TEST и метод, 
//  * который запишет эту строку в простой текстовый файл, обработайте исключения.
public class sem2 {
    public static void main(String[] args) {
        StringBuilder text = getNewString("TEST");
        writeFile(text.toString());
    }

    public static StringBuilder getNewString(String word) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            text.append(word);
            text.append("\n");
        }
        return text;
    }

    public static void writeFile(String text) {
        try (FileWriter writer = new FileWriter("fileText.txt", false)) {
            writer.append(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}