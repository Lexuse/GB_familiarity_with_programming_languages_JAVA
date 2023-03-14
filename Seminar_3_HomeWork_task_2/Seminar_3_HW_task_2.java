package Seminar_3_HomeWork_task_2;

/*
    Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Seminar_3_HW_task_2 {
    public static void main(String[] args) {
        int[] m1 = new int[] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        List<Integer> list = new ArrayList<>();
        //       Collections.addAll(list, m1);
        for (int j : m1) { //Заполним список из данного массива
            list.add(j);

        }
        System.out.println("Созданный список: " + list.toString());

        Iterator<Integer> iterator = list.iterator();

        int i = 0;
        while (iterator.hasNext()){
            int temp = iterator.next();
            if((temp % 2) == 0){
               iterator.remove();
            }
            else i++;
        }
        System.out.println("Список после удаления четных числел: " + list.toString());
    }
}
