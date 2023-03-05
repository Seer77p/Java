package Java.less.less1;
// public class program {
//     public static void main(String[] args) {
//         String s = "  d ";
//         System.out.println(s );
//     }
// }

// /**
//  * program
//  */
// public class program {
//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age); //10
//         System.out.println(salary); //123456
//     }
// }

// class Program
// {
//  public static void main(String[] args) {
//  float e = 2.7f;
//  double pi = 3.1415;
//  System.out.println(e); // 2.7
//  System.out.println(pi); // 3.1415
//  }
// }
// class Program
// {
//  public static void main(String[] args) {
//  char ch = '1';
//  System.out.println(Character.isDigit(ch)); // true
//  ch = 'a';
//  System.out.println(Character.isDigit(ch)); // false
//  }
// }
// public class Program {
//     public static void main(String[] args) {
//     boolean flag1 = 123 <= 234;
//     System.out.println(flag1); // true
//     boolean flag2 = 123 >= 234 || flag1;
//     System.out.println(flag2); // true
//     boolean flag3 = flag1 ^ flag2;
//     System.out.println(flag3); // false
//     }
//    }

// public class Program {
//     public static void main(String[] args) {
//     String msg ="Hello world";
//     System.out.println(msg); // Hello world
//     }
//    }

// // неявная типизация var
// public class Program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a); // 123
//         var d = 123.456;
//         System.out.println(d); // 123.456
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         var a = 123;
//  System.out.println(a); // 123
//  var d = 123.456;
//  System.out.println(d); // 123.456
//  System.out.println(getType(a)); // Integer
//  System.out.println(getType(d)); // Double
//  d = 1022;
//  System.out.println(d); // 1022
//  //d = "mistake";
//  //error: incompatible types:
//  //String cannot be converted to double
//  }
//  static String getType(Object o){
//  return o.getClass().getSimpleName();

//     }
// }

// Примитив                Обертка
//     int                 Integer
//     short                Short
//     long                 Long
//     byte                Byte
//     float               Float
//     double              Double
//     char                Character
//     boolean             Boolean

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] arsg) {
//         System.out.println(Integer.MAX_VALUE);//2147483647
//         System.out.println(Integer.MIN_VALUE);//-2147483648
//     }
// }

// ● Присваивание: =
// ● Арифметические: *, /, +, -, %, ++, --
// ● Операции сравнения: <, >, ==, !=, >=, <=
// ● Логические операции: ||, &&, ^, !
// ● Побитовые операции <<, >>, &, |, ^

// Массивы
// одномерные
// public class program {

//     public static void main(String[] args) {
//         int [] arr = new int[10];
//         System.out.println(arr.length);//10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length);//5

//     }
// }

// двумерные
// public class program {

//     public static void main(String[] args) {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }

// }
//Преобразования
//Можно
// public class Program {
//     public static void main(String[] args) {
//     int i = 123; double d = i;
//     System.out.println(i); // 123
//     System.out.println(d); // 123.0
//     d = 3.1415; i = (int)d;
//     System.out.println(d); // 3.1415
//     System.out.println(i); // 3
//     d = 3.9415; i = (int)d;
//     System.out.println(d); // 3.9415
//     System.out.println(i); // 3
//     byte b = Byte.parseByte("123");
//     System.out.println(b); // 123
//     b = Byte.parseByte("1234");
//     System.out.println(b); // NumberFormatException: Value out of range
//     }
// }
// //НО
// class Program
// {
//  public static void main(String[] args) {
//  int[] a = new int[10];
//  double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
//  }
// }

// Считывание данных от пользователя
// import java.util.Scanner;
// public class program {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("name ");
//         String name = iScanner.nextLine();
//         System.out.printf("Приветб %s!", name);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a:");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }


