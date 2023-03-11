package Seminar_2_task_3;

/*
    Напишите метод, который принимает на вход строку (String) и определяет является ли строка
    палиндромом (возвращает boolean значение)
    а роза упала на лапу азора
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки ее на палиндром. Как пример слово \"шалаш\" : ");
        String userText = iScanner.nextLine();

        if (CheckPalindrom(userText)){
            System.out.println(userText + "  - является палиндромом");
        }
        else
            System.out.println("Строка не палиндром!");

    }

        public static boolean CheckPalindrom(String string){
            String x = string.replace(" ", "").toLowerCase(); //убираем все пробелы из строки
            char[] userTextChar = x.toCharArray();
            for (int i = 0; i < x.length()/2; i++) {
                if (userTextChar[i] == userTextChar[userTextChar.length - i -1])
                    continue;
                else
                    return false;
            }
            return true;
        }

    }

