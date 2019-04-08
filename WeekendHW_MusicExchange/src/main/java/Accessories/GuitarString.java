package Accessories;

public class GuitarString extends Accessory {

    private int numberOfStrings;

    public GuitarString(String type, String brand, String model, String serialNumber, double unitCost, double salesPrice, int numberOfStrings) {

        super(type, brand, model, serialNumber, unitCost, salesPrice);

        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


}
