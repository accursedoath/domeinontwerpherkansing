package model;

public class Kleur extends PrintOpsturing{
    private Kleur(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze) {
        super(gebruiker, hoeveelheid, locatiekeuze);
    }

    public static Kleur maakKleur(Gebruiker gebruiker, int hoeveelheid, int locatiekeuze){
        return new Kleur( gebruiker, hoeveelheid, locatiekeuze);
    }

    @Override
    public String getOrderline() {
        return "met kleur papier";
    }

    @Override
    public double berekenPrijs() {
        return super.getHoeveelheid() * 30;
    }
}
