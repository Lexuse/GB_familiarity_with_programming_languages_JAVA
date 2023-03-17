package Seminar_5_HomeWork_task_1;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.setOut;

/*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Seminar_5_HW_task_1 {
    public static void main(String[] args) {
        int helloNumb = 0;
        menu(helloNumb);
    }



    public static void menu (int helloNumb) {

        if (helloNumb == 0){
            System.out.println("Добро пожаловать в телефонный справочник");
            helloNumb = helloNumb + 1;
        }
        String menu = "Введите команду для работы с телефонной книгой\n" +
                "1. - начать заполнять книгу\n" +
                "2. - просмотр книги\n" +
                "3. - завершить работу программы";

        System.out.println(menu);
        Map<Integer, String> bookMap = new HashMap<>();
        Scanner iScanner = new Scanner(in);
        //String userData = "";
        boolean isQuit = false;
        while (!isQuit) {
            byte function = iScanner.nextByte();
            switch (function) {
                case 1:
                    AddData(bookMap); //userData);
                    break;
                case 2:
                    PrintBook(bookMap);
                    // System.out.println(bookMap);
                    break;
                case 3:
                    isQuit = true;
                    break;
                default:
                    System.out.println("вы ввели несуществующий пункт меню");
                    menu(1);
            }
        }
    }
    public static void restart () {
        menu(1);
    }

    public static Map AddData (Map map) {        //String userData){
        Scanner iScanner = new Scanner(in);
        List<String> wordsMass = new ArrayList<>();
        List<Integer> phoneNumbers = new ArrayList<>();
        System.out.println("Вы находитесь в режиме добавления данных в книгу. Для выхода в меню напишите exit \nВведите Имя абонента и его телефоны через запятую:");
        String input = iScanner.nextLine();
        input = iScanner.next();
        int numberTemp = 0;
        String fioTemp = "";
        String[] wordsToSplit = input.split(",");
        for (int i = 0; i < wordsToSplit.length; i++) {
                try {
                    int num = Integer.parseInt(wordsToSplit[i]);
                    phoneNumbers.add(num);
                } catch (NumberFormatException e) {
                    //System.out.println("NumberFormatException: " + e.getMessage());
                    wordsMass.add(wordsToSplit[i]);
                }
                map.put(fioTemp, numberTemp);
            }
            restart();
        return map;
    }


        private static void PrintBook (Map bookMap){
            if (!(bookMap.isEmpty())) {
                System.out.println(bookMap);
            }
            else {
                System.out.println("Книга абосолютна пуста. Сначала добавьте данные");
            }
            restart();
        }
    }



