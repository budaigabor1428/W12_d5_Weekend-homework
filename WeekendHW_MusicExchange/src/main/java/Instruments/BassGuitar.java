package Instruments;

import Accessories.GuitarString;
import Interfaces.IPlay;

public class BassGuitar extends Guitar implements IPlay {

    private int numberOfStrings;
    GuitarString guitarString;

    public BassGuitar(String type, String brand, String model, String colour, String serialNumber, double unitCost, double salesPrice, int numberOfStrings, GuitarString guitarString) {

        super(type, brand, model, colour, serialNumber, unitCost, salesPrice, numberOfStrings, guitarString);

    }

    public String makesSound() {
        return "Broom, broom!";
    }
}
