package Java.less.less5.less5;

import java.util.*;
import java.util.HashMap;

public class HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); //Произвести добавление, если ключ не найден
        db.put(2, "два");//добавляет пару, если или изменить значение, если ключ есть
        db.put(3, "три");//добавляет пару, если или изменить значение, если ключ есть
        System.out.println(db); //{1=один, 2=два, 3=три}

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue()); //[1: один]  [2: два] [3: три]
        }
    }
}
