package com.company;

public class Main {

    public static void main (String[] args) {


        Case myCase = new Case ("69", "hanz", "1500W", new Dimensions (50, 60, 10));

        Monitor myMonitor = new Monitor ("360hzasrock", "asus", 27, new Resolution (4000, 4000));

        Motherboard myMotherboard = new Motherboard ("asrock6969", "asrock", 8, 6, "69.69v");

        PC myPC = new PC (myCase, myMonitor, myMotherboard);

        myPC.powerUp ();
    }
}
