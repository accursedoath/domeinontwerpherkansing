package model;

import java.util.Scanner;

public class ZwartWit extends PrintOpsturing {
    private ZwartWit(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze) {
        super(gebruiker, hoeveelheid, locatiekeuze);
    }

    public static ZwartWit maakZwartWit(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze) {
        return new ZwartWit(gebruiker, hoeveelheid, locatiekeuze);
    }

    @Override
    public String getOrderline() {
        return "met zwart wit papier";
    }

    @Override
    public double berekenPrijs() {
        return super.getHoeveelheid() * 10;
    }

}
