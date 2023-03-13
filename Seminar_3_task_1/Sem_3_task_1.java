package Seminar_3_task_1;

import java.util.*;

/*
    Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
 */
public class Sem_3_task_1 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(10);
        FillList(numList);
        System.out.println(numList);
        //System.out.println(numList.stream().sorted().toList());
        Collections.sort(numList);
        System.out.println(numList);

    }

        public static List<Integer> FillList (List<Integer> list){
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            int r = rand.nextInt(256);
            list.add(r);
        }
        return list;
    }
    }

