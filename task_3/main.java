package task_3;
import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 */

public class main {
    public static void main(String[] args) {
        Scanner iSсanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в программу калькулятор");
        System.out.println("Вам доступны простые математические операции + - * / ");

        System.out.printf("Введите первое число: ");
        double a = iSсanner.nextLong();

        System.out.printf("Введите символ оператора +, -, *, или /: " );
        char operator = iSсanner.next().charAt(0);

        System.out.printf("Введите второе число: ");
        double b = iSсanner.nextLong();

        System.out.println("результат операции : " + result(a, b, operator));

    }

    public static double result (double a, double b, char oper) {
        double res = 0;
        switch (oper) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.printf("Вы ошиблись при вводе оператора!  " );
        }
        return res;
    }
}
