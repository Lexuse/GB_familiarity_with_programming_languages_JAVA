package Seminar_4_task_0;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
    1) Замерьте время, за которое в Arraylist добавятся 10000 элементов.
    2) Замерьте время, за которое в Linkedlist добавятся 10000 элементов.
    Сравните с предыдущим.
 */
public class Seminar_4_task_0 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        long startTimeArray = System.nanoTime();
        for (int i = 0; i < 10_000; i++) arrayList.add(random.nextInt());
        long endtTimeArray = System.nanoTime();
        long startTimeLinked = System.nanoTime();
        for (int i = 0; i < 10_000; i++) linkedList.add(random.nextInt());
        long endTimeLinked = System.nanoTime();

        System.out.println("Время заполнения ArrayList = " + (endtTimeArray - startTimeArray));
        System.out.println("Время заполнения LinkedList = " + (endTimeLinked - startTimeLinked));


    }
}
