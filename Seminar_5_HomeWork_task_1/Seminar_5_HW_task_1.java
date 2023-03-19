package Seminar_5_HomeWork_task_1;


import java.util.*;
import static java.lang.System.in;

/*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Seminar_5_HW_task_1 {
    public static void main(String[] args) {
        int helloNumb = 0;
        Map<String, String> map = new HashMap<>();
        menu(helloNumb, map);
    }
    public static void menu (int helloNumb, Map<String, String> map) {

        if (helloNumb == 0){
            System.out.println("Добро пожаловать в телефонный справочник");
        }
        String menu = """
                Введите команду для работы с телефонной книгой
                1. - начать заполнять книгу
                2. - просмотр книги
                3. - завершить работу программы""";

        System.out.println(menu);
        Scanner iScanner = new Scanner(in);
        boolean isQuit = false;
        while (!isQuit) {
            byte function = iScanner.nextByte();
            switch (function) {
                case 1 -> AddData(map);
                case 2 -> PrintBook(map);
                case 3 ->isQuit = true;
                default -> {
                    System.out.println("вы ввели несуществующий пункт меню");
                    restart(map);
                }
            }
        }
    }
    public static void restart (Map<String, String> map)
    {
        menu(1, map);
    }

    public static void AddData (Map<String, String> map) {
        Scanner iScanner = new Scanner(in);
        System.out.println("Вы находитесь в режиме добавления данных в книгу. Для выхода в меню напишите exit \nВведите Имя абонента и его телефоны через запятую:");
        String input = iScanner.nextLine();
        String phoneToString = "";
        String[] wordsToSplit = input.split(",");
        String fio = wordsToSplit[0];

        for (int i = 1; i < wordsToSplit.length; i++) {
            phoneToString += " " + (wordsToSplit[i] + ";");
        }
        map.put(fio, phoneToString);
        restart(map);
    }
        private static void PrintBook (Map<String, String> map){
            System.out.println("Телефонная книга содержт " + map.size() + " записей:");
            if (!map.isEmpty()) {
                for (Object entry: map.entrySet()) {
                    System.out.println(entry);
                }
                System.out.println("\n");

            }
            else {
                System.out.println("Книга абосолютна пуста. Сначала добавьте данные");
            }
            restart(map);
         }
    }



