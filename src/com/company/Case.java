package com.company;

public class Case {
    private String mode;
    private String manufacturer;
    private String psu;
    private Dimensions dimensions;

    public Case (String mode, String manufacturer, String psu, Dimensions dimensions) {
        this.mode = mode;
        this.manufacturer = manufacturer;
        this.psu = psu;
        this.dimensions = dimensions;
    }

    public void powerButton(){
        System.out.println ("Power button is pressed");
    }


    public String getMode () {
        return mode;
    }

    public String getManufacturer () {
        return manufacturer;
    }

    public String getPsu () {
        return psu;
    }

    public Dimensions getDimensions () {
        return dimensions;
    }
}
