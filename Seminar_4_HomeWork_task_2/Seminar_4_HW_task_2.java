package Seminar_4_HomeWork_task_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
    Реализуйте очередь с помощью Linkedlist со следующими методами:
    enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент
    из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Seminar_4_HW_task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Исходная очередь: " + list);
        System.out.print("Введите целое число, которое нужно поместить в конец очереди  ");
        int userInt = iScanner.nextInt();

        Enqueue(list, userInt);
        System.out.println("Результат работы метода enqueue() помещает элемент" + userInt + " в конец очереди: " + list);
        int dequeue = Dequeue(list);
        System.out.println("Результат работы метода dequeue() возвращает первый элемент из очереди и удаляет его: " + dequeue + " " + list);
        int first = First(list);
        System.out.println("Результат работы метода first() возвращает первый элемент из очереди, не удаляя его: " + first + "  " + list);
    }

    private static  int First(Queue<Integer> list) {
        //возвращает первый элемент из очереди, не удаляя
        return list.peek();

    }

    private static int Dequeue(Queue<Integer> list) {
        //возвращает первый элемент из очереди и удаляет его
        int first =list.peek();
        list.remove();
        return first;
    }

    private static void Enqueue(Queue<Integer> list, int integer) {
        //помещает элемент в конец очереди
        list.add(integer);

    }
}
