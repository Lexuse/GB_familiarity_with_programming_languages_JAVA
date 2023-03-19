package Seminar_5_HomeWork_task_2;

import java.util.*;

/*
    Пусть дан список сотрудников:
    Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
    Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
    Иван Мечников, Петр Петин, Иван Ежов.
    Написать программу, которая найдёт и выведет повторяющиеся имена
    с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Seminar_5_HW_task_2 {
    public static void main(String[] args) {
        String data = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";

        String[] rawData = dataToRawArray(data);
        //for (String value :rawData) System.out.println(value);
        ArrayList<String> nameList = nameToList(rawData);
        //for (String value : nameList) System.out.println(value);
        Map<String,Integer> mapName = getMapName(nameList);
//        for (Object entry: mapName.entrySet()) {
//            System.out.println(entry);
//        }
        System.out.println("Повторяющиеся имена: ");
        nameRepeat(mapName);
        System.out.println("\n");
        System.out.println("Имена, отсортированные по убыванию популярности: ");
        sortName(mapName);

    }

    private static void sortName(Map<String, Integer> mapName) {
        ArrayList<Integer> listCount = new ArrayList<>();
        for(var item: mapName.entrySet()) {
            if (!listCount.contains(item.getValue())) listCount.add(item.getValue());
        }
        listCount.sort(null);
        for (int i = listCount.size()-1; i > -1; i--){
            for (var item: mapName.entrySet()){
                if (Objects.equals(listCount.get(i), item.getValue())) System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
    }

    private static void nameRepeat(Map<String, Integer> mapName) {
        for(var item: mapName.entrySet()){
            if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }

    private static Map<String, Integer> getMapName(ArrayList<String> nameList) {
        Map<String, Integer> mapName = new HashMap<>();
        for (int i = 0; i < nameList.size(); i++) {
            int countName = 1;
            for (int j = i + 1; j < nameList.size(); j++) {
                if (nameList.get(i).equals(nameList.get(j))) countName += 1;
            }
            if (!mapName.containsKey(nameList.get(i))) mapName.put(nameList.get(i), countName);
        }
            return mapName;
    }

    private static ArrayList<String> nameToList(String[] rawData) {
        ArrayList<String> nameToList = new ArrayList<>();
        Collections.addAll(nameToList, rawData);
        //Collections.addAll(nameToList, rawData);
        return nameToList;
    }

    private static String[] dataToRawArray(String data) {
        return data.split(" ");
    }

}