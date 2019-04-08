package Instruments;

import Accessories.Cymbal;
import Interfaces.IPlay;

import java.util.ArrayList;

public class Drum extends Instrument implements IPlay {

    private int numberOfToms;
    private int numberOfCymbals;
    private int numberOfKickDrums;
    private ArrayList<Cymbal> cymbals;

    public Drum(String type, String brand, String model, String colour, String serialNumber, double unitCost, double salesPrice, int numberOfToms, int numberOfCymbals, int numberOfKickDrums) {
        super(type, brand, model, colour, serialNumber, unitCost, salesPrice);
        this.numberOfToms = numberOfToms;
        this.numberOfCymbals = numberOfCymbals;
        this.numberOfKickDrums = numberOfKickDrums;
        this.cymbals = new ArrayList<>();

    }
    
    public String makesSound(){
        return "Drumroll!";
    }

    public int getNumberOfToms() {
        return numberOfToms;
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public int getNumberOfKickDrums() {
        return numberOfKickDrums;
    }

    public void addCymbal(Cymbal cymbal) {
        cymbals.add(cymbal);
    }

    public int getNumberOfAdditionalCymbals() {
        return cymbals.size();
    }
}
