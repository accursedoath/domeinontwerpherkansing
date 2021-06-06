package model;

public class DHL implements LocatieDetails {
    @Override
    public double berekenExtraPrijs(int hoeveelheid) {
        return (hoeveelheid * 10) + 1000;
    }

    @Override
    public String getLocatieNaam() {
        return "DHL";
    }

}
