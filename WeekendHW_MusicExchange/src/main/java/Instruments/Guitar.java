package Instruments;

import Accessories.GuitarString;
import Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay{

    private int numberOfStrings;
    GuitarString guitarString;

    public Guitar(String type, String brand, String model, String colour, String serialNumber, double unitCost, double salesPrice, int numberOfStrings, GuitarString guitarString) {

        super(type, brand, model, colour, serialNumber, unitCost, salesPrice);
        this.guitarString = guitarString;

        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String makesSound() {
        return "Guitar sound!";
    }

}
