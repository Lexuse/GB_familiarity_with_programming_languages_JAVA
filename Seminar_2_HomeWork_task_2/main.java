package Seminar_2_HomeWork_task_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
     Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(main.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);


        int[] mas = {423, 523, 123, 75, 163, 312, 9};
        BubbleSort(mas, logger);
        }

        public  static void BubbleSort(int[] mas, Logger logger) {
            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buf;

                        logger.info("Итерация сортировки");
                    }
                }
            }
            System.out.println(Arrays.toString(mas));
        }

    }

