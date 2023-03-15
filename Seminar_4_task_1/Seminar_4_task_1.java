package Seminar_4_task_1;

/*
    Реализовать консольное приложение, которое:
    1. Принимает от пользователя строку вида text~num
    2. Нужно рассплитить строку по~, сохранить text в связный список на позицию num.
    3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Seminar_4_task_1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>() {
        };
        Scanner iscanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите строку и ее номер, отделив номер от строки через тильду \"~\": ");
        System.out.println("Чтобы удалить эемент по индексу, напишите \"print ~ номер \" : ");
        String userInput = iscanner.nextLine().replace(" ", ""); //нужно удалить пробелы
        while (!userInput.contains("~")){
            System.out.println("Вы не отделили номер строки заком \"~\", повторите ввод! ");
            userInput = iscanner.nextLine();
        }

        String[] words = userInput.split("~");
        int indexPosition =  Integer.parseInt(words[1]);

        for (int i = 0; i < indexPosition; i++) {
            linkedList.add(null);
        }
        linkedList.add(indexPosition, words[0]);
        System.out.println("List создан, значение лежит по указанному индексу: " + linkedList);
        if (words[0].equals("print")) {
            linkedList.remove(indexPosition); //RemoveElementsAtIndex(indexPosition, linkedList);
            System.out.println("List после удаления строки по индексу:             " + linkedList);
        }
        iscanner.close();
    }
}