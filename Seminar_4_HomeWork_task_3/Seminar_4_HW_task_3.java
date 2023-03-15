package Seminar_4_HomeWork_task_3;

import java.util.*;


/*
    Реализовать простой калькулятор с возможностью отмены последней операции
 */
public class Seminar_4_HW_task_3 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в программу калькулятор \nВам доступны простые математические операции + - * / с ЦЕЛЫМИ числами. Не пытайтесь делить на ноль :)  \nДля завершения программы введите exit");
        Scanner iScanner = new Scanner(System.in);
        Deque<Integer> listInt = new LinkedList<>();
        Deque<String> listString = new LinkedList<>();
        String string = "";
        while (!(string.equals("exit"))){
            System.out.print("Введите первое число: ");
            string = iScanner.next();
            int a = Integer.parseInt(string);
            listInt.add(a);
            System.out.print("Вы ввели число: " + a + " напишите abort если ошиблись или любой символ для продолжения: ");
            string = iScanner.next();
            if (string.equals("abort")) {
                DeleteLastIndexInINTList(listInt);
                System.out.print("Введите первое число повторно: ");
                string = iScanner.next();
                a = Integer.parseInt(string);
                listInt.add(a);
            }

            System.out.print("Введите символ оператора +, -, *, или /: " );
            string = iScanner.next();
            listString.add(string);
            System.out.print("Вы ввели оператор: " + string + " напишите abort если ошиблись или любой символ для продолжения: ");
            string = iScanner.next();
            if (string.equals("abort")) {
                DeleteLastIndexInStringList(listString);
                string = iScanner.next();
                listString.add(string);
            }


            System.out.print("Введите второе число: ");
            string = iScanner.next();
            int b = Integer.parseInt(string);
            listInt.add(b);
            System.out.print("Вы ввели число: " + b + " напишите abort если ошиблись или любой символ для продолжения: ");
            string = iScanner.next();
            if (string.equals("abort")) {
                DeleteLastIndexInINTList(listInt);
                string = iScanner.next();
                b = Integer.parseInt(string);
                listInt.add(b);
            }

            System.out.println("результат операции : " + Result(listInt, listString ));
            listInt.clear();
            listString.clear();

        }
    }

    public static double Result (Deque<Integer> listInt, Deque<String> listString) {
        double res = 0;
        String operator = listString.peek();
        int a = listInt.peek();
        int b = listInt.peekLast();
        switch (Objects.requireNonNull(operator)) {
            case "+" -> res = a + b;
            case "-" -> res = a - b;
            case "*" -> res = a * b;
            case "/" -> res = a / b;
            default -> System.out.print("Вы ошиблись при вводе оператора!  ");
        }
        return res;
    }

    private static void DeleteLastIndexInINTList(Deque<Integer> list) {
        int indexOfLast = list.size() -1;
        if (!(list.size() == 0)) {
            list.remove(indexOfLast);
        }
    }

    private static void DeleteLastIndexInStringList(Queue<String> list) {
        int indexOfLast = list.size() -1;
        if (!(list.size() == 0)) {
            list.remove(indexOfLast);
        }
    }
}
