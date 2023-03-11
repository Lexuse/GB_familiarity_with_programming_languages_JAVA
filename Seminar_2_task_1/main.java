package Seminar_2_task_1;

import java.util.Scanner;

/*
    Задание N1
    Дано четное число N(>0) и символы C1 и C2.
    Написать метод, который вернет строку длины N, которая
    сотоит из чередующихся символов C1 и C2, начиная с C1
 */
public class main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное число больше 0");
        int n = iScanner.nextInt();
        if (n%2 != 0 && n < 0){
            System.out.println("Вас просили ввести число, которое больше 0 и четное");
            return;
        }

        System.out.println("Введите первый симовл C1");
        String c1 = iScanner.next();
        System.out.println("Введите второй символ C2");
        String c2 = iScanner.next();
        if (c1.length() != 1 || c2.length() !=1){
            System.out.println("Вас просили ввести один символ, а не несколько!");
            return;
        }
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < n/2; i++) { //так как символы вводятся по 2 то нам не нужна полная длина n
            resultString = resultString.append(c1 + c2);
        }

        System.out.println("Результирующая строка:  ");
        System.out.println(resultString);
        iScanner.close();
    }
}
