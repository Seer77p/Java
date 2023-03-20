package Java.less.less5;


import java.util.Map;

import javax.swing.JOptionPane;

public class HashMap {
  
    public static void main(String[] args) {
        Map<Integer, String> db = new java.util.HashMap<>();
        db.putIfAbsent(1, "один"); //Произвести добавление, если ключ не найден
        db.put(2, "два"); //добавляет пару, если или изменить значение, если ключ есть
        db.put(null, "!null"); //добавляет нул
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));// null //получение значения по указанному ключу
        db.remove(null); //удаляет пару по указанному ключу
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true //проверяет наличие значения
        System.out.println(db.containsValue(1)); // false  
        System.out.println(db.containsKey("один")); // false //проверка наличия ключа
        System.out.println(db.containsKey(1)); // true 
        System.out.println(db.keySet()); //возвращает множество ключей [1, 2]
        System.out.println(db.values()); //Возвращает набор значений [один, два]
        JOptionPane.showMessageDialog(null, "Hello World!!!!!!");
    }
}
