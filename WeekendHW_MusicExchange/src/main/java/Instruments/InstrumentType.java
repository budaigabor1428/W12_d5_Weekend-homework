package Instruments;

public enum InstrumentType {
    GUITAR("Guitar"),
    DRUM("Drum"),
    BASSGUITAR("Bass Guitar");

    private final String value;

    InstrumentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
