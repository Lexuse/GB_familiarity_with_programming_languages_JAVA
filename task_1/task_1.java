package task_1;
import java.util.Scanner;

/**
  Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class task_1 {

    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);

        int from = 1;
        System.out.printf("Введите число: ");
        int to = iscanner.nextInt();

        System.out.println("Сумма чисел от 1го до " + to + " равна: " + sumInRange(from, to));
        System.out.println("Произведение чисел от 1го до " + to + " равна: " + factInRange(from, to));
    }
    public static long sumInRange(long from, long to) {
        long number = 0;
        for (long i = from; i<to; i++){
             number += i;
        }
        return number;
    }

    public static long factInRange(long from, long to) {
        long number = 1;
        for (long i = from; i<to; i++){
            number *= i;
        }
        return number;
    }


}