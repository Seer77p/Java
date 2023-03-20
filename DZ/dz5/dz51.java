// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
package Java.DZ.dz5;

import java.util.HashMap;
import java.util.Scanner;

public class dz51 {
    public static HashMap<String, String> adding_contact(HashMap<String, String> tel, Scanner scan, String message) {
        System.out.print(message);
        System.out.println("Введите ФИО: ");
        String name = scan.next();
        System.out.println("Введите телефон: ");
        String telefon = scan.next();
        tel.put(name, telefon);
        return tel;
    }

    public static HashMap<String, String> adding_tele(HashMap<String, String> tel, Scanner scan, String message) {
        System.out.print(message);
        System.out.println("Введите ФИО для которого надо добавить номер: ");
        String name = scan.next();
        if (tel.containsKey(name)) {
            System.out.print("Выбранный контакт "+name+" содержит номер телефона: "+tel.get(name)+"\nДобавить еще номер телефона(да:1, нет:2)? ");
            int new_tel = scan.nextInt();
            if (new_tel == 1) {
                System.out.print("Введите дополнительный номер: ");
                tel.put(name, tel.get(name)+" "+scan.next());
                System.out.print("Номера контакта "+name+" "+tel.get(name)+"\n");
            }
            else {
                System.out.println("Такого контакта нет! ");
            }
        }
        else {
            System.out.println("Такого контакта нет! ");
        }
        return tel;
    }

    public static HashMap<String, String> menu(HashMap<String, String> tel, int val, Scanner scan) {
        switch (val) {
            case 1:
                System.out.println("Введите ФИО: ");
                String name = scan.next();
                if (tel.containsKey(name)) {
                    System.out.print("Искомый контакт: "+tel.get(name)+"\n");
                }
                else {
                    System.out.println("Такого контакта нет! ");
                }
                break;
            case 2:
                tel = adding_contact(tel, scan, "Введите данные человека(латинскими буквами): \n");
                break;
            case 3:
                tel = adding_tele(tel, scan, "Добавление дополнительного телефонного номера!\n");
                break;
            case 4:
                break;
        }
        return tel;
    }

    public static void main(String[] args) {
        HashMap<String, String> tele = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int valuepos = 0;
        while (valuepos != 4) {
            System.out.println("\nВыберите пункт меню: \n" +"Найти контакт по ФИО                   : 1\n" + "Добавить контакт(латинскими ФИО + тел) : 2\n"
            +  "Добавить телефон для ФИО               : 3\n"
            + "Выйти                                  : 4\n");
            valuepos = scan.nextInt(); 
            tele = menu(tele, valuepos, scan);
            System.out.println("Телефонная книга: "+tele);
    }
    }
}
