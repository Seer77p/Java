// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
//Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях.
//  Поместите их во множество. Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
// То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

package Java.sem.sem6.sem63;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import Java.less.less6.part1.HashSet;

public class Oop {
    public static void main(String[] args) {

        Cat c1 = new Cat(1, "Барсик", 2021, "Двортерьер", 'м');
        Cat c2 = new Cat();
        Cat c3 = new Cat(2, "Марс", 2021, "Двортерьер", 'м');
        Cat c4 = new Cat();
        Cat c5 = new Cat();

        Set<Cat> cats = new java.util.HashSet<>(Arrays.asList(c1, c2, c3, c4, c5));
        Iterator<String> 
        System.out.println(cats);
    }
}