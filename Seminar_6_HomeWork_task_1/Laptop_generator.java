package Seminar_6_HomeWork_task_1;

import java.util.Random;

public class Laptop_generator {

    public static void main(String[] args) {

        Laptop exemplyar = createLaptop();
        System.out.println(exemplyar.info());
    }

    static private String[] cpu = new String[] {"INTEL", "AMD", "APPLE" };
    static private float[] frequency = new float[] {3.3f, 3.5f, 4.5f };
    static private int[] core = new int[] {4, 6, 12};
    static private int[] ram = new int[] {4, 8, 16};
    static private String[] videCard = new String[] {"Nvidia GeForce RTX 3080","GeForce GT 415","Radeon HD 4225"};
    static private int[] hdd = new int[] {120, 250, 920};
    static private String[] screen = new String[] {"OLED","IPS","LED"};
    static private String[] os = new String[] {"Windows","Linux","MacOs"};
    static private String[] materials = new String[] {"Plastic","Metal","Hybrid"};
    static private float[] weight = new float[] {1.2f, 2.1f, 3.6f};

    public static Laptop createLaptop (){
        String cpuO = cpu[randGen()];
        float frequencyO = frequency[randGen()];
        int coreO = core[randGen()];
        int ramO = ram[randGen()];
        String videCardO = videCard[randGen()];
        int hddO = hdd[randGen()];
        String screenO = screen[randGen()];
        String osO = os[randGen()];
        String materialsO = materials[randGen()];
        float weightO = weight[randGen()];
        Laptop exempLaptop = new Laptop(cpuO,frequencyO,coreO,ramO,videCardO,hddO,screenO,osO,materialsO,weightO);
        return exempLaptop;
    }

    public static int randGen(){
        int result = new Random().nextInt(0,2);
        return result;
    }

}
