package Seminar_6_HomeWork_task_1;

import java.util.SplittableRandom;

public class Laptop {
    private int model;
    private String cpu;
    private float frequency;
    private  int core;
    private int ram;
    private String videCard;
    private int hdd;
    private String screen;
    private String os;
    private String materials;
    private float weight;

    public Laptop(int model ,String cpu, float frequency, int core, int ram, String videCard, int hdd,  String screen, String os, String materials, float weight){
        this.model = model;
        this.cpu = cpu;
        this.frequency = frequency;
        this.core = core;
        this.ram = ram;
        this.hdd = hdd;
        this.videCard = videCard;
        this.screen = screen;
        this.os = os;
        this.materials = materials;
        this.weight = weight;
    }
    public String info() {
        return
                "Laptop:\n" +
                "  Model: " + model + "\n" +
                "  cpu: " + cpu + "\n" +
                "  frequency: " + frequency +"MHz\n" +
                "  cores: " + core + "\n" +
                "  RAM: " + ram + "GB\n" +
                "  HDD: " + hdd + "GB\n" +
                "  Vide Card: " + videCard + "\n" +
                "  Screen: " + screen + "\n" +
                "  Operation System: " + os + "\n" +
                "  Materials: " + materials + "\n" +
                "  Weight: " + weight + " kilogram\n";
    }
}
