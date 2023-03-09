// 1 . Дана строка sql-запроса "select * from students where ". 
//Сформируйте часть WHERE этого запроса, используя StringBuilder. 
//Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package Java.DZ.dz2;

import java.util.Scanner;

public class dz21 {

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
        data.append('{').append('"').append("name").append(new_person_data(scanner, "Inter name: ")).append(',');
        data.append('"').append("country").append(new_person_data(scanner, "Inter country: ")).append(',');
        data.append('"').append("citi").append(new_person_data(scanner, "Inter citi: ")).append(',');
        data.append('"').append("age").append(new_person_data(scanner, "Inter age: ")).append('}');
        return data.toString();
    }

    public static String select(String json_string) {
        String json = json_string.replace('{', ' ').replace('"', ' ')
                .replace(":", "='").replace("}", "'")
                .replace(" ", "").replace(",", "' and ");
        return json;
    }
    
    public static String isEmpty(String data) {
        String test = data.replaceAll("name='' and", "")
                          .replaceAll("country='' and", "")
                          .replaceAll("citi='' and", "")
                          .replaceAll(" and age=''", "");
        return test;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String person_data = filling_out_data(scanner, "Введите данные человека(латинскими буквами): \n");
        //String person_data1 = filling_out_data(scanner, "Введите данные человека(латинскими буквами): \n");
        System.out.print((person_data) + "\n\n");
        //System.out.print((person_data1)+"\n\n");
        System.out.print(isEmpty(select(person_data))+"\n\n");
        scanner.close();
    }
}
