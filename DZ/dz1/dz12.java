package Java.DZ.dz1;

public class dz12 {
    public static void printing_prime_numbers() {
        int size = 1000;
        System.out.print("2 " + "3 " + "5 " + "7");
        for (int i = 7; i < size; i++) {
            if (i % 2 == 0)
                ;
            else if (i % 3 == 0)
                ;
            else if (i % 5 == 0)
                ;
            else if (i % 7 == 0)
                ;
            else
                System.out.print(" " + i);
        }
    }
    public static void main(String[] args) {
        printing_prime_numbers();
        System.out.println();
        }
}
