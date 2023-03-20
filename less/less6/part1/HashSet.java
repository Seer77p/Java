package Java.less.less6.part1;

import java.util.Arrays;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();
        set.add(1); set.add(12); set.add(123);//Добавление элемента в коллекцию
        set.add(1234);
        set.add(1234);
        System.out.println(set.isEmpty());//Проверка на пустоту
        System.out.println(set.contains(12)); // true //Проверка на включение в коллекцию
        set.add(null);
        System.out.println(set.size()); // 5 //Возвращает количество элементов в коллекции
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12); //Удаляет элемент колекции
        for (var item : set) {
            System.out.println(item); // null 1 1234 123
        }
        set.clear();//Удаление всех элементов
        
        System.out.println(set); // []

        // addAll(Coll) - Объединение множест
        // retainAll(Coll) - пересечение множеств
        // removeAll(Coll) - Разность множеств
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
        // как синоним множества
        // first()
        // last()
        // headSet(E) печать до 4 элемента
        // tailSet(E) печать с 4 элемента
        // subSet(E1,E2) печать 3 и 5 элемента

    

    }
}
