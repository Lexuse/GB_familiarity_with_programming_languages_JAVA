package Seminar_3_HomeWork_task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Collections.max;
import static java.util.Collections.min;
/*
    Задан целочисленный список ArrayList. Найти минимальное,
    максимальное и среднее из этого списка.
 */
public class Seminar_3_HW_task_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int listSize = 20;
        FillList(listSize, list);
        System.out.println("Созданный List: " + list);
        int maxInList = max(list);
        int minInList = min(list);
        int sumValue = 0;
        for (int item : list){
            sumValue += item;
        }
        float average = (float)sumValue/list.size();
        System.out.printf("Максимальный элемент %s\n", maxInList);
        System.out.printf("Минимальный элемент %s\n", minInList);
        System.out.printf("Сумма элементов %s\n", sumValue);
        System.out.printf("Среднее арифметическое %s\n", average);

    }

    private static void FillList(int listSize, List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < listSize; i++) {
            int val = rand.nextInt(-300, 300);
            list.add(val);
        }
    }
}
