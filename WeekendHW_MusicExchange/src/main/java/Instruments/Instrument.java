package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell{

    private String type;
    private String brand;
    private String model;
    private String colour;
    private String serialNumber;
    private double unitCost;
    private double salesPrice;

    public Instrument (String type, String brand, String model, String colour, String serialNumber, double unitCost, double salesPrice) {

        this.type = type;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.serialNumber = serialNumber;
        this.unitCost = unitCost;
        this.salesPrice = salesPrice;

    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public double calculateMarkup() {
        return getSalesPrice() - getUnitCost();
    }

}
