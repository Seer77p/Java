// 3* . Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, 
//создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package Java.DZ.dz2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dz23 {

    public static String new_person_data(Scanner scanner, String message) {
        System.out.print(message);
        StringBuilder npd = new StringBuilder();
        String temp = scanner.nextLine();
        npd.append('"').append(":").append('"').append(temp.toString()).append('"');
        return npd.toString();
    }

    public static String filling_out_data(Scanner scanner, String message) {
        System.out.print(message);
        StringBuilder data = new StringBuilder();
        data.append('{').append('"').append("Фамилия").append(new_person_data(scanner, "Введите фимилию: ")).append(',');
        data.append('"').append("оценка").append(new_person_data(scanner, "Введите оценку: ")).append(',');
        data.append('"').append("Предмет").append(new_person_data(scanner, "Введите предмет: ")).append('}');
        return data.toString();
    }

    public static String select(String json_string) {
        String json = json_string.replace("{", "").replace('"', ' ')
                .replace(":", "").replace("}", "")
                .replace(",", "");
        return json;
    }

    public static String isEmpty(String data) {
        String test = data.replaceAll("Фамилия", "Студент")
                .replaceAll("оценка", "получил")
                .replaceAll("Предмет", "по предмету");
        return test;
    }

    public static void writeFile(String text) {
        try (FileWriter writer = new FileWriter("fileText.txt", true)) {
            writer.append(text + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
  
    public static StringBuilder readFile() {
        BufferedReader reader;
        StringBuilder new_line = new StringBuilder();
        try{reader = new BufferedReader(new FileReader("fileText.txt"));
            String line = reader.readLine();
            while (line != null) {
               new_line.append(line.toString()+"\n");
               line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return new_line;
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество новых студентов: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            writeFile(filling_out_data(scanner,
                    "Введите данные " + (i + 1) + " человека(латинскими буквами): " + "\n").toString());
        }
        StringBuilder new_person_data = readFile();
        System.out.print((new_person_data) + "\n\n");
        System.out.print(isEmpty(select(new_person_data.toString())) + "\n\n");
        scanner.close();
    }
}