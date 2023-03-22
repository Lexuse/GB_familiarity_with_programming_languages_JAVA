package Seminar_6_HomeWork_task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seminar_6_HW_task_1 {
    static int setLaptomSize = 10;
    static Scanner iScanner = new Scanner(System.in);
    static Map<String, String> mapString = new HashMap<>();
    static Map<String, Integer> mapInt = new HashMap<>();
    static Map<String, Float> mapFloat = new HashMap<>();
    static Laptop[] laptops = new Laptop[setLaptomSize];


    public static void main(String[] args) {
        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = Laptop_generator.createLaptop();
            //System.out.println(laptops[i].info());
        }
        System.out.println("Добро пожаловать в магазин ноутбуков. " +
                "\nв данный момент для выбора доступно " + laptops.length + " ноутбуков");
        String menu = """
                Выберите критерий для сортировки товара
                1. - Процессор
                2. - Частота процессора
                3. - Количество ядер процессора
                4. - Объем оперативной памяти
                5. - Объем жесткого диска
                6. - Технология производства дисплея
                7. - Операционная система
                8. - Материал корпуса
                9. - Вес устройства""";

        System.out.println(menu);
        boolean isQuit = false;
        while (!isQuit) {
            byte function = iScanner.nextByte();
            switch (function) {
                case 1 -> cpuChoise();
                case 2 -> frequencyChoise();
                case 3 -> coreChoise();
                case 4 -> ramChoise();
                case 5 -> hddChoise();
                case 6 -> screenChoise();
                case 7 -> osChoise();
                case 8 -> materialsChoise();
                case 9 -> weightChoise();
                default -> {
                    System.out.println("вы ввели несуществующий пункт меню");
                }
            }
        }

    }

    private static void weightChoise() {

    }

    private static void materialsChoise() {

    }

    private static void osChoise() {

    }

    private static void screenChoise() {

    }

    private static void hddChoise() {

    }

    private static void ramChoise() {

    }

    private static void coreChoise() {

    }

    private static void frequencyChoise() {

    }

    public static void cpuChoise(){
        System.out.println("Выберите один из вариантов установленного процессора");
        byte choise = 0;
        String cpu = "cpu";
        for (int i = 0; i < Laptop_generator.cpu.length; i++) System.out.println(i + ":" + Laptop_generator.cpu[i]);
        try {
            choise = Byte.parseByte(iScanner.next());
        }
        catch (Exception e){
            System.out.println("Пункты меню представлены числами а не символами!");
            cpuChoise();
        }

        if(choise == 0 || choise == 1 || choise == 2) {
            mapString.put(cpu, Laptop_generator.cpu[choise]);
        }
        else {
            System.out.println("Вы ввели несуществующий пункт выбора");
            cpuChoise();
        }
        for (Object entry: mapString.entrySet()) {
            System.out.println(entry);
        }
    }
}
