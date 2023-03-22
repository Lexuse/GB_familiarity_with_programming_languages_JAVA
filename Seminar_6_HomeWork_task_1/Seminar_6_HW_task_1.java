package Seminar_6_HomeWork_task_1;

import java.util.Scanner;

public class Seminar_6_HW_task_1 {
    public static void main(String[] args) {
        int setLaptomSize = 10;
        Scanner iScanner = new Scanner(System.in);
        Laptop[] laptops = new Laptop[setLaptomSize];

        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = Laptop_generator.createLaptop();
            //System.out.println(laptops[i].info());
        }

        System.out.println("Добро пожаловать в магазин ноутбуков. " +
                "\nв данный момент для выбора доступно " + laptops.length + " ноутбуков");
        String menu = """
                Выберите критерий для сортировки товара
                1. - Частота процессора
                2. - Количество ядер процессора
                3. - Объем оперативной памяти
                4. - Объем жесткого диска
                5. - Технология производства дисплея
                6. - Операционная система
                7. - Материал корпуса
                8. - Вес устройства""";
        System.out.println(menu);
    }

}
