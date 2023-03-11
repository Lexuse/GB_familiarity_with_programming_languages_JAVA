package Seminar_2_task_2;

import java.util.Scanner;

/*
    Напишите метод, который сжимает строку
    например: вход aaaabbbcdd
    выход: a4b3c1d2
 */
public class main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner (System.in);
        StringBuilder resultString = new StringBuilder();
        System.out.print("Введите текст, который нужно сократить, программа работает также сцифрами:  ");
        String userText = iScanner.next();
            if (userText.length() < 2){
                System.out.println("Задача не имеет смысла, так как Вы ввели слишком мало символов");
                return;
            }
        char[] charText = userText.toCharArray();
        int count = 1;
        for (int i = 0; i < charText.length -1 ; i++) {
            if (charText[i] == charText[i + 1]){
                count += 1;
            }
            else{
                resultString.append(charText[i] + String.valueOf(count));
                count = 1;
            }

        }

        System.out.println(resultString.append(charText[charText.length -1] + String.valueOf(count)));
        iScanner.close();

    }
}
