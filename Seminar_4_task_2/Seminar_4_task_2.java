package Seminar_4_task_2;

/*
    Реализовать консольное приложение, которое:
    1. Принимает от пользователя и "запоминает" строки.
    2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Seminar_4_task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Для завершения программы введите \"exit\" ");
        System.out.println("Для инвертирования списка введите \"print\" ");
        System.out.println("Для удаления последнего добавленного элемента введлите \"revert\" ");



        String userInput = "";
        while (!userInput.equals("exit")){
            System.out.print("Продолжайте заполнять, введите следующий текст или одну из комманд для управления: ");
            userInput = iScanner.nextLine();
            if (!(userInput.equals("print")) && !(userInput.equals("revert")))list.add(userInput);
            if (userInput.equals("print")) RevertList(list);
            if (userInput.equals("revert")) DeleteLastIndexInList(list);
            if (!(userInput.equals("print")) && !(userInput.equals("revert"))) System.out.println("Просмотр созданного списка: " + list);
        }
    }

    private static void DeleteLastIndexInList(LinkedList<String> list) {
        int indexOfLast = list.size() -1;
        if (!(list.size() == 1)) {
            list.remove(indexOfLast);
            System.out.println("Предыдущий добавленный текст был удален: " + list);
            if (list.size() == 0) System.out.println("Остановитесь, Вы уже адили все имещиеся данные :) ");
        }
    }

    private static void RevertList(LinkedList<String> list) {
        Collections.reverse(list);
        System.out.println("Связный список был инвертирован: " + list);
    }
}
