package Seminar_6_HomeWork_task_1;

public class Laptop {
    final int model;
    final String cpu;
    final String frequency;
    final String core;
    final String ram;
    final String videCard;
    final String hdd;
    final String screen;
    final String os;
    final String materials;
    final String weight;

    public Laptop(int model ,String cpu, String frequency, String core, String ram, String videCard, String hdd,  String screen, String os, String materials, String weight){
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
