// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

package Java.sem.sem6.sem61.sem63;

import java.util.Objects;

public class Cat {
    int id;
    String name;
    int year;
    String breed;
    char sex;

    public Cat() {
        id = 3;
        name = "Мурзик";
        year = 2000;
        breed = "Перс";
        sex = 'м';
    }

    public Cat(int id, String name, int year, String breed, char sex) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.breed = breed;
        this.sex = sex;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%d %s %d %s %s", id, name, year, breed, sex);
    }

    @Override
    public boolean equals(Object object) {
        // TODO Auto-generated method stub
        Cat obj = (Cat) object;
        return this.id == obj.id && this.name.equals(obj.name) && this.year == obj.year
                && (this.breed).equals(obj.breed) && this.sex == obj.sex;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash();
    }
}


