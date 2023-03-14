//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

package Java.DZ.dz4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class dz42 {

    public static void enQueue(Queue<Integer> que) {
        Random random = new Random();
        int elem = random.nextInt(1, 100);
        que.add(elem);
    }

    public static void deQueue(Queue<Integer> que) {
        que.poll();
    }

public static void first(Queue<Integer> que) {
    System.out.println("Первый елемент очереди: "+que.peek()+" удаление не требуется\n");
}
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>();
        enQueue(que);
        enQueue(que);
        enQueue(que);
        System.out.println("\nДобавили элементы, содержание очереди" + que);
        enQueue(que);
        enQueue(que);
        System.out.println("\nДобавили элементы, содержание очереди" + que);
        deQueue(que);
        System.out.println("\nВозврат и удаление элемента, содержание очереди" + que + "\n");
        first(que);
    }
}
