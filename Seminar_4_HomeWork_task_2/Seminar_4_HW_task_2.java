package Seminar_4_HomeWork_task_2;

import java.util.LinkedList;
import java.util.Queue;

/*
    Реализуйте очередь с помощью Linkedlist со следующими методами:
    enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
    из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Seminar_4_HW_task_2 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Исходная очередь: " + list);

        Enqueue(list);
        Dequeue(list);
        First(list);
    }

    private static void First(Queue<Integer> list) {
        //возвращает первый элемент из очереди, не удаляя
        System.out.println("Результат работы метода first() возвращает первый элемент из очереди, не удаляя его: " + list.peek() + "  " + list);

    }

    private static void Dequeue(Queue<Integer> list) {
        //возвращает первый элемент из очереди и удаляет его
        //list.peek();
        list.remove();
        System.out.println("Результат работы метода dequeue() возвращает первый элемент из очереди и удаляет его: " + list);
    }

    private static void Enqueue(Queue<Integer> list) {
        //помещает элемент в конец очереди
        list.add(6);
        System.out.println("Результат работы метода enqueue() помещает элемент \"6\" в конец очереди: " + list);
    }
}
