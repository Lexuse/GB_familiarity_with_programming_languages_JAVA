package Seminar_6_HomeWork_task_1;

import java.util.*;

public class Seminar_6_HW_task_1 {
    static int setLaptopSize = 10;
    static byte choice;
    static Scanner iScanner = new Scanner(System.in);
    static Map<String, String> mapString = new HashMap<>();
    static Laptop[] laptops = new Laptop[setLaptopSize];
    static String menu;

    public static void main(String[] args) {
        for (int i = 0; i < laptops.length; i++) {
            laptops[i] = Laptop_generator.createLaptop();
            //System.out.println(laptops[i].info());
        }
        System.out.println("Добро пожаловать в магазин ноутбуков. " +
                "\nв данный момент для выбора доступно " + laptops.length + " ноутбуков");
                menu = """
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
                case 1 -> Choice("Выберите один из вариантов установленного процессора:", "cpu");
                case 2 -> Choice("Выберите татктовую частоту процессора","frequency");
                case 3 -> Choice("Выберите количество ядер процессора","core");
                case 4 -> Choice("Выберите объем оперативной памяти","ram");
                case 5 -> Choice("Выберите объем жесткого диска","hdd");
                case 6 -> Choice("Выберите тип матрицы","screen");
                case 7 -> Choice("Выберите предустановленную операционную систему","os");
                case 8 -> Choice("Выберите материал корпуса ноутбука", "materials");
                case 9 -> Choice("Выберите желаемый вес устройства","weight");
                default -> {
                    System.out.println("вы ввели несуществующий пункт меню, повторите ввод");
                }
            }
        }
    }


    public static void Choice(String message, String value){
        System.out.println(message);
        if (value.equals("cpu")){
            for (int i = 0; i < Laptop_generator.cpu.length; i++) System.out.println(i + ": " + Laptop_generator.cpu[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.cpu[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("frequency")){
            for (int i = 0; i < Laptop_generator.frequency.length; i++) System.out.println(i + ": " + Laptop_generator.frequency[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.frequency[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("core")){
            for (int i = 0; i < Laptop_generator.core.length; i++) System.out.println(i + ": " + Laptop_generator.core[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.core[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("ram")){
            for (int i = 0; i < Laptop_generator.ram.length; i++) System.out.println(i + ": " + Laptop_generator.ram[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.ram[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("hdd")){
            for (int i = 0; i < Laptop_generator.hdd.length; i++) System.out.println(i + ": " + Laptop_generator.hdd[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.hdd[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("screen")){
            for (int i = 0; i < Laptop_generator.screen.length; i++) System.out.println(i + ": " + Laptop_generator.screen[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.screen[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("os")){
            for (int i = 0; i < Laptop_generator.os.length; i++) System.out.println(i + ": " + Laptop_generator.os[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.os[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("materials")){
            for (int i = 0; i < Laptop_generator.materials.length; i++) System.out.println(i + ": " + Laptop_generator.materials[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.materials[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        if (value.equals("weight")){
            for (int i = 0; i < Laptop_generator.weight.length; i++) System.out.println(i + ": " + Laptop_generator.weight[i]);
            choice = choiceValue();
            if(choice == 0 || choice == 1 || choice == 2) {
                    mapString.put(value, Laptop_generator.weight[choice]);
            }
            else {
                Retry();
                choiceValue();
            }
        }
        returnSetLaptop(mapString);
    }

    private static void Retry() {
        System.out.println("Вы ввели несуществующий пункт выбора заново уточните критерий сортировки");
    }

    private static void returnSetLaptop(Map<String, String> mapString) {
        List<Laptop> sortedLaptops = new ArrayList<>();
        String value = "";
        for (Map.Entry entry : mapString.entrySet()) {
                value = entry.getValue().toString();
        }
        for (Laptop item : laptops) {
            if (item.cpu.equals(value)) sortedLaptops.add(item);
            if (item.frequency.equals(value)) sortedLaptops.add(item);
            if (item.core.equals(value)) sortedLaptops.add(item);
            if (item.ram.equals(value)) sortedLaptops.add(item);
            if (item.hdd.equals(value)) sortedLaptops.add(item);
            if (item.screen.equals(value)) sortedLaptops.add(item);
            if (item.os.equals(value)) sortedLaptops.add(item);
            if (item.materials.equals(value)) sortedLaptops.add(item);
            if (item.weight.equals(value)) sortedLaptops.add(item);
        }
        System.out.println("по вашему запросу подобрано " + sortedLaptops.size() + " ноутбуков");
        for (Laptop laptop : sortedLaptops) {
            System.out.println(laptop.info());
        }
        System.out.println(menu);
    }

    private static byte choiceValue() {
        try {
            choice = Byte.parseByte(iScanner.next());
        }
        catch (Exception e){
            System.out.println("Пункты меню выбора представлены числами а не символами! \n Повторите выбор");
            choiceValue();
        }
        return choice;
    }
}
