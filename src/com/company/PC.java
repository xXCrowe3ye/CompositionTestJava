package com.company;

public class PC {
    private Case myCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC (Case myCase, Monitor monitor, Motherboard motherboard) {
        this.myCase = myCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp(){
        getMyCase ().powerButton ();
        bootAnimation ();

    }


    public void bootAnimation(){
        getMonitor ().drawPixel (66,25,"green");
    }

    private Case getMyCase () {
        return myCase;
    }

    private Monitor getMonitor () {
        return monitor;
    }

    private Motherboard getMotherboard () {
        return motherboard;
    }
}
