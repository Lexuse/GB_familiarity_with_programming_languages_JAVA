package Seminar_3_task_3;

/*
    Создать список типа ArrayList<String>
    Поместить в него как строки, так и целые числа.
    Пройти по списку, найти и удалить целые числа.
 */

import java.util.*;

public class sem_3_task_3 {
    public static void main(String[] args) {
        String text = "Диван, 2, Одевать, Семнадцать, 1.23, 343, Солнце, 6, Яблоко, 55.3";
        List<String> list = new ArrayList<>();
        String[] words = text.split(", "); //преобразуем строку в массив, попутно удаляя пробелы
        Collections.addAll(list, words); //Заполним List массивом

        Iterator<String> iterator = list.iterator(); //создаем итератор
        while (iterator.hasNext()) { //до тех пор, пока в списке есть элементы
            String nextString = iterator.next(); //временная переменная для хранения следующего в List значения
            if(TryParseToInt(nextString)){ //на основе ответа метода, пытающегося преобразовать строку в целое число принимаем решение о удаление ячейки
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    public static boolean TryParseToInt(String string){
    Boolean isInt = true;
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            isInt = false;
        }
        return isInt;
    }

}

