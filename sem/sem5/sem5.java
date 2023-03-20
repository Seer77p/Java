// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678


package Java.sem.sem5;

import java.util.HashMap;
import java.util.Map.Entry;

public class sem5 {
    public static void main(String[] args) {
        HashMap<Integer, String> emp = new HashMap<Integer, String>();
        emp.put(123456, "Иванов");
        emp.put(123457, "Сидоров");
        emp.put(123458, "Иванов");
        emp.put(123459, "Петрова");
        emp.put(123455, "Петров");
        emp.put(123454, "Иванов");
System.out.println(emp);
        emp.put(123458, "Сидоров"+"hello");
        System.out.println(emp);
        for (Entry <Integer, String> pair : emp.entrySet()) {
            if(pair.getValue().equals("Иванов"))
                System.out.println(String.format("%d %s", pair.getKey(), pair.getValue()));
        }

    
    
    
    }
}
