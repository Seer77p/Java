// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package Java.DZ.dz5;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class dz52 {
    public static java.util.HashMap<String, Integer> adding_contact(TreeMap<String, String> tree) {
        java.util.HashMap<String, Integer> summ = new java.util.HashMap<>();
        for (Map.Entry<String, String> entry : tree.entrySet()) {
            if (summ.containsKey(entry.getValue()))
                summ.put(entry.getValue(), summ.get(entry.getValue()) + 1);
            else
                summ.put(entry.getValue(), 1);
        }
        return summ;
    }
   
    public static LinkedHashMap<String, Integer> sorting_contact(HashMap<String, Integer> name) {
        LinkedHashMap<String, Integer> sort = new LinkedHashMap<>();
       while(Collections.max(name.values())!=0){
        for (Entry<String, Integer> pair : name.entrySet()) {
            if (pair.getValue().equals(Collections.max(name.values()))) {
                sort.put(pair.getKey(), pair.getValue());
                name.put(pair.getKey(), 0);
            }
        }
    }
    return sort;
    }
    public static void main(String[] args) {
        java.util.TreeMap<String, String> tree = new java.util.TreeMap<>();
        tree.put("Иванов", "Иван");
        tree.put("Петрова", "Светлана");
        tree.put("Белова", "Кристина");
        tree.put("Мусина", "Анна");
        tree.put("Крутова", "Анна");
        tree.put("Юрин", "Иван");
        tree.put("Лыков", "Петр");
        tree.put("Чернов", "Павел");
        tree.put("Чернышов", "Петр");
        tree.put("Федорова", "Мария");
        tree.put("Светлова", "Марина");
        tree.put("Савина", "Мария");
        tree.put("Рыкова", "Мария");
        tree.put("Луговая", "Марина");
        tree.put("Владимирова", "Анна");
        tree.put("Мечников", "Иван");
        tree.put("Петин", "Петр");
        tree.put("Ежов", "Иван");
        System.out.println("\nКоличество повторений имен в списке: "+adding_contact(tree)+"\n");
        System.out.println("Количество повторений имен поубыванию: "+sorting_contact(adding_contact(tree))+"\n");
    }
}
