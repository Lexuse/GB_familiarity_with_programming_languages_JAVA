package Seminar_6_HomeWork_task_1;

import java.util.Random;

public class Laptop_generator {

    public static void main(String[] args) {

        Laptop exemplyar = createLaptop();
        System.out.println(exemplyar.info());
    }

    static private int model;
    static public String[] cpu = new String[] {"INTEL", "AMD", "APPLE" };
    static public String[] frequency = new String[] {"3.3", "3.5", "4.5" };
    static public String[] core = new String[] {"4", "6", "12"};
    static public String[] ram = new String[] {"4", "8", "16"};
    static private final String[] videoCard = new String[] {"Nvidia GeForce RTX 3080","GeForce GT 415","Radeon HD 4225"};
    static public String[] hdd = new String[] {"120", "250", "920"};
    static public String[] screen = new String[] {"OLED","IPS","LED"};
    static public String[] os = new String[] {"Windows","Linux","MacOs"};
    static public String[] materials = new String[] {"Plastic","Metal","Hybrid"};
    static public String[] weight = new String[] {"1.2", "2.1", "3.6"};

    public static Laptop createLaptop (){
        int model0 = generateModel();
        String cpuO = cpu[randGen()];
        String frequencyO = frequency[randGen()];
        String coreO = core[randGen()];
        String ramO = ram[randGen()];
        String videCardO = videoCard[randGen()];
        String hddO = hdd[randGen()];
        String screenO = screen[randGen()];
        String osO = os[randGen()];
        String materialsO = materials[randGen()];
        String weightO = weight[randGen()];
        Laptop exempLaptop = new Laptop(model0, cpuO,frequencyO,coreO,ramO,videCardO,hddO,screenO,osO,materialsO,weightO);
        return exempLaptop;
    }

    public static int randGen(){
        int result = new Random().nextInt(0,3);
        return result;
    }

    public  static int generateModel(){
        int result = new Random().nextInt(10001,19999);
        return result;
    }

}
