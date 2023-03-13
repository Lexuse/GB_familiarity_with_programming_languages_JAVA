package Seminar_3_task_2;

/*
    1. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    2. Вывести названия каждой планеты и количество его повторений в списке
    3. Пройти по списку из планет и удалить повторяющиеся элементы
 */

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        String planets = "Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон, Земля, Нептун, Нептун";
        String[] words = planets.split(", "); //Уберем запятые и создадим массив слов
        List<String>  listPlanets = new ArrayList<>(); //Создаем экземпляр коллекции List

        Collections.addAll(listPlanets, words); //Заполним коллекцию словами из массива не применяя for
          // Для демонстрации оставлю закомиченный код как альтернативу.
/*           for (int i = 0; i < words.length; i++) {
            listPlanets.add(words[i]);
        }
/*
    Воспользуемся тем, что в коллекции Set могут находится только уникальные элементы,
    чтобы избавиться от повторяющихся элементов. Далее посчитаем количество вхождений с помощью
    встроенного метода frequency.
 */
        Set<String> set = new HashSet<>(listPlanets);
        for (String item : set) {
            System.out.println(item + " " + Collections.frequency(listPlanets, item));
        }

        // Вернем коллекцию обратно к типу List, попутно выполнив
        // последнее условие задачи и избавимся от повторяющихся элементов.
        listPlanets = set.stream().distinct().collect(Collectors.toList());
        System.out.println(listPlanets);
    }
}