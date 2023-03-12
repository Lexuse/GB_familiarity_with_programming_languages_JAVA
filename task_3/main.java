package task_3;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Реализовать простой калькулятор
 */

public class main {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Seminar_2_HomeWork_task_2.main.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner iSсanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в программу калькулятор");
        System.out.println("Вам доступны простые математические операции + - * / ");

        System.out.printf("Введите первое число: ");
        double a = iSсanner.nextLong();

        System.out.printf("Введите символ оператора +, -, *, или /: " );
        char operator = iSсanner.next().charAt(0);

        System.out.printf("Введите второе число: ");
        double b = iSсanner.nextLong();

        System.out.println("результат операции : " + result(a, b, operator, logger));

    }

    public static double result (double a, double b, char oper, Logger logger) {
        double res = 0;
        switch (oper) {
            case '+':
                res = a + b;
                logger.info("Выполнена операция сложения");
                break;
            case '-':
                res = a - b;
                logger.info("Выполнена операция вычитания");
                break;
            case '*':
                res = a * b;
                logger.info("Выполнена операция умножения");
                break;
            case '/':
                res = a / b;
                logger.info("Выполнена операция днлнния");
                break;
            default:
                System.out.printf("Вы ошиблись при вводе оператора!  " );
                logger.info("Пользователь ошибся при вводе оператора");
        }
        return res;
    }
}
