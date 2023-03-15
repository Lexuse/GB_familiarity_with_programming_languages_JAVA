package Seminar_4_HomeWork_task_1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/*
    Пусть дан Linkedlist с несколькими элементами. Реализуйте метод, который вернет "перевернутый" список.
 */
public class Seminar_4_HW_task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        int listSize = 10;
        for (int i = 0; i < listSize; i++) {
            list.add(rand.nextInt(-10, 10));
        }
        System.out.println("Список был сформирован в следующем виде: " + list);
        RevertList(list);


    }
    private static void RevertList(LinkedList<Integer> list) {
        Collections.reverse(list);
        System.out.println("Связный список был инвертирован:         " + list);
    }
}
